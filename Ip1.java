import java.util.Scanner;
class Ip1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),a1=scan.nextInt();
        byte b=scan.nextByte();
        short c=scan.nextShort();
        long d=scan.nextLong();
        float e=scan.nextFloat();
        double f=scan.nextDouble();
        boolean g=scan.nextBoolean();
        char ch=scan.next().charAt(0);
        String s=scan.nextLine();
        s=scan.nextLine();
        System.out.println(""+a+ " "+a1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(ch);
        System.out.println(s);
        


    }
}