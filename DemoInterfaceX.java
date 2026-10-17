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
    public float Area(float Radius)
    {
        return Circle.pi * Radius * Radius;
    }

    public float Circumference(float Radius)
    {
        return 2 * Circle.pi * Radius;
    }
}

class DemoInterfaceX
{
    public static void main(String A[])
    {
        //Circle cobj = new Circle();

        Marvellous mobj = new Marvellous();
        float Ret = 0.0f;

        Ret = mobj.Area(10.5f);
        System.out.println("Area is :"+Ret);

        Ret = mobj.Circumference(10.5f);
        System.out.println("Circumference is :"+Ret);
    }
}