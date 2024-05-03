import java.util.Scanner;
class Hemoclobin{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        char a=scan.next().charAt(0);
        int c=scan.nextInt();
        float b=scan.nextFloat();
        if(a=='M'){
            if(c<=12&&c>=18){
                if(b<=12&&b>=16){
                    System.out.println("Normal");
                }
                else{
                    System.out.println("Age 12 to 18");
                }
            }
            else{
                System.out.println("level 12 to 16");
            }
        }
        else{
            System.out.println("Obnormal");
        }

    }
}