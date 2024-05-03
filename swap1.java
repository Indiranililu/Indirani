class Swap{
    public static void main(String arg[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        int i=0;
        while(i<a.length){
            int t=a[i];
            a[i]=a[i+2];
            a[i+2]=t;
            i=i+3;
            }
            int j=0;
            while(j<a.length){
                System.out.println(a[j]);
                j++;
            }
    }
}