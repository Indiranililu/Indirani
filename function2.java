import java.util.Scanner;
class Function2{
    public static void main(String args[]){
         Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        Square(a,b);
        Triangle(a,b);
        Pyramid(a,b);
        Diamond(a,b);
    }
    public static void Square(int a,int b){
       for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Triangle(int a,int b){
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pyramid(int a,int b){
        for(int i=0;i<=a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Diamond(int a,int b){
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a;i>=0;i--){
            for(int j=0;j<=b-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}