import java.util.Scanner;

public class circle {
    public static void main(String[]args) {

       final Double pi=3.14,area;
       int r;
       System.out.println("enter radius of the circle");
       Scanner cir=new Scanner(System.in);
       r=cir.nextInt();
       area= pi*r*r;
       System.out.println("area of circle is"+area);
        
    }
    
}
