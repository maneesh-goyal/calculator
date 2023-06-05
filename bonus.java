import java.util.Scanner;

public class bonus {
public static void main(String[]args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter employee salary");
    int a = sc.nextInt();
    System.out.println("enter employee service");
    int b = sc.nextInt();
    if(b>5){
        System.out.println("you will get bonus"+(a*0.05)+" rupees");
     } else{
            System.out.println("your service is less than 5 year: sorry");
        }
    
    
}
}
