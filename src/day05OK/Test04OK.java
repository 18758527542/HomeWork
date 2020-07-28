package day05OK;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 创建一个Map，保存某个学生的成绩:
 * 在控制台输入该学生成绩，格式:
 * 科目:成绩;科目:成绩;...
 * 例如:
 * 语文:99;数学:98;英语:97;物理:96;化学:95
 * 然后输出物理的成绩。
 * 然后将化学的成绩设置为96
 * 然后删除英语这一项。
 * 然后遍历该Map分别按照遍历key，Entry，value
 * 的形式输出该Map信息。
 *
 * @author Bonnie
 */
public class Test04OK {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        System.out.print("请输入您各科目的成绩:");
        String string = console.nextLine();
        String[] strings = string.split(";");
        for (int i = 0; i < strings.length; i++) {
            String[] strings1 = strings[i].split(":");
            String key = strings1[0];
            Integer value = Integer.parseInt(strings1[1]);
            map.put(key, value);
        }
        String key1 = "物理";
        Integer physics = map.get(key1);
        System.out.println(key1 + " : " + physics);
        String key2 = "化学";
        map.put(key2, 96);
        map.remove("英语");
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> en : set) {
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
