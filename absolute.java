import java.util.Scanner;

public class absolute {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("java absolute value.");
        System.out.println("please enter a number");
        double p=sc.nextDouble();
        double b;
        if (p<0) {
            b=-p;

            
        }else{
            b=p;
        }
        System.out.println("absolute of " + p +"is" );
        
    }
}
