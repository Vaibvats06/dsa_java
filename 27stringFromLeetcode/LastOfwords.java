public class LastOfwords{
    public static void main(String args[]){
        System.out.println(countOfLastWord("hello world    "));

    }
    public static int countOfLastWord(String s){
        String str =s.trim();
        int count =0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}