public class compare{
    public static void main(String args[]){
        // System.out.println("String".compareTo("hello"));

        String fruits[]={"mango","apple","grape","papaya","Zoya","DraganFruit"};
        String largest =fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.print(largest);
    }
}