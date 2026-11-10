import java.util.Scanner;

public class while01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        double num123 = 0.0;
        int pass = 0;
        for(;min<=max;min++){
            double num = 0.0;
            for(int ren = 1;ren<=c;ren++) {
                double chengji = sc.nextDouble();
                if(chengji>=60){
                    pass++;
                }
                num += chengji;
            }
            System.out.println(min+"班的平均成绩是"+num/c);
            num123 +=num;
        }
        System.out.println(num123/((b-a+1)*c));
        System.out.println(pass);
    }
}