import java.util.Scanner;

public class switch01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入(a-e)的字符");
        char xiaoxie = sc.next().charAt(0);
        switch(xiaoxie){
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
        }
    }
        }