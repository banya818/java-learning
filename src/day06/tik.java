import java.util.Scanner;

public class tik{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        System.out.println("请输入年龄");
        int yue = sc.nextInt();
        int ages = sc.nextInt();
        int money = 0;
        if(4 <= yue && yue<= 10){
            if(18 <= ages && ages<= 60){
                money += 60;
            } else if(0 < ages && ages< 18){
                money += 30;
            } else if(ages > 60){
                money += 20;
            }
        }
        else {
            if (18 <= ages && ages<= 60) {
                money += 40;
            } else {
                money += 20;
            }
        }
        System.out.println("票价总共" + money + "元");

    }
}