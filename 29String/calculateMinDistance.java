import java.util.*;
class calculateMinDistance{
    public static void main(String args[]){
        MinDistance("wneenesennn");

    }
    public static void MinDistance(String str){
        int west=0;
        int east=0;
        int north=0;
        int south=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='w'){
                west++;
            }
            else if(str.charAt(i)=='e'){
                east--;
            }
            else if(str.charAt(i)=='n'){
                north--;
            }
            else{
                south++;
            }
        }
        int x=east+west;
        int y=north+south;
        System.out.println(Math.sqrt((x*x)+(y*y)));
    }
}