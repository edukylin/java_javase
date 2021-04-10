public class Constant {
    public static void main(String[] args) {
        // 字符串常量；
        System.out.println("Hello,World.");
        System.out.println(""); // 字符串两个引号中间的内容为空；
        System.out.println("Hello,Java.");

        // 整数常量；
        System.out.println("100");
        System.out.println("-99");

        //  浮点常量；
        System.out.println("3.14");
        System.out.println("-2.72");

        //  字符常量（单引号内必须有且只有一个字符）；
        System.out.println('A');
        System.out.println('9');
        // System.out.println('');
        // Error: 空字符文字；
        // System.out.println('99');
        // Error:未结束的字符文字；

        // 布尔常量；
        System.out.println(true);
        System.out.println(false);

        //  空常量（不能用于打印输出）；
        // System.out.println(null);
        // Error:对println的引用不明确
    }
}
