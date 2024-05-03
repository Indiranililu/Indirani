import java.util.Scanner;
class vowels{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        char v=scan.next().charAt(0);
        if(v=='a'||v=='e'||v=='i'||v=='u'){
            System.out.println("character is a vowels");
        }
        else{
            System.out.println("Character is a not vowels");
        }



    }

}