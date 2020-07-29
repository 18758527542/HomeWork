package day09OK;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 *
 * @author Bonnie
 */
public class Test04OK {
    public static void main(String[] args) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Runnable task = new Thread() {
            @Override
            public void run() {
                while (true) {
                    Date date = new Date();
                    String time = sf.format(date);
                    System.out.println(time);
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t1 = new Thread(task);
        t1.start();
    }
}
