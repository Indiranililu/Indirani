import java.util.*;
class level{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        char a=scan.next().charAt(0);
        System.out.println("Enter the gender");
        int b=scan.nextInt();
        System.out.println("Enter the age");
        float c=scan.nextFloat();
        System.out.println("Enter the level");
        if(a=='M'){
            if(b>12&&b<18){
                if(c<13.1&&c>15.1){
                    System.out.println("Normal");
                }
                else{
                    System.out.println("Obnormal");
                }
            }
            else if(b>18){
                if(c<13.6&&c<17.7){
                    System.out.println("Normal");
                }
                else{
                    System.out.println("Obnormal");
                }

            }
            else{
                System.out.println("invalied age");
            }
                
            }
            else if (a=='F'){
                if(b>12&&b<18){
                    if(c<12.1&&c>16.1){
                        System.out.println("Normal");
                    }
                    else{
                        System.out.println("Obnormal");
                    }
                }
                else if(b>18){
                    if(c<12.1&&c<15.1){
                        System.out.println("Normal");
                    }
                    else{
                        System.out.println("Obnormal");
                    }
                }
                    else{
                        System.out.println("Invalied age");
                    }


            }
            else{
                System.out.println("invalied gender");
            }
            
            
        
    }
}