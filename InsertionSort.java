import java.io.*;
import java.util.*;
public class InsertionSort{
 public static void insertion(int[] arr){
    for (int i = 1; i < arr.length; i++){
      int val1 = arr[i];
      int j = i - 1;
      while( j >= 0 && arr[j] > val1){
       arr[j+1] = arr[j];
       j=j-1;
        }
        arr[j+1] = val1;
      }
    }
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    System.out.println("Filename: ");
    String filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    int num = Integer.parseInt(fin.nextLine());
    int[] arr = new int[num];
    for (int i = 0; i < num; i++){
      arr[i] = Integer.parseInt(fin.nextLine());
    }
      insertion(arr);
      System.out.print("Insertion sort: " );
    for (int i = 0; i < arr.length; i++){
      if(i != arr.length -1){
      System.out.print(arr[i] + ", ");
      }
      else{
        System.out.print(arr[i]);
      }
    }
  }
}