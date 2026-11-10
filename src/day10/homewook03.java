import java.util.Scanner;

public class homewook03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ge = a%10;
        int shi =(a%100)/10;
        int bai =a/100;
        if(a>=100&&a<1000){
            if(a==(int)Math.pow(ge,3)+(int)Math.pow(shi,3)+(int)Math.pow(bai,3)){
                System.out.println("是水仙数");
            }
            else{
                System.out.println("不是水仙数");
            }
        }
        else{
            System.out.println("请输入正确数字");
        }
    }
}