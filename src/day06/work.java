import java.util.Scanner;

public class work{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String gender = sc.next();
        double score = sc.nextDouble();
        if(score > 8.0 ){
            if(gender.equals("M")){
                System.out.println("进入男子组");}
            if(gender.equals("W")){
                System.out.println("进入女子组");}
            System.out.println("进入决赛");
        }
        else{
            System.out.println("淘汰");
        }

    }
}