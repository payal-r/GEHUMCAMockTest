import java.util.Arrays;   
// Garima Bisht 20712004 Sem-2 Haldwani Campus
public class SortArray  
{   
public static void main(String[] args)   
{   
int [] array = new int [] {30, 23, 1, 113, 12, 22, 37, 34};   
Arrays.sort(array);   
System.out.println("Elements of array sorted : ");   
for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}