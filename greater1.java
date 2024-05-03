import java.util.Scanner;
class greater1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),b= scan.nextInt(),c=scan.nextInt();
        if(a>b==a>c){
    System.out.println("a is greater");
}
    if(b<a==b>c){
    System.out.println("b is greater");
}
     if(c>a==c>b){
    System.out.println("c is greater");
}
else{
    System.out.println("Some data is same value");
}
    }
}