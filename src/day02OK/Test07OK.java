package day02OK;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 *
 * @author Bonnie
 */
public class Test07OK {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个数学计算表达式：");
        String string = console.nextLine();
        String check = "^\\d+([.]\\d*)?[-+*/]\\d+([.]\\d*)?$";
        String regex = "[-+*/]";
        if (!string.matches(check)) {
            System.out.println("您输入的数学计算表达式不符合规范");
            System.exit(0);
        }
        String[] str = string.split(regex);
        double[] double1 = new double[2];
        for (int i = 0; i < str.length; i++) {
            double1[i] = Double.parseDouble(String.valueOf(str[i]));
        }
        double num = 0;
        if (string.contains("+")) {
            num = double1[0] + double1[1];
        } else if (string.contains("-")) {
            num = double1[0] - double1[1];
        } else if (string.contains("*")) {
            num = double1[0] * double1[1];
        } else {
            num = double1[0] / double1[1];
        }
        System.out.println(string + " = " + num);
    }
}
