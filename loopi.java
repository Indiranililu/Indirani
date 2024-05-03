import java.util.Scanner;
class Loopi{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}