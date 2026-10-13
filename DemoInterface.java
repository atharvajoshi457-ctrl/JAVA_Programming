interface Circle
{
    // Characteristics
    float pi = 3.14f;   // Public Static Final

}

class DemoInterface
{
    public static void main(String A[])
    {
        System.out.println(Circle.pi);
        Circle.pi = 7.14;               // Error Due to Final
    }
}