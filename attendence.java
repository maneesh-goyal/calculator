import java.util.Scanner;

public class attendence {
    public static void main(String[]args) {
    
        Scanner sc= new Scanner(System.in);
        System.out.println("enter total class held");
        int a =sc.nextInt();
        System.out.println("enter classes attended by the student");
        int b =sc.nextInt();
        float p= (b/a)*100;
        
        if(p<75){
            System.out.println("your attendence percentage is low ,you are not allow");

        }
    
        
    else{
        
        System.out.println("you are allowd to sit in the exam");
    }
    

        
    }
}
