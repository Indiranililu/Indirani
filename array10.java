class Array10{
    public static void main(String args[]){
        String a[]={"indhu","shalu","neelu","lilu"};
        String temp=a[0];
        a[0]=a[3];
        a[3]=temp;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
    }
}