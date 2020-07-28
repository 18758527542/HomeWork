package day05OK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * <p>
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 *
 * @author Bonnie
 */
public class Test03OK {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工的个人信息:(每个员工用;隔开)");
        String string = console.nextLine();
        String check = "^.+[,]\\d+[,][男女][,]\\d+[,]\\d{4}[-]\\d{1,2}[-]\\d{1,2}$";
        String[] str1 = string.split(";");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        List<Emp> list = new ArrayList<>();
        for (int i = 0; i < str1.length; i++) {
            if (!str1[i].matches(check)) {
                System.out.println("您输入的第" + (i + 1) + "个员工信息不符合规范！");
                continue;
            }
            String[] strings = str1[i].split(",");
            String name = strings[0];
            int age = Integer.parseInt(strings[1]);
            String gender = strings[2];
            int salary = Integer.parseInt(strings[3]);
            Date hiredate = sf.parse(strings[4]);
            Emp person = new Emp(name, age, gender, salary, hiredate);
            list.add(person);
        }
        list.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                long time1 = o1.getHiredate().getTime();
                long time2 = o2.getHiredate().getTime();
                return (int) (time1 - time2);
            }
        });
        System.out.println(list);
    }
}
