public class VariableNotice {
    public static void main(String[] args) {
        // 1. 对于同一作用域范围内，变量名不允许重复；
        // 2. 对于long和float类型而言，赋值常量值的后缀L和F不能省略；
        // 3. 对于byte和short类型而言，赋值常量值的范围不能超过变量类型取值范围；
        // 4. 对于没有进行赋值的变量，不能直接使用（先赋值，后使用）；
        // 5. 对于变量的使用范围，不能超过其作用域范围；
        // 6. 可以通过一个语句创建多个变量，但是不推荐；
    }
}
