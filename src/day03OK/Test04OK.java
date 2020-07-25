package day03OK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 *
 * @author Bonnie
 */
public class Test04OK {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入生产日期：(xxxx-xx-xx):");
        String string1 = console.nextLine();
        System.out.print("请输入保质期(天)：");
        int day = console.nextInt();
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sf1.parse(string1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        calendar.add(Calendar.WEEK_OF_MONTH, -2);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        date = calendar.getTime();
        String string2 = sf1.format(date);
        System.out.println("促销日期为：" + string2);
    }
}
