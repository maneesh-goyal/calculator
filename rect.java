import java.util.Scanner;

public class rect {
     public static void main(String[]args) {

        int length,breath,area;
        System.out.println("enter sides of rectangle");

        Scanner rec=new Scanner(System.in);
        length=rec.nextInt();
        breath=rec.nextInt();
        area=length*breath;
        System.out.println("area of this rectangle is"+area);
        
     }
}
