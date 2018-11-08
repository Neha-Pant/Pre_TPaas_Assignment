package pkg5.sort;
public class SORT 
{
    public static void selSort(int []arr,int a)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
       
            if(a-1==i)
            {
                System.out.println(a+" iteration for selection sort :");
                for(int n:arr)
                {
                    System.out.print(n+"\t");
                }
                System.out.println("");
            }
        }
       
    }
    public static void bubSort(int []arr,int a)
    {
        int n = arr.length;
        int k;
        for (int m = 0; m <= n; m++) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (arr[i] > arr[k]) {
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
            }
                if(m==(a-1))
            {
                System.out.println(a+" iteration  for bubble sort:");
           for(int ele:arr)
           {
               System.out.print(ele+"\t");
           }
                System.out.println("");
         
            }
        }
    }
    public static void insSort(int []arr,int a)
    {
         int n = arr.length;  
        
        for (int i = 1; i < n; i++)
        {   System.out.println("Sort Pass Number "+(i));
            int key = arr[i];  
            int j = i-1;  
            
            while ( (j > -1) && ( arr [j] > key ) ) 
            {  
            System.out.println("Comparing "+ key  + " and " + arr [j]); 
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = key;        
     if(i==(a))
            {
                System.out.println(a+" iteration  for insertion sort:");
           for(int ele:arr)
           {
               System.out.print(ele+"\t");
           }
                System.out.println("");
   }
        }
   }
    public static void main(String[] args) 
    {
        int arr[]={90,78,20,46,54,1};
            SORT.selSort(arr, 3);
          SORT.bubSort(arr, 4);
          SORT.insSort(arr, 5);
    }
    
}
