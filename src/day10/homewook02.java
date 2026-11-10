import java.util.Scanner;

public class homewook02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2;
          if(a<0){
          b=-1;}
          if(a>0){
          b=1;}
          if(a==0){
          b=0;}
          switch(b){
              case 1 :System.out.println("大于0");break;
              case -1 :System.out.println("小于0");break;
              case 0 :System.out.println("等于0");break;
              default: System.out.println("请输入数字");
          }
    }
}