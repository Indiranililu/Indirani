class Function3{
    public static void main(String args[]){
       int a[]={1,5,2,3};
       int b=0;
       Function(a,b);
    }
    public static void Function(int a[],int b){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
               if(a[i]>a[j]){
                b=a[i];
                a[i]=a[j];
                a[j]=b;
                
               }
            }
            System.out.println(a[i]);
        }
    }
}