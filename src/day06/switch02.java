import java.util.Scanner;

public class switch02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double agreed = sc.nextDouble();

        switch((int)(agreed/60)){
            case 1:
                System.out.println("合格");
                break;
            case 0:
                System.out.println("不合格");
                break;
                default :
                System.out.println("请输入正确成绩");
        }
    }
}