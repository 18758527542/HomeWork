package day02OK;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 *
 * @author Bonnie
 */
public class Test03OK {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入IP地址：");
        String string = console.nextLine();
        String check = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$";
        if (!string.matches(check)) {
            System.out.println("您输入的IP地址格式错误！");
            System.exit(0);
        }
        String regex = "[.]";
        String[] arr = string.split(regex);
        System.out.println(Arrays.toString(arr));
    }
}
