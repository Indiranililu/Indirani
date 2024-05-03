class swapn{
    public static void main(String args[]){
        int a[]={2,3,4,5,6,7,8,9};
        for(int i=0;i<a.length;i=i+2){
        int temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
        }
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }



    }
}