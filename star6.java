class Star6{
    public static void main(String args[]){
        int i,j,k;
        for (i=0;i<5;i++){
            for(j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i*2;j++){
                if(j==0||j==i*2||i==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }            
            System.out.println();
        }    
    }
}