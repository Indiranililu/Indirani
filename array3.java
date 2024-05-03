import java.util.Scanner;
class array3{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=scan.nextInt();
        int i=0;
        if(i>a){
            while(i>=a){
                System.out.println(i);
                i--;
            }
            
        }
        else{
            while(i<=a){
            System.out.println(i);
            i++;
            }
            
        }

    }
}