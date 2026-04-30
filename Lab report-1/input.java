import java.util.Scanner;

public class user_input 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Your input is " + x);

        sc.close();
    }
}
