import java.util.Scanner;

public class three {
    public static void main(String[]args) {
        int age1,age2,age3;
        Scanner ab =new Scanner(System.in);
        System.out.println("enter the age of first person");
        age1 =ab.nextInt();
        System.out.println("enter the age of second person");
        age2 =ab.nextInt();
        System.out.println("enter the age of  third person");
        age3 =ab.nextInt();
         if(age1>age2 && age1>age3){
            System.out.println("first person is the oldest");

         }
         else if(age2>age1 && age2>age3){
            System.out.println("second person is the oldest");
         }
         else if(age3>age1 && age3>age2){
            System.out.println("third person is the oldest");
         }else{
            System.out.println("all have equal age ");
            System.exit(0);
         }
         if(age1<age2 && age1<age3){
            System.out.println("first person is the youngest");
         }
         else if(age2<age1 && age2<age3){
            System.out.println("second person is the youngest");
         }
         else if(age3<age1 && age3<age2){
            System.out.println("third person is the youngest");
         }
        
            ab.close();
        
    }
}
