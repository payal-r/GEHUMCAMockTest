
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class Sorting{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of array");
int size = sc.nextInt();
int[] arr = new int[size];
System.out.println("Enter Elements of the array");

for(int i=0;i<size;i++){
arr[i] = sc.nextInt();
}

Arrays.sort(arr);
System.out.println("Sorted array is: ");
for(int i=0;i<size;i++){
 System.out.println(arr[i]);
}


}

}
