vimport java.util.Scanner;

public class factorial {
    public static void main(String[]args) {

        int i;
        int n;
        int f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
    
        
        for(i=1;i<=n;i++){
            f=f*i;
            System.out.println(f);

        }
        
    }
}
