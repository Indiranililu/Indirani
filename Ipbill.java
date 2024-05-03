import java.util.Scanner;
class Ipbill{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine(),s1=scan.nextLine(),s2=scan.nextLine(),s3=scan.nextLine(),s4=scan.nextLine(),s5=scan.nextLine(),s6=scan.nextLine(),s7=scan.nextLine();
        int a=scan.nextInt();
        byte b=scan.nextByte();
        short c=scan.nextShort();
        long d=scan.nextLong();
        double e=scan.nextDouble();
        float f=scan.nextFloat();
        char ch=scan.next().charAt(0),g1=scan.next().charAt(0),g2=scan.next().charAt(0);
        System.out.println("bill No:101");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("");
        System.out.println(""+s+"       "+s1+"         "+s2+"        "+s3+"      "+s4);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _");
        System.out.println("");
        System.out.println(""+ch+"             "+s5+"              "+c+"           "+a+"             "+100);
        System.out.println(""+g1+"             "+s6+"            "+b+"         "+e+"            "+385);
        System.out.println(""+g2+"             "+s7+"            "+d+"          "+f+"           "+44000);
        System.out.println("                                                              _ _ _ _ _ ");
        System.out.println("");
        System.out.println("                                                        total =    44485          ");
        System.out.println("                                                               _ _ _ _ _ ");
    }
}