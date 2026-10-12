abstract class Demo
{
    public int i,j;
    
    public int add(int a,int b)         // Concrete method
    {
        return a+b;
    }

    
}

class abstract_Demo 
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
    }
}
