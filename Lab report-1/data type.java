import java.util.Scanner;

public class data_type 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double d = sc.nextDouble();
        float f = sc.nextFloat();
        char c = sc.next().charAt(0);
        String s = sc.nextLine();

        System.out.println("int :" + n);
        System.out.println("double :" + d);
        System.out.println("float :" + f);
        System.out.println("char :" + c);
        System.out.println("string :" + s);

        sc.close();
    }
}
