class palandrome{
    public static int checkPalindrome(String str){
        str=str.toLowerCase();
        int last=str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(last-1)){
                return -1;
                
            }
            else{
               
            }
            last--;
        }
        return 1;
            
        }
    public static void main(String args[]){
        
        System.out.println(checkPalindrome("jonoj"));
        
    }
}