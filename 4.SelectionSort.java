package pkg4.selectionsort;
public class SelectionSort 
{
// public static void selectionSort(String[] arr)
//  {
//      for(String a:arr)
//    {
//        System.out.println("\nIteration\n===============\n");
//        System.out.print(a+"\t");
//    }
//      
//    for (int i = 0; i < arr.length - 1; ++i)
//    {
//      int minIndex = i;
//      for (int j = i + 1; j < arr.length; ++j)
//      {
//        // "<" changed to use of compareTo()
//        if (arr[j].compareTo(arr[minIndex]) < 0)
//        {
//          minIndex = j;
//        }
//      }
//      
//      // int changed to String
//      String temp = arr[i];
//      arr[i] = arr[minIndex];
//      arr[minIndex] = temp;
//    }
//  }
    
    public static void sort(String[] arr) {
  for (int i=0; i<arr.length-1; i++) {
     for (int j=i+1; j<arr.length; j++) {
        if (arr[i].compareTo(arr[j]) > 0) {
           String temp=arr[j]; arr[j]=arr[i]; arr[i]=temp;
        }
     }
      System.out.println("\nIteration "+(i+1)+":");
      for(String a:arr)
      {
          System.out.print(a+"\t");
      }
      System.out.println("");
  }
}
public static void main(String[] args) 
{
    String arr[]={"Neena","Meeta","Geeta","Reeta","Seeta"};
//    SelectionSort.selectionSort(arr);
    SelectionSort.sort(arr);
    }
    
}
