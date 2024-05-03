import java.util.Scanner;
class text{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        char b=scan.next().charAt(0);
        if(b=='y'||b=='Y'){
            System.out.println("yes");
        }
        else if(b=='n'){
            System.out.println("no");
        }
        else if(b=='a'||b=='A'||b=='e'||b=='E'||b=='i'||b=='I'||b=='o'||b=='O'||b=='u'||b=='U'){
         System.out.println("voweles");   
        }
        
        else{
            System.out.println("others");
        }
        
            
                
        
    }
}