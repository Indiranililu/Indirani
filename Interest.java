import java.util.Scanner;
class Interest{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int pay=scan.nextInt(),year=scan.nextInt(),interest=scan.nextInt();
        int res;
        res=(pay*year*interest)/100;
        System.out.println("Enter of interest:"+res);
    }
}
    
