class Loop5{
    public static void main(String arg[]){
        int a[]={5,15,20,25,30,35,40,45,50,55};
        
        
            if(a.length%2==0){
                System.out.println(a.length);
                System.out.println(a[a.length/2]);
                System.out.println(a[a.length/2-1]);
                System.out.println("a.length count even:");
            }
            else{
                System.out.println(a.length);
                System.out.println(a[a.length/2]);
                System.out.println("a.length count odd:");
            }   
    }
}