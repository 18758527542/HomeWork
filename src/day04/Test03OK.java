package day04;

import java.util.ArrayList;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 *
 * @author Bonnie
 */
public class Test03OK {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        System.out.println(arrayList.get(1));
        arrayList.set(2,"3");
        arrayList.add(1,"2");
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
