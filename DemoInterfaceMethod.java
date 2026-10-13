interface Circle
{
    // Characteristics
    float pi = 3.14f;   // (Public Static Final)

    // Behaviours       // (Public Adstract)
    float Area(float Radius);

    float Circumference(float Radius);
}

class Marvellous implements Circle
{
    // Error Due to missing body of area and circumference
}

class DemoInterfaceMethod
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
    }
}