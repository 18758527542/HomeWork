package day04OK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 *
 * @author Bonnie
 */
public class Test07OK {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100 + 1));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}