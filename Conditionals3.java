import java.util.Scanner;
class Conditionals3{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=scan.nextInt(),b=scan.nextInt();
        if(a>=b){
            System.out.println(" The small value:"+b);
        }
        else{
            System.out.println(" The Small value:"+a);
        }
    }
}