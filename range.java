import java.util.Scanner;
class Range{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int c=scan.nextInt();
        int a=50,b=100;
        if(a<=c&&b>=c){
            System.out.println("Number is range");
        }
        else{
            System.out.println("Number is not range");
        }
    }

}