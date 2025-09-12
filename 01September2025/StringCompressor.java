public class StringCompressor{
    public static void main(String[] args){
        String Name="AAAAAbbbbbbcccccddddaa";
        StringCompressor(Name);
    
}
public static void StringCompressor(String str){
    int count=1;
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==str.charAt(i-1)){
            count++;
        }
        else{
            System.out.print(str.charAt(i)+""+count);
            count=1;

        }

    }
    

}
}