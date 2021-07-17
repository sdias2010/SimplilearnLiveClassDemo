class Student1{
    int regno;
    String name;
    static String colzname="IIT";
    public Student1(int regno, String name) {
        
        this.regno = regno;
        this.name = name;
        
    }
    void change(String colzname) {
        this.colzname=colzname;
    }
    
//    void display() {
//        System.out.println(regno+"  "+name+"  "+colzname);
//    }
    
    static void display() {
        System.out.println(colzname);
    }
}
public class Example {
    public static void main(String[] args) {
            Student1 s1=new Student1(101,"kk");
//            s1.change("NIT");
            Student1 s2=new Student1(102,"pp");
            Student1 s3=new Student1(103,"ll");
//            s1.display(); 
//            s2.display();
//            s3.display();
          //when we do s1.display(), this is going to take more time and consume more memory. 
            //So we directly call the method using class name by stating the method as static
            Student1.display(); //
    }

}