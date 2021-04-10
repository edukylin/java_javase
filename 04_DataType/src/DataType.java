// 当数据类型不一致时，将发生数据类型转换：
//  1. 自动类型转换（隐式类型转换）；
//      特点：代码无需特殊处理，自动进行；
//      规则：数据范围从小到大（与字节数无关）；
//  2. 强制类型转换（显示类型转换）；
//      特点：代码必须特殊处理，无法自动进行；
//      格式：（范围小的类型）范围大的数据；
//      注意1：不推荐，因为有可能发生数据溢出或精度损失；
//      注意2：byte/short/char可以进行数学运算，运算前会自动转换为int，然后参与运算；
//      注意3：boolean，不能参与数据类型转换；
public class DataType {
    public static void main(String[] args) {
        System.out.println(1024); // 整数，默认为int；
        System.out.println(3.14); // 浮点，默认为double；
        // 赋值运算符左侧是long类型，右侧是int类型，左右不一致；
        long number1 = 100; // int->long;
        System.out.println(number1);
        double number2 = 3.14F; // float->double;
        System.out.println(number2);
        float number3 = 30L; // long->float（与字节数无关）;
        System.out.println(number3);
        int number4 = (int)100L; // long->int，需要强制类型转换；
        System.out.println(number4);
        int number5 = (int)6000000000L; // long->int，需要强制类型转换；
        System.out.println(number5); // 1705032704，数据溢出；
        int number6 = (int)3.14; // double->int，需要强制类型转换；
        System.out.println(number6); // 3，精度损失；
        int letter1 = 'A';
        System.out.println(letter1+1);
        byte number7 = 60;
        byte number8 = 60;
        byte result = (byte)(number7 + number8);
        System.out.println(result);
    }
}
