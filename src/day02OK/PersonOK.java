package day02OK;

import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * 定义全参数(该构造方法的参数用于设置所有属性)构造方法与默认构造方法
 * 重写toString方法，返回字符串格式如:"张三,25,男,5000"
 * 重写equals方法，要求名字相同就认为内容一致。
 *
 * @author Bonnie
 */
public class PersonOK {
    private String name;
    private int age;
    private String gender;
    private int salary;

    PersonOK(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public static void main(String[] args) {
        PersonOK person = new PersonOK("张三", 25, "男", 5000);
        PersonOK person1 = new PersonOK("张三", 21, "女", 4000);
        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person.equals(person1));
    }

    @Override
    public String toString() {
        return name + "," + age + "," + gender + "," + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonOK person = (PersonOK) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, salary);
    }
}