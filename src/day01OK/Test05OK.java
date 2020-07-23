package day01OK;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 * @author Bonnie
 */
public class Test05OK {
    public static void main(String[] args) {
        String str1 = "";
        for (int i = 0; i < 5; i++) {
            int j = (int) (Math.random() * 2);
            if (j == 0) {
                str1 += (char)('a'+Math.random()*26);
            } else {
                str1 += (char)('A'+Math.random()*26);
            }
        }
        System.out.println(str1);
        Scanner console = new Scanner(System.in);
        String str2 = console.nextLine();
        if (str2.toLowerCase().equals(str1.toLowerCase())){
            System.out.println("验证码输入正确！");
        }else {
            System.out.println("验证码输入错误！");
        }
    }
}
