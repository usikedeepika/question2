import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the n");
        n=sc.nextInt();
        String []str=new String[n];
        int[] a=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Strings");
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        System.out.println("Displaying Numbers:");
        for(int i:a)
        {
            System.out.println(i);
        }
        System.out.println("Displaying Strings");
        for(String s:str)
        {
            System.out.println(s);
        }
    }
}