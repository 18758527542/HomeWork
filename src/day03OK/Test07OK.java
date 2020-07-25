package day03OK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 *
 * @author Bonnie
 */
public class Test07OK {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String check = "^.+[,]\\d+[,][男女][,]\\d+[,]\\d{4}[-]\\d{1,2}[-]\\d{1,2}$";
        List<Emp> people = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print("请输入员工的数量:");
        int num = console.nextInt();
        loop:
        for (int i = 0; i < num; i++) {
            System.out.print("请输入第" + (i + 1) + "个员工的个人信息:");
            String string = console.next();
            if (!string.matches(check)) {
                System.out.println("您输入的信息不符合标准！");
                i--;
                continue;
            }
            String[] strings = string.split(",");
            String name = strings[0];
            int age = Integer.parseInt(strings[1]);
            String gender = strings[2];
            int salary = Integer.parseInt(strings[3]);
            Date hiredate = sf.parse(strings[4]);
            Emp person = new Emp(name, age, gender, salary, hiredate);
            for (int j = 0; j < i; j++) {
                if (person.equals(people.get(j))) {
                    System.out.println("您输入的员工已经存在!请重新输入!");
                    i--;
                    continue loop;
                }
            }
            people.add(person);
        }
        System.out.println(people);
    }
}
