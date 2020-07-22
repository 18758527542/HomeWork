package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 *
 * @author Bonnie
 */
public class Test03OK {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入你的生日(xxxx-xx-xx):");
        String string = console.nextLine();
        Date nowDate = new Date();
        long nowTime = nowDate.getTime();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sf.parse(string);
        long birthTime = birthday.getTime();
        int weeks = (int) ((nowTime - birthTime) / (1000l * 60 * 60 * 24 * 7));
        System.out.println(weeks);
    }
}
