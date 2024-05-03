import java.util.Scanner;
class Array7{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a[]={2,3,4,5,6,7,8,10};
        System.out.println("Enter the value:");
        int c=scan.nextInt();
        int b=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==c){
                b=i;
            }
        }
        System.out.println(b);

    }
}