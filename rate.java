import java.util.Scanner;

public class rate {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter price");
        int price=sc.nextInt();
        System.out.println("enter quantity");
        int quantity=sc.nextInt();
        int total_cost=quantity*price;
        int discount= (total_cost/100)*10;
        int net_amount=total_cost-discount;
        
        System.out.println("price of one item="+price);
        System.out.println("price of "+quantity+" items="+total_cost);
        System.out.println("10% discount on"+total_cost+"="+discount);
        System.out.println("net amount to be paid= "+total_cost+" - "+discount+"= "+net_amount);

        
    }
}
