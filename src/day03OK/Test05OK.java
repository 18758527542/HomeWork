package day03OK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 *
 * @author Bonnie
 */
public class Test05OK {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入您的身份证号码：");
        String string1 = console.nextLine();
        String regex = "^\\d{17}[0-9X]$";
        if (!string1.matches(regex)) {
            System.out.println("您输入的格式错误！");
            System.exit(0);
        }
        String string2 = string1.substring(6, 14);
        System.out.println(string2);
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sf1.parse(string2);
        String string3 = sf2.format(date1);
        System.out.println("出生日期：" + string3);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        calendar.add(Calendar.YEAR, 20);
        Date date2 = calendar.getTime();
        String string4 = sf2.format(date2);
        System.out.println("20岁生日：" + string4);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        Date date3 = calendar.getTime();
        String string5 = sf2.format(date3);
        System.out.println("当周的周三：" + string5);
    }
}
