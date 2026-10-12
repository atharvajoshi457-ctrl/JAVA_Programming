abstract class Demo
{
    public int i,j;
    
    public int add(int a,int b)         // Concrete method
    {
        return a+b;
    }

    public abstract int Sub (int a,int b);
}

class Hello extends Demo
{

}

class abstract_DemoX
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
    }
}
