package day09OK;

/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 *
 * @author Bonnie
 */
public class Test01OK {
    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("你好！");
            }
        }
    }

    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("再见！");
            }
        }
    }

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
