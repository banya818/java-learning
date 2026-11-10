public class OverflowDemo {

    public static void main(String[] args) {

        // 实验 1：int 装到上限再加 1 会发生什么？
        int max = Integer.MAX_VALUE;
        System.out.println("int 最大值       : " + max);
        System.out.println("最大值 + 1       : " + (max + 1));
        System.out.println("→ 溢出了，变成负数。这就是为什么不检查边界会出 bug");

        // 实验 2：两个整数相除，小数去哪了？
        System.out.println("--- 整数除法 ---");
        System.out.println("7 / 2     = " + (7 / 2));
        System.out.println("7.0 / 2   = " + (7.0 / 2));
        System.out.println("→ 整数除以整数只能得到整数，小数直接被扔掉");

        // 实验 3：浮点数不精确
        System.out.println("--- 浮点精度 ---");
        System.out.println("0.1 + 0.2      = " + (0.1 + 0.2));
        System.out.println("0.1 + 0.2 == 0.3 ? " + (0.1 + 0.2 == 0.3));
        System.out.println("→ 所以钱不能用 double 算，这是行业铁律");

        // 实验 4：char 和 int 是一家人
        System.out.println("--- char 与 int ---");
        char c = 'A';
        System.out.println("'A' 的编码是 : " + (int) c);
        System.out.println("'A' + 1 变成 : " + (char) (c + 1));
        System.out.println("→ 字符在内存里其实就是数字");
    }
}
