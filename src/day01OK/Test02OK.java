package day01OK;

/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 *
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02OK {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("大家好！");
        sb.append("我是程序员！");
        System.out.println(sb);
        sb.insert(6, "优秀的");
        System.out.println(sb);
        sb.replace(6, 8, "牛牛");
        System.out.println(sb);
        sb.delete(0, 4);
        System.out.println(sb);
    }
}
