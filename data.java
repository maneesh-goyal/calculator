import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class data{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
       int button =sc.nextInt();
      

       switch(button){
        case 1:System.out.println("hello");
        break;
        case 2:System.out.println("namasety");
        break;
        case 3: System.out.println("hi");
        default: System.out.println("invalid");
       }
    }
}

        