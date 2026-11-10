public class TypesDemo {

    public static void main(String[] args) {

        // ===== 整数型：4 种，区别只在"能装多大的数" =====
        byte b = 100;
        short s = 30000;
        int i = 2000000000;
        long l = 9000000000000000000L;

        System.out.println("byte  = " + b);
        System.out.println("short = " + s);
        System.out.println("int   = " + i);
        System.out.println("long  = " + l);
        System.out.println("--- 四种整数型的极限 ---");
        System.out.println("byte  范围: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short 范围: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int   范围: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long  范围: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        // ===== 浮点型：2 种，float 的字面量必须加 F =====
        float f = 3.14F;
        double d = 3.141592653589793;
        System.out.println("--- 浮点型 ---");
        System.out.println("float  = " + f);
        System.out.println("double = " + d);

        // ===== 布尔型：只有 true / false，不能写 1 或 0 =====
        boolean isStudent = true;
        boolean isRich = false;
        System.out.println("--- 布尔型 ---");
        System.out.println("isStudent = " + isStudent);
        System.out.println("isRich    = " + isRich);

        // ===== 字符型：单个字符，用单引号 =====
        char grade = 'A';
        System.out.println("--- 字符型 ---");
        System.out.println("grade = " + grade);

        // ===== 字符串：String 不是基本类型，是大写的类，用双引号 =====
        String name = "Banya618";
        System.out.println("--- 字符串 ---");
        System.out.println("name = " + name);
    }
}
