import java.util.Scanner;
class star1{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the range");
        int a=scan.nextInt();
        int i=1;
        while(i<=a*a){
            System.out.print("*");
            if(i%5==0){
                System.out.println();

            }
            
            i++;
        }
    
        
            
            
            
            

        
    }
}