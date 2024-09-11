package in.codegrind.dsa.concepts;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,13,19,22,27,29,38,57, 89,119,145,163};
        int start = 0;
        int end = arr.length-1  ;
        int target = 119;

        int res = search( target , arr , start , end );
        System.out.println( " Result Index  " + res );
    }

    static int search( int target, int[] arr, int start, int end ){
        if( start > end ){
            return -1;
        }
        int mid =  start + (end-start)/2;
        System.out.println(" | Target: " + target +
                            " Start : " + start +
                            " End: " +end +
                            " CurrValue : " + arr[mid] );


        if( arr[mid] == target  ){
            return mid;
        }
        if( arr[mid] > target ){
            return search( target , arr , start , mid-1 );
        }
        else{
            return search( target , arr , mid+1 , end );
        }
    }
}
