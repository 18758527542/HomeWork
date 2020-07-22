package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 * @author Bonnie
 */
public class Test05 {
    public static void main(String[] args) {
        String str1 = null;
        for (int i = 0; i < 5; i++) {
            //char=(char) (Math.random() * 26 + 97);
            str1 += 'a';
        }
        Scanner console = new Scanner(System.in);
        String str2 = console.nextLine();
    }
}
