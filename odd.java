import java.util.Scanner;
class Odd{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=6,b=2;
        int res;
        res=a%b;
        String c=(res==0)?"odd":"even";
        System.out.println("c is a:"+c);
    }
}