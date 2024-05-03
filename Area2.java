import java.util.Scanner;
class Area2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value:");
        byte a=scan.nextByte(), b=scan.nextByte();
        int res;
        res=a*a+b*b+2*a*b;
        System.out.println("result:"+res);

    }
}