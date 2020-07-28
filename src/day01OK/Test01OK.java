package day01OK;

/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 *
 * @author Bonnie
 */
public class Test01OK {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "  Hello   ";
        test1(str1);
        test2(str1);
        test3(str1);
        test4(str1);
        test5(str1);
        test6(str2);
        test7(str1);
        test8(str1);
        test9(str1);
    }

    /**
     * 以当前方法为例，下面继续编写test2,test3...等方法。
     * 每个方法中实现类描述中的一个需求。
     * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
     * <p>
     * test2实现:2:输出"HelloWorld"中"o"的位置
     * 以此类推。
     */
    public static void test1(String str) {
        System.out.println(str.length());
    }

    public static void test2(String str) {
        int index = str.indexOf('o');
        System.out.println("o的下标是" + index);
    }

    public static void test3(String str) {
        int index = str.indexOf('o', 5);
        System.out.println("o的下标是" + index);
    }

    public static void test4(String str) {
        String string = str.substring(0, 5);
        System.out.println(string);
    }

    public static void test5(String str) {
        String string = str.substring(5);
        System.out.println(string);
    }

    public static void test6(String str) {
        String string = str.trim();
        System.out.println(string);
    }

    public static void test7(String str) {
        System.out.println(str.charAt(5));
    }

    public static void test8(String str) {
        boolean b = str.endsWith("ld") && str.startsWith("H");
        System.out.println(b);
    }

    public static void test9(String str) {
        String string1 = str.toLowerCase();
        String string2 = str.toUpperCase();
        System.out.println(string1);
        System.out.println(string2);
    }
}
