class A
{
    int a; String name; //instace variable
    A(){
        a=0; name=null;

    }
    void show() 
    {
        System.out.println(a+  "  "+name);

    }
}
class B
 {  // MAKING OBJECT 
    public static void main(String[]args) {
        A ref=new A(); //constructor
        ref.show(); // for calling void show method
        
    }

}