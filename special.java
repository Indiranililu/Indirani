import java.util.Scanner;
class Special{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        char c=scan.next().charAt(0),d=scan.next().charAt(0),e=scan.next().charAt(0);
        if(c>='A'&&c<='Z'){
            System.out.println("capital Alphabet");
        }
        else if(d>='a'&&d<='z'){
            System.out.println("Small alphabet");
        }
        else if(e>='0'&&e<='9'){
            System.out.println("The number");
        }
        else{
            System.out.println("is special character");
        }
    }
}