package day05OK;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 *
 * @author Bonnie
 */
public class Test05OK {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String s = "销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice";
        String[] strings = s.split(";");
        for (int i = 0; i < strings.length; i++) {
            String[] str = strings[i].split(":");
            if (!map.containsKey(str[0])) {
                map.put(str[0], 1);
            } else {
                Integer integer = map.get(str[0]);
                integer++;
                map.put(str[0], integer);
            }
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> en : set) {
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
