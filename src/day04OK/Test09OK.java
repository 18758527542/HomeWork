package day04OK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 *
 * @author Bonnie
 */
public class Test09OK {
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
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Date date = list.get(i).getHiredate();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, 3);
            cal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            date = cal.getTime();
            String string1 = sf.format(date);
            System.out.println(list.get(i).getName() + "的转正时间是" + string1);
        }
    }
}
