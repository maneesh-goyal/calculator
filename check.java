import java.util.Scanner;

public class check {
    public static void main(String[]argts){
        int length,breadth,rect;
        System.out.println("enter value of sides");
       
        Scanner sc =new Scanner(System.in);
        length=sc.nextInt();
        breadth=sc.nextInt();
        rect=length*breadth;
        
        if(length==breadth){
            System.out.println("it is square"   +rect);
        }
        else{
            System.out.println("it is not square"   +rect);
        }


    }
}
