package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 *
 * @author Bonnie
 */
public class Test01OK {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        String string = console.nextLine();
        String regex1 = "^\\d+$";//是不是整数
        String regex2 = "^\\d+\\.+\\d+$";//是不是小数
        boolean b1 = string.matches(regex1);
        boolean b2 = string.matches(regex2);
        if (b1) {
            int a = Integer.valueOf(string);
            System.out.println(a * 10);
        } else if (b2) {
            double b = Double.valueOf(string);
            System.out.println(b * 5);
        } else {
            System.out.println("您输入的不是数字！");
        }
    }
}
