// 数字和字符的对照关系表（编码表）；
// ASCII码表：American Standard Code for Information Interchange，美国信息交换标准编码；
// Unicode码表：万国码，0~127与ASCII一致，128开始包含更多字符（中文、日文、德文、甚至Emoji）；
// 常用编码：A[65]，a[97]，0[48];

public class DataTypeChar {
    public static void main(String[] args) {
        char letter1 = '1';
        System.out.println(letter1+0);
        int number1 = letter1; // char->int，自动类型转换；
        System.out.println(number1);
        char letter2 = '中';
        System.out.println(letter2+0); // 20013；
    }
}
