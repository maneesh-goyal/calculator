import java.util.Scanner;

public class for_loop{
    public static void main(String[]args) {
        int num,i;
        System.out.println("enter any number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(num*i);
        }

        
    }
}
