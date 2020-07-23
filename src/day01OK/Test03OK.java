package day01OK;

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
     */
    public static void check(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("您输入的字符串是回文！");
        } else {
            System.out.println("不是！");
        }
    }
}
