import java.util.Scanner;
class Nested{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String a= "child";
        System.out.println("Enter the age & month");
        int b= scan.nextInt();
        System.out.println("Enter the hemoclobin level");
        float c=scan.nextFloat();
        if(a=="child"){
            if(b<=1){
                if(c>10&&c<20){
                    System.out.println("Normal");
                }
                else{
                    System.out.println("obnormal");
                }
                
            }
            else if(b>1&&b<2)
                 if(c>10&&c<18){
                    System.out.println("normal");
                 }
                    else{
                    System.out.println("obnormal");
                 }
                 else if(b>2&&b<6)
                 if(c>9.5&&c<14.0){
                    System.out.println("normal");
                 }
                    else{
                    System.out.println("obnormal");
                 }
                 else if(b>0.5&&b<2)
                 if(c>10.5&&c<13.5){
                    System.out.println("normal");
                 }
                    else{
                    System.out.println("obnormal");
                 }
                 else if(b>2&&b<6)
                 if(c>11.5&&c<13.5){
                    System.out.println("normal");
                 }
                    else{
                    System.out.println("obnormal");
                 }
                 else if(b>6&&b<12)
                 if(c>11.5&&c<15.5){
                    System.out.println("normal");
                 }
                    else{
                    System.out.println("obnormal");
                 }

             }
        else{
            System.out.println("invalied age");
        }
    }
}