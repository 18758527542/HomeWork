package day03OK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 *
 * @author Bonnie
 */
public class Test06OK {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(collection.size());
        System.out.println("集合是否包含字符串\"four\" " + collection.contains("four"));
        System.out.println("集合是否不含有任何元素 " + collection.isEmpty());
        collection.clear();
        System.out.println(collection.size());
        System.out.println("集合是否不含有任何元素 " + collection.isEmpty());
    }
}
