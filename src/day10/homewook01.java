import java.util.Scanner;

public class homewook01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double totle = sc.nextDouble();
        double doro = sc.nextDouble();
        int a = 0;
        while(totle>doro){
            totle -= 0.05*totle;
            a++;
            if(totle<=doro){break;}
        }
        while(totle<=doro){
            totle-=1000;
            a++;
            if(totle<1000){break;}
        }
        System.out.println(a);
    }
}