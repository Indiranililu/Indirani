import java.util.Scanner;
class Input1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=2023,year;
        System.out.println("Enter birth year");
        year=scan.nextInt();
        int res;
        res=(a-year);
        System.out.println("Age of year:"+res);

        
    }
}