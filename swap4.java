class Swap4{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<a.length;i=i+3){
            int temp=a[i];
            a[i]=a[i+2];
            a[i+2]=temp;
        }
        for(int j=0;j<a.length;j++){
        System.out.println(a[j]);
        }
    }
}