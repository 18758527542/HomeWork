package day02OK;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 *
 * @author Bonnie
 */
public class Test06OK {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入电话号码：");
        String string = console.nextLine();
        String check = "^(\\d{7,8})|(\\d{3,4}[-]\\d{7,8})$";
        if (string.matches(check)) {
            System.out.println("电话格式正确！");
        } else {
            System.out.println("电话格式错误！");
        }
    }
}
