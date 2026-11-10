import java.util.Scanner;

public class break01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 2;i>=0;i--) {
            int mima = sc.nextInt();
            if(mima==666){System.out.println("密码正确");break;}
            else{System.out.println("还有"+ i +"次机会");}

        }
        }
    }