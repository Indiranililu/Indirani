import java.util.Scanner;
class Iptable{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine(),s1=scan.nextLine(),s2=scan.nextLine(),s3=scan.nextLine(),s4=scan.nextLine(),s5=scan.nextLine(),s6=scan.nextLine(),s7=scan.nextLine(),s8=scan.nextLine(),s9=scan.nextLine(),s10=scan.nextLine();
        int a=scan.nextInt(),a1=scan.nextInt();
        byte b=scan.nextByte(),b1=scan.nextByte();
        short c=scan.nextShort(),c1=scan.nextShort();
        long d=scan.nextLong(),d1=scan.nextLong();
        float e=scan.nextFloat(),e1=scan.nextFloat();
        double f=scan.nextDouble(),f1=scan.nextDouble();
        boolean g=scan.nextBoolean(),g1=scan.nextBoolean();
        char ch=scan.next().charAt(0),h1=scan.next().charAt(0);
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println(""+str+"      "+s1+"     "+s2+"     "+s3+"    "+s4+"     "+s5+"     "+s6+"     "+s7+"    "+s8);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ ");
        System.out.println(""+c+"        "+s9+"     "+a+"      "+d+"     "+b+"     "+ch+"     "+e+"    "+f+"    "+g);
        System.out.println(""+c1+"     "+s10+"     "+a1+"     "+d1+"     "+b1+"     "+h1+"    "+e1+"    "+f1+"    "+g1);
    }
}