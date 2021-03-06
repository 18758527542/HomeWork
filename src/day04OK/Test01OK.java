package day04OK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 创建一个集合c1，存放元素"one","two","three"
 * 再创建一个集合c2，存放元素"four","five","six"
 * 然后将c2元素全部存入c1集合
 * 然后在创建集合c3,存放元素"one,five"
 * 然后输出集合c1是否包含集合c3的所有元素
 * 然后将c1集合中的"two"删除后再输出c1集合
 * @author Bonnie
 *
 */
public class Test01OK {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        //System.out.println(c1);
        Collection<String> c2 = new ArrayList<>(Arrays.asList("four", "five", "six"));
        //System.out.println(c2);
        c1.addAll(c2);
        System.out.println(c1);
        Collection<String> c3 = new ArrayList<>(Arrays.asList("one", "five"));
        System.out.println(c1.containsAll(c3));
        c1.remove("two");
        System.out.println(c1);
    }
}




