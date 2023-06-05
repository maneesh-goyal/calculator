import java.util.Scanner;

public class calculator{
public static void main(String[]args) {
    int a,b,c,ch;
    System.out.println("enter two number");
    Scanner s =new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    System.out.println("enter your choice");
    ch=s.nextInt();
    switch(ch){
        case 1:c=a+b;
        System.out.println("addition"+c);break;
        case 2: c=a-b;
        System.out.println("substraction"+c);break;
        case 3:c=a*b;
        System.out.println("multiplication"+c);break;
        case 4: c=a/b;
        System.out.println("division"+c);break;
        case 5 : c=a%b;
        default : System.out.println("invalid choice");break;


    }

    
}
}