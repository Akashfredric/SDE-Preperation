package in.codegrind.dsa.concepts;

public class RecursionFibonocciNum {

    public static void main(String[] args) {
        int num =  50;
        System.out.println(" Fibo of " + num +"th position is : " + findNthFiboNUmber(num) );
    }

    public static int findNthFiboNUmber( int num ){
        if( num < 2 ){
            return num;
        }
        return (findNthFiboNUmber(num-1)) + (findNthFiboNUmber(num-2)) ;
    }
}
