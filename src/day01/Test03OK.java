package day01;

import java.util.Scanner;

/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 *
 * @author Bonnie
 */
public class Test03OK {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String string = console.nextLine();
        check(string);
        /*
         * 编写一个回文字符串，然后调用check方法检查
         * 该字符串是否为回文，然后输出检查结果。
         * 若是回文则输出:是回文
         * 否则输出:不是回文
         */
    }

    /**
     * 判读该方法是否是回文
     *
     * @param str 需要判断的字符串
     * @return true表示是回文，false表示不是回文
     */
    public static boolean check(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            char char1 = str.charAt(i);
            char char2 = str.charAt(str.length() - 1 - i);
            if (char1 != char2) {
                System.out.println("该字符串不是回文！");
                return false;
            }
        }
        System.out.println("该字符串是回文！");
        return true;
    }
}
