public class Main
{
    static int fibonacci(int n)
    {
        if(n > 0)
            return fibonacci(n-1) * n;
        return 1;
    }

    public static void main(String[] args)
    {
        int res = fibonacci(3);
        System.out.println(res);
    }
}
