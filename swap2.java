class Swap2{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int i=0;
        while(i<a.length){
            int tmp=a[i];
            a[i]=a[i+1];
            a[i+1]=tmp;
            i=i+2;
        }
        int j=0;
        while(j<a.length){
            System.out.println(a[j]);
            j++;
        }
    }
}