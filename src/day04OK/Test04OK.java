package day04OK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 *
 * @author Bonnie
 */
public class Test04OK {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }
        List<Integer> list1 = list.subList(3, 7);
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) * 10);
        }
        System.out.println(list1);
        System.out.println("原集合:" + list);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 8, 9));
        list.remove(list2);
    }
}
