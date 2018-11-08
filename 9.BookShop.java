package pkg9.bookshop;

import java.util.ArrayList;
import java.util.Scanner;

class Book
{
    private String author,title,publisher;
    private int price,stock;
    public Book(int a,int b,String c,String d,String e)
    {
        price=a;
        stock=b;
        author=c;
        title=d;
        publisher=e;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
    
    public String toString()
    {
        return "Book author : "+author+"\ttitle : "+title+"\tPublisher : "+publisher+"\tPrice : "+price+"\tStock Position : "+stock;
    }
}
public class BookShop 
{
    public static void main(String[] args) 
    {
        ArrayList<Book> list=new ArrayList<>();
        list.add(new Book(4000,5,"APJ Abdul Kalam","Wings On Fire","India Pvt. Ltd."));
        list.add(new Book(600,2,"Durjoy Dutt","How To Stop Time","Pearsons Ltd."));
        list.add(new Book(1000,8,"Stephanie Meyer","Twilight","Tata McGraw Hill"));
        list.add(new Book(1500,3,"Stephanie Meyer","New Moon","Tata McGraw Hill"));
        list.add(new Book(3000,9,"Stephanie Meyer","Eclipse","Tata McGraw Hill"));
        list.add(new Book(8000,4,"Stephanie Meyer","Breaking Dawn","Tata McGraw Hill"));
        list.add(new Book(4000,5,"APJ Abdul Kalam","Wings On Fire","India Pvt. Ltd."));
        list.add(new Book(800,0,"Barry Brey","Microprocessor","India Pvt. Ltd."));
        
        String t,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title for book : ");
        t=sc.nextLine();
        System.out.println("Enter the author for book : ");
        a=sc.nextLine();
        
        for(Book b:list)
        {
            if(b.getTitle().equalsIgnoreCase(t) && b.getAuthor().equalsIgnoreCase(a))
            {
                System.out.println("It is available !!!");
                System.out.println("Details of book\n==========================\n"+b);
                System.out.println("Enter the number of copies needed for the book : ");
                int copies;
                Scanner sc1=new Scanner(System.in);
                copies=sc1.nextInt();
                if(b.getStock()>=copies)
                {
                    float total=b.getPrice()*copies;
                    System.out.println("Total price for the copies : "+total);
                    break;
                }
                else
                {
                    System.out.println("Sorry !!! These many copies are not in stock .");
                    break;
                }
            }
            else
            {
                System.out.println("It is not available !!!");
                break;
            }
        }
    }
}
