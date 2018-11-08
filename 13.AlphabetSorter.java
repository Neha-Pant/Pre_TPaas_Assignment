package pkg13.alphabetsorter;

import java.util.Scanner;

public class AlphabetSorter 
{
    public static void main(String[] args) 
    {
        String data;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data : ");
        data=sc.nextLine();
        StringBuilder sb=new StringBuilder(20);
        sb.append(data);
        for(int i=0;i<sb.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                char temp;
                if(sb.charAt(i)<sb.charAt(j))
                {
                    temp=sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j,temp);
                }
            }
        }
        System.out.println("New String : "+sb.toString());
    }
    
}
