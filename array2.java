import java.util.Scanner;
class Array2{
 public static void main (String args[]){
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the value:");
   int a=scan.nextInt();
    int i=0;
    System.out.println("odd numbers:");
    while(i<a){
        if(i%2>0){
           System.out.println(i);
        }
           i++;
    
    }
    
    

    
 }
}
