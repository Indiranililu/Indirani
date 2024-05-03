import java.util.Scanner;
class Table2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a=scan.nextInt();
        System.out.println("Enter the number:");
        int b=scan.nextInt();
        int i=1;
        while(i<=a){
            System.out.println(b+"*"+i+"="+b*i);
            i++;
            }
            
        }
    }
