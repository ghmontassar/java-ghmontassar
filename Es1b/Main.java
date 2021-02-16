import java.util.Scanner;
public class Main {
 public static int cambiValore(int x){
  int test = x%2 ;
  switch(test){
   case 0 :
   x= x/2;
   break;
   case 1 :
   x= (x*3)-1;
   break;
  }
  return x;
 }
 public static void scelta(char c){
  switch (c){
   case 'a' : 
   System.out.println("hai scelto pasta");
   break;
   case 'b' : 
   System.out.println("hai scelto pizza");
   break;
   case 'c' : 
   System.out.println("hai scelto hamburger");
   break;
   case 'd' : 
   System.out.println("hai scelto panino");
   break;
   case 'e' : 
   System.out.println("hai scelto dolce");
   break;
   default :
   System.out.println("la tua scelta  é sbagliata ");
  }
 }
 public static void checkParole(String parola){
   boolean b =false;
  if(parola.length()>1){
    if(parola.charAt(0)==parola.charAt(parola.length()-1)){
    System.out.println("giusto");
    }else{
    System.out.println("falso");
    }
  }else{
    System.out.println("parola dev'avere almeno due caratteri");
  }
 }
  public static int confronta(int a , int b){
    int x,y;
    x= (a>b) ? a-b : b-a;
    if(a==b){
      return 0;
    }else{
      return x;
    }
  }
  public static void saluta(String nome , int x){
    for(int i=0;i<x;i++){
      System.out.println("ciao "+nome);
    }
  }
 public static void main(String[] args){
  Scanner tastiera = new Scanner(System.in);

  System.out.println("---------------Esercizio1 pagina 121---------------------");
  System.out.println("inserisci il valore punteggio :");
  int punteggio = tastiera.nextInt();
  String messaggio = (punteggio<=100 && punteggio >=0) ? "valio" : "non valido";
  System.out.println(messaggio);
  
  System.out.println("---------------Esercizio2 pagina 121---------------------");
  System.out.println("inserisci il valore x :");
  int x = tastiera.nextInt();
  int risult = cambiValore(x);
  System.out.println(risult);
  tastiera.nextLine();
  System.out.println("---------------Esercizio3 pagina 121---------------------");
  System.out.println("qual é l tua risposta si/no ? ");
  String s = tastiera.nextLine();
  boolean b = (s.equals("si") || s.equals("s")|| s.equals("S")|| s.equals("Si")) ? true : false;
  System.out.println(b);
  System.out.println("---------------Esercizio13 pagina 121---------------");
  System.out.println("Menu : a(pasta) b(pizza) c(hamburger) d(panino) e(dolce) ");
  char c = tastiera.next(".").charAt(0);
  scelta(c);
  System.out.println("---------------Esercizio1 pagina 165---------------");
  tastiera.nextLine();
  System.out.println("Inserire una parola ('fine' per finire) : ");
  String parola=tastiera.nextLine();
  while(!(parola.equals("fine"))){
     checkParole(parola);
     System.out.println("Inserire una parola ('fine' per finire) : ");
     parola=tastiera.nextLine();
  }
  System.out.println("Hai Finito il programma ");
  System.out.println("---------------Esercizio1 pagina 205---------------");
  System.out.println("Inserire il primo valore");
  int a = tastiera.nextInt();
  System.out.println("Inserire il secondo valore");
  int y = tastiera.nextInt();
  System.out.println("il confronto tra "+a+" e "+y+" = "+confronta(a,y));
  System.out.println("---------------Esercizio2 pagina 205---------------");
  tastiera.nextLine();
  System.out.println("Inserire il nome da salutare");
  String nome = tastiera.nextLine();
  System.out.println("Inserire il numero di ripetizione ");
  int r = tastiera.nextInt();
  saluta(nome,r);
 }
}