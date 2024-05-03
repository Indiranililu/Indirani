class Function5{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        Matrix(a);
    }
    public static void Matrix(int a[]){
        int b=0;
        for(int i=0;i<a.length;i++){
            if(b%3==0&&b!=0){
                System.out.println();
            }
                
            System.out.print(a[i]);
            b++;
        }
    }
}
