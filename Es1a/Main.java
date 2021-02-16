import java.util.Scanner;
public class Main {
 // Metodo bisestile
 public static boolean bisestile(int anno){
  boolean b=false;
  if(anno%400 == 0)
   b=true;
  else if((anno%4 == 0)&&(anno%100 != 0))
   b=true;
  return b;
 }
 // Metodo inverti
 public static int[] inverti(int[] array){
  int[] arrayRev = new int[array.length];
  int lunghezza = array.length-1;
  for(int i=0;i<array.length;i++)
   arrayRev[lunghezza-i]= array[i];
  return arrayRev;
 }
 public static void main(String[] args){
  Scanner tastiera = new Scanner(System.in);
  System.out.println("--------------------Metodo Bisestile----------------------");
  System.out.println("Inserisci un anno per verificare se é bisestile o no : ");
  int anno = tastiera.nextInt();
  boolean check=bisestile(anno);
  if(check)
   System.out.println("L'anno "+anno+"  é bisestile ");
  else
   System.out.println("L'anno "+anno+"  non é bisestile ");

  System.out.println("--------------------Metodo inverti----------------------");
  int[] array = {1,2,3,4,5,6};
  int [] arrayRev = inverti(array);
  for(int i=0;i<arrayRev.length;i++)
   System.out.println(arrayRev[i]);
 }
}
