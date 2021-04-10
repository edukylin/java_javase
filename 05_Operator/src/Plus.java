// 四则运算当中的加号，有三种用法；
// 1. 数值类型，表示常规加法运算；
// 2. 字符类型，运算前会自动转换为数值运算，然后参与常规加法运算；
// 3. 字符串类型（String，非关键字），表示字符串连接运算；
//
//
public class Plus {
    public static void main(String[] args) {
        System.out.println("Hello"+"World");
        System.out.println("Result:"+100);
        System.out.println("Result:"+100+200);
        System.out.println("Result:"+(100+200));
    }
}
