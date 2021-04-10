public class Variable {
    public static void main(String[] args) {
        // 变量声明/定义，语法：
        // 数据类型 变量名；
        int number1;
        // 变量赋值/存储数据，语法：
        // 变量名 = 变量值；
        number1 = 100;
        // 变量打印输出时，打印输出的为变量的值；
        System.out.println(number1);
        // 变量赋值/修改数据，语法：
        // 变量名 = 变量值；
        number1 = 200;
        System.out.println(number1);
        // 变量定义并初始化；
        int number2 = 200;
        System.out.println(number2);
        ///////////////////////////////////////
        byte number3 = 10;
        System.out.println(number3);
        // 注意：变量赋值时，变量值不能超过变量类型的取值范围；
        // 错误：不兼容的类型，从int转换到byte可能会有损失；
        // byte number4 = 256;
        // System.out.println(number4);
        short number5 = 500;
        long number6 = 3000000000L;
        System.out.println(number5);
        System.out.println(number6);
        float number7 = 3.14F;
        System.out.println(number7);
        double number8 = 3.14;
        System.out.println(number8);
        char letter1 = 'A';
        System.out.println(letter1);
        char letter2 = '中';
        System.out.println(letter2);
        boolean isOK = true;
        System.out.println(isOK);
        isOK = false;
        System.out.println(isOK);
        // 将一个变量的数据，赋值给另外一个变量；
        boolean isOkay = isOK;
        System.out.println(isOkay);
    }
}