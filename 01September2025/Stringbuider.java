public class Stringbuider{
    public static void Upper(String str){
        str=str.toLowerCase().trim();
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append((str.charAt(i)));

            }
        }
        System.out.println(sb);

        
    }

    public static void main(String[] args){
        String str="    my name is vAibhav vats and i want take a intership.";
        Upper(str);
        
    }
}