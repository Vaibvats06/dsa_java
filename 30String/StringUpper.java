public class StringUpper{
    public static void main(String args[]){
    String str="my name is vaibhav vats.";
       Char.toUpperCase(str.charAt(0));
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=' '){
            str.charAt(i+1).toUpperCase();
        }
    }
    System.out.println(str);
    
  }
}