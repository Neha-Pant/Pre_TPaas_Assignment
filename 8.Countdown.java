package pkg8.countdown;

import java.util.Scanner;

public class Countdown 
{
    public static void main(String[] args) throws InterruptedException 
    {
        int n,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=sc.nextInt();
        System.out.println("Enter the milliseconds to sleep : ");
        a=sc.nextInt();
        while(n>=0)
        {
            System.out.println("Count : "+n);
            Thread.sleep(a);
            n--;
        }
        
    }
    
}
