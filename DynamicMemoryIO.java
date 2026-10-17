import java.util.Scanner;

class DynamicMemoryIO
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;
        int i = 0;

        System.out.println("Enter the number of elements :");
        Size = sobj.nextInt();

        // Dynamic Memory allocation
        float Marks[]= new float[Size];

        // use the memory
        System.out.println("Enter your Marks :");
        for(i = 0;i < Size;i++)
        {
            Marks[i]=sobj.nextFloat();
        }

        System.out.println("Entered Marks are : ");
        for(i = 0;i < Size;i++)
        {
            System.out.println(Marks[i]);
        }

        Marks = null;
        System.gc();

    }
}