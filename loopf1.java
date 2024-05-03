import java.util.Scanner;
class Loopf1{
    public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the value:");
      int a=scan.nextInt();
      for(int i=0;i<=a;i++){
        for(int j=0;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<=i*2;j++){
            System.out.print("*");
        }
        System.out.println();
      } 
    }

}