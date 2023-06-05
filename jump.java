import java.util.Scanner;

public class jump {
    public static void main(String[]args) {
        System.out.println("enter any number");
        int num;
        Scanner s= new Scanner(System.in);
        num= s.nextInt();

         for(int i=1;i<=100;++i){
        
        
         System.out.println(num+i);
         }
        
    }
}
