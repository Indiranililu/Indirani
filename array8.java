class Array8{
    public static void main(String arg[]){
        int a[]={2,4,6,8,10};
        int b=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==2){
                b=a[i];

            }
        }
        System.out.println("minimum value:"+b);
    }
}