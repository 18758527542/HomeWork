package day02OK;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 *
 * @author Bonnie
 */
public class Test08OK {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工的个人信息:(每个员工用;隔开)");
        String string = console.nextLine();
        String check = "^.+[,]\\d+[,].+[,]\\d+$";
        String[] str1 = string.split(";");
        String[][] str2 = new String[str1.length][4];
        for (int i = 0; i < str1.length; i++) {
            if (!str1[i].matches(check)) {
                System.out.println("您输入的信息不符合规范！");
                System.exit(0);
            }
            str2[i] = str1[i].split(",");
        }
        Person[] person = new Person[str1.length];
        for (int i = 0; i < str2.length; i++) {
            person[i] = new Person(str2[i][0], Integer.parseInt(str2[i][1]), str2[i][2], Integer.parseInt(str2[i][3]));
        }
        System.out.println(Arrays.toString(person));
    }
}
