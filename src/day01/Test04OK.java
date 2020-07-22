package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 *
 * @author Bonnie
 */
public class Test04OK {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入您的邮箱：");
        String str1 = console.nextLine();
        int index = str1.indexOf('@');
        if (index != -1) {
            String str2 = str1.substring(0, index);
            System.out.println("用户名是：" + str2);
        } else {
            System.out.println("您输入的电子邮箱的格式有误！");
            System.exit(0);
        }
    }
}
