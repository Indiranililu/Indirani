import java.util.Scanner;
class Loopf{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the character:");
        char b=scan.next().charAt(0);
        for(char i='z';i>=b;i--){
            for(char j=i;j>=b;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}