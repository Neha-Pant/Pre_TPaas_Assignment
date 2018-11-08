package employeedemo;

import java.util.Scanner;

class employee
{
    private int eno;
    private long phone;
    private String name,desig,address;
    
    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee's name : ");
        name=sc.nextLine();
        System.out.println("Enter the employee's address : ");
        address=sc.nextLine();
        System.out.println("Enter the employee's designation : ");
        desig=sc.nextLine();
        System.out.println("Enter the employee's phone : ");
        phone=sc.nextLong();
        System.out.println("Enter the employee number : ");
        eno=sc.nextInt();
    }
    public void putData()
    {
        System.out.println("Data of employee:\n");
        System.out.println("ID : "+eno);
        System.out.println("NAME : "+name);
        System.out.println("ADDRESS : "+address);
        System.out.println("DESIGNATION : "+desig);
        System.out.println("PHONE : "+phone);
        System.out.println("Basic");
    }
}
class salary extends employee
{
    private double basic,da,hra,pf,tax,net,gross;
    public void getData1()
    {
        super.getData();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic salary : ");
        basic=sc.nextDouble();
    }
    public void demo()
    {
        System.out.println("Hi");
    }
    public void calculate()
    {
        da=1.15*basic;
        hra=0.5*basic;
        pf=0.12*basic;
        tax=0.05*basic;
        net=basic+da+hra;
        gross=net-pf-tax;
    }
    public void display()
    {
        super.putData();
        System.out.println("Salary Details :");
        System.out.println("\nBASIC : "+basic);
        System.out.println("\nAllowance : ");
        System.out.println("\nDA : "+da);
        System.out.println("\nHRA : "+hra);
        System.out.println("\nDeduction : ");
        System.out.println("\nPF : "+pf);
        System.out.println("\nTAX : "+tax);
        System.out.println("\n===============\nNET SALARY : "+net);
        System.out.println("\nGROSS SALARY : "+gross);
    }
    
}
public class EmployeeDemo 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees : ");
        n=sc.nextInt();
        salary[] s=new salary[n];
        for(int i=0;i<n;i++)
        {
            s[i]=new salary();
            try
            {
                s[i].getData1();
                s[i].calculate();
                s[i].display();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
