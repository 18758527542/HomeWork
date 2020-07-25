package day04OK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 *
 * @author Bonnie
 */
public class Test08OK {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        List<Date> dates = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入第" + (i + 1) + "个日期(yyyy-MM-dd格式):");
            strings.add(console.next());
            if (strings.get(i).matches("^\\d{4}[-]\\d{1,2}[-]\\d{1,2}$")) {
                dates.add(sf.parse(strings.get(i)));
            } else {
                strings.remove(i);
                System.out.println("输入日期格式错误，请重新输入！");
                i--;
                continue;
            }
        }
        Collections.sort(dates);
        for (int i = 0; i < dates.size(); i++) {
            strings.set(i, sf.format(dates.get(i)));
        }
        System.out.println(strings);
    }
}
