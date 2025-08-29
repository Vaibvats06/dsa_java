public class countVowelCon{
    public static void countVowelConsonant(String str){
        int vowel=0;
        int consonant=0;
        int space=0;
        int total_char=str.length();
        str = str.toLowerCase();
        for(int i=0;i<total_char;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowel++;
            }
            else if(str.charAt(i)==' '){
                space++;
            }
            else{
                consonant++;
            }
        }
        // return arr[vowel,consonant];
        System.out.println(vowel+","+consonant+","+total_char+","+space);
    }
    public static void main(String args[]){
        countVowelConsonant("My name is Vaibhav Vats");
    }
}