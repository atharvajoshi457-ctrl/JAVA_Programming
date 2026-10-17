import java.util.Scanner;

class DynamicMemory
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;

        System.out.println("Enter the number of elements :");
        Size = sobj.nextInt();

        // Dynamic Memory allocation
        float Marks[]= new float[Size];

        // use the memory
        

        Marks = null;
        System.gc();

    }
}