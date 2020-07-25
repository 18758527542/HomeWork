package day03OK;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 *
 * @author Bonnie
 */
public class Test02OK {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String string = sf.format(date);
        System.out.println(string);
    }
}
