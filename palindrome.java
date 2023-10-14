public class palindrome {
    public static void main(String[] args) {
      //  Scanner Scan=new Scanner(System.in);

        String s1="java";
        System.out.println("The String entered is"+s1);
        String s2="";

        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        if(s1==s2){
            System.out.println("the name you entered is palindrome");
        }else{
            System.out.println("Sorry");
        }

        
    
        
    }
}
