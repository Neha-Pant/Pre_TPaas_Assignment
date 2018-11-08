package pkg11.bankdemo;
class Account
{
    protected String name;
    protected long acno,balance;
}
class Current extends Account
{
    public void display()
    {
        System.out.println("Details\n=============\n");
        System.out.println("Name : "+name);
        System.out.println("\nAccount Number : "+acno);
        System.out.println("\nBalance : "+balance);
    }
    public void checkBalance()
    {
        if(balance<=20000)
        {
            System.out.println("Balance low, penalty of 500 rupees levied on account. Current balance : "+balance);
            balance-=500;
        }
   }
}
class Saving extends Account
{
    public void deposit(long a)
    {
        balance+=a;
    }
    public void compute()
    {
        double interest=balance*0.06;
        balance+=interest;
    }
    public void display()
    {
        System.out.println("Details\n=============\n");
        System.out.println("Name : "+name);
        System.out.println("\nAccount Number : "+acno);
        System.out.println("\nBalance : "+balance);
    }
    public void withdraw(long a)
    {
        if(balance<a)
        {
            System.out.println("Required balance not available in the account !!!");
        }
        else
        {
            balance-=a;
            System.out.println("Collect "+a+" rupees, balance updated !!!");
        }
    }
}
public class BankDemo 
{
    public static void main(String[] args) 
    {
    
    }
    
}
