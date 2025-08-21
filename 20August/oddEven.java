import java.util.Scanner;

class oddEven {
    public static void main(String args[]){
         System.out.println("Enter any odd/even number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==1){
            System.out.println("It is odd");
        }else{
            System.out.println("It is even");
        }
        sc.close();
    }
    
}
