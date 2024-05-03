import java .util.Scanner;
class Area1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int height=scan.nextInt(),width=scan.nextInt(),base=scan.nextInt();
        float res;
        res=1/2f*base*height;
        System.out.println("Area of Triangle:"+res);
        res=2*width+height;
        System.out.println("perimeter of Triangle:"+res);
    }
}