import java.util.Scanner;
class Tablea{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine(),s1=scan.nextLine(),s2=scan.nextLine(),s3=scan.nextLine(),s4=scan.nextLine(),s5=scan.nextLine(),s6=scan.nextLine(),s7=scan.nextLine();
        int a=scan.nextInt(),
         b=scan.nextInt(),
         c=scan.nextInt(),
         d=scan.nextInt(),
         e=scan.nextInt(),
         f=scan.nextInt();
        char ch=scan.next().charAt(0),g1=scan.next().charAt(0),g2=scan.next().charAt(0);
        int res;
        System.out.println("bill No:101");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("");
        System.out.println(""+s+"       "+s1+"         "+s2+"        "+s3+"      "+s4);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _");
        System.out.println("");
        res=c*a;
        System.out.println(""+ch+"             "+s5+"              "+c+"           "+a+"             "+res);
         res=b*e;
        System.out.println(""+g1+"             "+s6+"            "+b+"         "+e+"            "+res);
        res=d*f;
        System.out.println(""+g2+"             "+s7+"            "+d+"          "+f+"           "+res);
        System.out.println("                                                              _ _ _ _ _ ");
        res=c*a+b*e+d*f;
        System.out.println("                                                           total:"+res);
        

        
        
        
    }
}