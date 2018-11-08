package railwaydemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Train
{
    private int tno;
    private String name,sst,dst;
    private Date dt,at;
       
    public void getdata()
    {
        dt=new Date();
        at=new Date();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name : ");
        name=sc.nextLine();
        System.out.println("Enter the source station : ");
        sst=sc.nextLine();
        System.out.println("Enter the destination station : ");
        dst=sc.nextLine();
        System.out.println("Enter the departure time hour : ");
        dt.setHours(sc.nextInt());
        System.out.println("Enter the departure time minutes : ");
        dt.setMinutes(sc.nextInt());
        System.out.println("Enter the arrival time hour : ");
        at.setHours(sc.nextInt());
        System.out.println("Enter the arrival time minutes : ");
        at.setMinutes(sc.nextInt());
        System.out.println("Enter the train number : ");
        tno=sc.nextInt();
    }
    public void putdata()
    {
        System.out.println("Train Details\n==================\n");
        System.out.println("Number : "+tno);
        System.out.println("\nName : "+name);
        System.out.println("\nDeparture Time : "+dt);
        System.out.println("\nArrival Time : "+at);
        System.out.println("\nSource Station : "+sst);
        System.out.println("\nDestination Station : "+dst);
    }
    public int getTno()
    {
        return tno;
    }
    public Train search(ArrayList<Train> list)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the serial number : ");
        int sn=sc.nextInt();
        Train ob=null;
        for(Train t:list)
        {
            if(t.getTno()==sn)
            {
                ob=t;
                break;
            }
        }
        if(ob!=null)
            return ob; 
        return ob;
    }
}
class Passenger extends Train
{
    private int tiNo,pnr,age,tno;
    private long phone;
    private String name,gender,address;
    public void getData1(ArrayList<Train> list)
    {
        Train ob=super.search(list);
        ob.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name : ");
        name=sc.nextLine();
        System.out.println("Enter the gender : ");
        gender=sc.nextLine();
        System.out.println("Enter the address : ");
        address=sc.nextLine();
        System.out.println("Enter the phone : ");
        phone=sc.nextLong();
        System.out.println("Enter the ticket number : ");
        tiNo=sc.nextInt();
        System.out.println("Enter the PNR : ");
        pnr=sc.nextInt();
    }
    public void display()
    {
        super.putdata();
        System.out.println("Passenger's Data :\n");
        System.out.println("Ticket Number : "+tiNo);
        System.out.println("\nPNR : "+pnr);
        System.out.println("\nAge : "+age);
        System.out.println("\nName : "+name);
        System.out.println("\nGender : "+gender);
        System.out.println("\nAddress : "+address);
    }
}
public class RailwayDemo 
{
    public static void main(String[] args) 
    {
        int t,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of trains : ");
        t=sc.nextInt();
 ArrayList<Train> list=new ArrayList<Train>(t);
        for(int i=0;i<t;i++)
        {
            Train ob=new Train();
            ob.getdata();
            list.add(ob);
        }
    
        System.out.println("Enter the number of passengers : ");
        p=sc.nextInt();
        //Train[] trains=new Train[t];
        Passenger[] passengers=new Passenger[p];
        for(int i=0;i<p;i++)
        {
            passengers[i]=new Passenger();
            passengers[i].getData1(list);
            passengers[i].display();
        }
    }
    
}
