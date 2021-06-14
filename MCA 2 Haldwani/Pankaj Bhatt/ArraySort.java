import java.util.Arrays;   
public class ArraySort  
{   
public static void main(String[] args)   
{   
int array[] = new int [] {15,67,98,76,54,34,19,25};   
Arrays.sort(array);   
System.out.println("Sorted array are: ");   
for (int i = 0; i < array.length; i++)   
{       
System.out.print(" "+array[i]);   
}   
}  
}