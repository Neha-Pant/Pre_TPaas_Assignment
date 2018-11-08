package pkg12.maximaminima;

import java.util.Scanner;

public class MaximaMinima 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int minima,maxima;
        int c=0;
        System.out.println("Enter minima : ");
        minima=sc.nextInt();
        System.out.println("Enter mixima : ");
        maxima=sc.nextInt();
        if(maxima<minima)
        {
            System.out.println("Incorrect order, minima should be less than equal to maxima.");
        }
        else
        {
            for(int i=minima;i<=maxima;i++)
            {
                String temp;
                temp=Integer.toString(i);
                for(int l=0;l<temp.length();l++)
                {
                    char c1=temp.charAt(l);
                    if(c1=='1')
                    {
                        c++;
                    }
                }
            }
            System.out.println("Count : "+c);
        }
        
    }
    
}
