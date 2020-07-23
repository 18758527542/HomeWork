package day02;

import java.util.Date;
import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 *
 * @author Bonnie
 */
public class Test05OK {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入一个文件名：");
        String string = console.nextLine();
        String check = "^\\w+\\.\\w+$";
        if (!string.matches(check)) {
            System.out.println("您输入的文件名格式有误！");
            System.exit(0);
        }
        Date date = new Date();
        String time = String.valueOf(date.getTime());
        String string1 = string.replaceFirst("\\w+", time);
        System.out.println(string1);
    }
}
