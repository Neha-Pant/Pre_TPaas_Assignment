package pkg6.listsort;

import java.util.ArrayList;

class Item
{
private int code,price,qty;
private String name;
public Item(int a,int b,int c,String d)
{
code=a;
price=b;
qty=c;
name=d;
}
    public int getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

public String toString()
{
return "Item code: "+code+" Name : "+name+" Price : "+price+" Quantity : "+qty;
}
}

public class ListSort 
{
    public static void bubbleSort(Item[] list)
    {
        for(int m=0;m<=list.length;m++)
        {
            for(int i=0;i<list.length-1;i++)
            {
                if(list[i].getPrice()>list[i+1].getPrice())
                {
                    Item temp;
                    temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                }
            }
        }
    }
    public static void insertionSort(Item[] list)
    {
         int n = list.length;  
        
        for (int i = 1; i < n; i++)
        {
            Item key = list[i];  
            int j = i-1;  
            
            while ( (j > -1) && ( list [j].getQty() < key.getQty() ) ) 
            {  
                list [j+1] = list [j];  
                j--;  
            }  
            list[j+1] = key;        
        }
    }
    public static void main(String[] args) 
    {
        Item[] list=new Item[5];
        list[0]=new Item(100,250,4,"Marker");
        list[1]=new Item(101,500,10,"Pen");
        list[2]=new Item(102,900,6,"Table");
        list[3]=new Item(103,10,25,"Jelly");
        list[4]=new Item(104,400,12,"Cream");
                
                //ArrayList<Item> list=new ArrayList<>();
        ListSort.bubbleSort(list);
        System.out.println("Data in ascending order of price with bubble sort\n===================\n");
        for(Item a:list)
        {
            System.out.println(a);
        }
        
        ListSort.insertionSort(list);
        System.out.println("\n\nData in descending order of quantity with insertion sort\n===================\n");
        for(Item a:list)
        {
            System.out.println(a);
        }
    }
    
}
