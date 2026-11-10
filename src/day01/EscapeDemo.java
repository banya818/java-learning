public class EscapeDemo {

    public static void main(String[] args) {

        // \n 换行
        System.out.println("第一行\n第二行");

        // \t 制表符，用来对齐。试试删掉几个 \t 看输出会乱成什么样
        System.out.println("--- 用 \\t 对齐 ---");
        System.out.println("姓名\t年龄\t城市");
        System.out.println("小明\t18\t杭州");
        System.out.println("小红\t19\t南昌");

        // \\ 输出一个反斜杠本身
        System.out.println("--- 输出反斜杠 ---");
        System.out.println("路径: C:\\Users\\java-learning");

        // \" 在字符串里打双引号
        System.out.println("--- 输出双引号 ---");
        System.out.println("他说：\"我会拿到 offer 的\"");

        // \' 单引号
        System.out.println("It\'s ok");
    }
}
