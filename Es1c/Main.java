import java.util.Scanner;
public class Main {
 public static void bubbleSort(int[] array){
     for (int i = 0; i < array.length-1; i++) {
        for (int j = 0; j < array.length-1-i; j++){
            if (array[j] > array[j+1]) 
                { 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
  }
        }
 }
  public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; ++i) { 
            int valore = array[i]; 
            int j = i - 1; 
            while (j >= 0 && array[j] > valore) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = valore; 
        } 
  }
 public static void riempire(int[] array){
  Scanner tastiera = new Scanner(System.in);
  for(int i=0;i<array.length;i++){
   System.out.println("inserire array ["+i+"] ");
   array[i]=tastiera.nextInt();
  }
 }
  public static void stampaArray(int[] array){
  for(int i=0;i<array.length;i++){
   System.out.println("array ["+i+"] "+array[i]);
  }
 }
 public static void main (String[] args){
  Scanner tastiera = new Scanner(System.in);
  System.out.println("inserire la lungehzza dell'array ");
  int n = tastiera.nextInt();
  int[] array = new int[n];
  riempire(array);
  bubbleSort(array);
  System.out.println("l'array dopo la bubbleSort ");
  stampaArray(array);
  insertionSort(array);
  System.out.println("l'array dopo la InsertionSort ");
  stampaArray(array);


 }
}