import java.util.Scanner;

public class rama {
    public static void main(String[]args) {
        int marks;
        System.out.println("enter marks");
        Scanner obj =new Scanner(System.in);
        marks=obj.nextInt();

        if(marks>=60 && marks<=100){
            System.out.println("first devesion");
        }
            else if(marks>=45 && marks<60){
                System.out.println("second devesion");
            }
                else if(marks>=30 && marks<45){
                System.out.println("third devesion");
                }
                else{
                    System.out.println("failed");
                }
        
        
    
    }
}
