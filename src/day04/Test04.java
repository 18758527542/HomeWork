package day04;

import java.util.ArrayList;
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
public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            arrayList.add(i);
        }
        List<Integer> list = arrayList.subList(3, 7);
        System.out.println(arrayList);
        System.out.println(list);
    }
}
