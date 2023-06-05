import java.util.Scanner;

public class condition_else if {
    

    public static void name(String[]args) {
int marks;
System.out.println("enter marks");
Scanner obj=new Scanner(System.in);
marks=obj.nextInt();



        if(marks>=60 && marks<=100){
            System.out.println("student is brilliant");

            else if(marks>=45 && marks<=60){
                System.out.println("student is average");
                 

                else if(marks>=33 && marks<=45){
                    System.out.println("student is fail");

                    

                        
                
                }
            }
        }
        
    }
}
