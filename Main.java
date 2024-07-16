import java.util.*;
public class Main{
 public static void main(String[]args){
  int n= (int) (Math.random()*100);
  Scanner sc= new Scanner(System.in);
  ;
  int g= 0;
  do{
      System.out.println("enter you number");
      g=sc.nextInt();
  if(n==g){
      System.out.println("Your guess is correct!");
  }
  else if(n>g){
      System.out.println("number is larger than your guessed number");
  }
  else{
      System.out.println("number is smaller than your guess");
  }
      
  }
  while(g>=0);
  
  
 }
 }
 
