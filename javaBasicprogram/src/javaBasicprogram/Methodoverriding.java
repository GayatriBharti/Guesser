package javaBasicprogram;

class Super
{
    void display()
    {  int x=12;
        System.out.println("here i am in super" +x);
    }
}
class Sub extends Super
{
    void display()
    {
        System.out.println("i am in sub class");
    }
}
public class Methodoverriding {
    public static void main(String[] args)
    {
       // Super s1=new Super();
       // Sub s2=new Sub();
       // s1.display();
       
       // s2.display();
        Super s=new Sub();
        s.display();
    }
    
}

