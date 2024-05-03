import java.util.Scanner;
class scanner{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the number:");
        int a=scan.nextInt(),b=scan.nextInt();
        
        System.out.println(a+b);
    }
}