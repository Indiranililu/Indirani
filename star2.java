class Star2{
    public static void main(String args[]){
        int a=10;
        for(int i=1;i<=a*a;i++){
            System.out.print("*");
            if(i%10==0){
                System.out.println();
            }
        }
    }
}