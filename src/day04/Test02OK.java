package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 * 使用迭代器遍历集合，并在过程中删除所有的"$"，
 * 最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 *
 * @author Bonnie
 */
public class Test02OK {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>(Arrays.asList("1", "$", "2", "$", "3", "$", "4"));
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (string.equals("$")) iterator.remove();
        }
        Iterator<String> iterator1 = collection.iterator();
        while (iterator1.hasNext()) {
            String string = iterator1.next();
            System.out.println(string);
        }
    }
}
