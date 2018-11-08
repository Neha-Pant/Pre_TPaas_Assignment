package pkg7.stringoperations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperations 
{
    public static void main(String[] args) 
    {
        String demo="This is Wat is the array of demo object.";
        String lastchar=demo.substring(demo.length()-4,demo.length());
        String sub=demo.substring(4,8);
        System.out.println("String : "+demo);
        System.out.println("Last four characters of the String : "+lastchar);
        System.out.println("Data from index 4 to 8 of String : "+sub);       
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(demo);
         if (matcher.matches()) 
         {
            System.out.println("String has alphanumeric characters . ");
         }
         else
         {
              System.out.println("String does not have alphanumeric characters . ");
         }
        String trimDemo1= demo.replace(demo.substring(demo.length()-4), "");
        String trimDemo2=demo.substring(4);
        System.out.println("Trimmed string last 4 characters : "+trimDemo1);
        System.out.println("Trimmed string first 4 characters : "+trimDemo2);
        int ind=demo.indexOf("Wa");
        System.out.println("Index of Wa : "+ind);
    
        if (Character.isUpperCase(demo.charAt(0)))
        {
            demo=demo.toLowerCase();
        }
        else
        {
            demo=demo.toUpperCase();
        }
    System.out.println("Data after reversal of case : "+demo);
    
    int i=demo.indexOf(" ");
    char a=demo.charAt(i+1);
    char b=demo.charAt(i+2);
    if(Character.isUpperCase(a) && Character.isLowerCase(b))
            System.out.println("Content is in titlecase .");
    else
            System.out.println("Content is not in titlecase .");
    
    String demoR=demo.replace("a","*");
    System.out.println("Replacing a(s) with * : "+demoR);
    }       
}
