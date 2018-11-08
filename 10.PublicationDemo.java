package pkg10.publication;

import java.util.Scanner;

class Publication
{
    private String title;
    private float price;
    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title : ");
        title=sc.nextLine();
        System.out.println("Enter the price : ");
        price=sc.nextFloat();
    }
    public void putData()
    {
        System.out.println("Title : "+title);
        System.out.println("Price : "+price);
    }
}
class Book extends Publication
{
    private int pagecount;
    public void getData()
    {
        super.getData();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the page count : ");
        pagecount=sc.nextInt();
    }
    public void putData()
    {
        super.putData();
        System.out.println("Page count : "+pagecount);
    }
}
class Tape extends Publication
{
    private float playingtime;
    public void getData()
    {
        super.getData();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the playing time in minutes : ");
        playingtime=sc.nextFloat();
    }
    public void putData()
    {
        super.putData();
        System.out.println("Playing Time in minutes : "+playingtime);
    }
}
public class PublicationDemo
{
    public static void main(String[] args) 
    {
        Book book=new Book();
        Tape tape=new Tape();
        book.getData();
        book.putData();
        tape.getData();
        tape.putData();
    }
    
}
