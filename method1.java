class Method1{
public static void main(String[] args) {  
//declaring and initializing a string  
String str = "good morning, how r you?";  
//declaring an empty string array 
String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
        System.out.println(noSpaceStr.toUpperCase());
        System.out.println(noSpaceStr.length());
        String replaceString=str.replace("morning","you");
        System.out.println(replaceString);
        int a=20;
        for(int i=10;i<a;i++){
            System.out.println((int)(Math.random()*10+20));
        }
        System.out.println(Math.pow(4,3));
        System.out.println(Math.sqrt(64));



}  
}  