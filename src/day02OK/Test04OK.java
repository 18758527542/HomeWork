package day02OK;

/**
 * 将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
 *
 * @author Bonnie
 */
public class Test04OK {
    public static void main(String[] args) {
        String string = "123abc456def789ghi";
        String regex = "[a-zA-z]+";
        String newString = string.replaceAll(regex, "#char#");
        System.out.println(newString);
    }
}
