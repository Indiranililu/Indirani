import java.util.Scanner;
class Grade{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        byte a=scan.nextByte();
        if(a>=90&&a<=99){
            System.out.println("Mark is A grade");
        }
        else if(a>=75&&a<=90){
            System.out.println("Mark is B grade");
        }
        else if(a>=50&&a<=75){
            System.out.println("Mark is c grade");
        }
        else{
            System.out.println("Mark is not grade");
        }
    }
}