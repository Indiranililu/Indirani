import java.util.Scanner;
class Function4{
    public static void main(String args []){
        Scanner scan=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter number:");
        int b=scan.nextInt();
        Function(a,b);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
        
    }
    public static void Function(int a[],int b){
        a[b-1]=0;
        
        
        
        
        
            
    }
}