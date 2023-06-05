import java.util.Scanner;

public class calculator {
    

    public static void main(String[]main) {

        Scanner obj = new Scanner(System.in);
        int n1,n2,ch,cal;
        n1= obj.nextInt();
        n2=obj.nextInt();
        ch=obj.nextInt();
        if(ch==1){
            cal=n1+n2;
            System.out.println("addition"+cal);

        }else if(ch==2){
            cal =n1*n2;
            System.out.println("multiplication"+cal);
        }else if(ch==3){
            cal=n1-n2;
            System.out.println("subtraction"+cal);

        }else if(ch==4){
            cal=n1/n2;
            System.out.println("division"+cal);
        }else{
            cal=n1%n2;
            System.out.println("remainder"+cal);
        }
        
    }
}
