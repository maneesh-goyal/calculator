public class person {
    int age=21;
    int weight=75;
    String colour="light";

    void eat(){
        System.out.println("i am eating");
    }
    void sleep(){
        System.out.println(" i am sleeping");
    }
    public static void main(String[]args) {
        person p=new person();
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.colour);
        p.eat(); p.sleep();



        
    }
}
