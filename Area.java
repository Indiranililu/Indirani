import java.util.Scanner;
class Area{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt(),width=scan.nextInt();
        int res;
        float radious=scan.nextFloat(),pi=3.14f;
        float result;
        res=length*width;
        System.out.println("Area of rectangle:"+res);
        res=(length+width)*2;
        System.out.println("perimeter of rectangle:"+res);
        res=width*width;
        System.out.println("Area of square:"+res);
        res=4*width;
        System.out.println("perimeter of square:"+res);
        result=pi*radious*radious;
        System.out.println("Area of circle:"+result);
        result=2*pi*radious;
        System.out.println("perimeter of circle:"+result);



    }
}