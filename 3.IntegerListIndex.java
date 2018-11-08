package integerlistindex;
import static java.lang.Math.random;
import java.util.Scanner;
public class IntegerListIndex 
{
    public static void main(String[] args) 
    {
        int []list=new int[10];
        for(int i=0;i<list.length;i++)
        {
            list[i]=(int)(random()*100);
            System.out.println(list[i]);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be searched : ");
        int num=sc.nextInt();
        int f=0;
        for(int i=0;i<list.length;i++)
        {
            if(num==list[i])
            {
                System.out.println("Element found at index "+i);
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.println("Element not found in the list !!!");
    }
    
}
