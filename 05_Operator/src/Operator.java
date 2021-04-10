// 运算符：进行特定操作的符号；
// 表达式：由运算符连接而成的式子；
// 四则运算：+、-、*、/；
// 取模运算：%（整数除法才有意义）；
// 注意1：不同类型的数据参与运算，结果类型将是数据范围更大的数据类型；

public class Operator {
    public static void main(String[] args) {
        // 两个常量之间可以进行算数运算；
        System.out.println(10+20);
        // 两个变量之间可以进行算数运算；
        int num1 = 10, num2 = 20;
        System.out.println(num1-num2);
        // 变量常量之间可以进行算数运算；
        System.out.println(num1*10);
        // 除法特殊性：商值、余数；
        System.out.println(103/10);
        System.out.println(103%10);
    }

}
