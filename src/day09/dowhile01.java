import java.util.Scanner;

public class dowhile01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ceng = 1 ;
        int zongceng = sc.nextInt();
        for(;ceng<=zongceng;ceng++){
            int k = 1;
            for(;k<=zongceng-ceng;k++){
            System.out.print(" ");}
            int j= 1;
            while(j<=2*ceng-1){
                if(ceng==zongceng||j==1||j==2*ceng-1){
                System.out.print("*");}
                else{System.out.print(" ");}

            j++;}
            System.out.print("\n");
        }
    }
}