package day09OK;
/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test03OK {
    public static void main(String[] args) {
        Runnable task1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("你好！");
                }
            }
        };
        Runnable task2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("再见！");
                }
            }
        };
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }
}
