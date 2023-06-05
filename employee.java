public class employee {
    String name;
    int age;
    double salary;
    void setDetail(String name,int age,double salary){
        this.name =name;
        this.age = age;
        this .salary= salary;

    }
    public class test{
        public static void main(String[]s) {
            employee e1 =new employee();
            employee e2=new employee();
            e1.setDetail();
            e2.setDetail("hello",23,767788);


            
        }
    }
}
