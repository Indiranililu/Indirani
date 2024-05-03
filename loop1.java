class Loop1{
    public static void main(String arg[]){
        int a[]={5,10,15,20,25,30,35,40,45,50};
        int i=0;
        while(i<=9){
            if(a[i]%2==0){
                System.out.println("Even numbers:"+a[i]);
            }
            else{
                System.out.println("odd numbers:"+a[i]);
                
            }
            i++;
            
        }
    }
}