import java.util.Scanner;
class Store{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=scan.nextInt();
        int b=1;
        for(int i=1;i<=a;i++){
            b=i*b;
        }
     System.out.println(b);
    }
}