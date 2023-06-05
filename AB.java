public class AB {
    int a; String b; boolean c;
    AB() // default construcor
    {
a=100; b="manesh"; c=true;
    }
    void Disp(){
        System.out.println(a+" "+b+" "+c);
    }
}
class b{
   AB r= new AB();
        r.Disp();
}
