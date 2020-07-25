package day03OK;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 * @author Bonnie
 */
public class Test01OK {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        time += 3l * 24 * 60 * 60 * 1000;
        date.setTime(time);
        System.out.println(date);
    }
}
