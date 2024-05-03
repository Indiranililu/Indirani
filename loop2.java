class loop2{
    public static void main(String args[]){
        int a[]={5,10,15,20,25,30,35,40,45,50};
        int i=0;
        int c=0;
        int b=0;
        while(i<=9){
            if(a[i]%2==0){
                c=c+a[i];
            }
            else{
                b=b+a[i];
            }
            i++;
        }
            System.out.println("Even number total="+c);
            System.out.println("odd nuber total="+b);
    }
}