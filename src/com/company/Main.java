// you can also use imports, for example:
// import java.util.*;
import java.util.Set;
import java.util.HashSet;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if(A.length == 1){
            if(A[0]<1 || A[0] != 1){
                return 1;
            } else {
                return A[0]+1;
            }
        }

        Set<Integer> numbersThatOccured = new HashSet<Integer>();

        for(int i = 0; i < A.length; ++i){

            if(A[i] < 1){
                continue;
            }

            if(!numbersThatOccured.contains(A[i])){
                numbersThatOccured.add(A[i]);
            } else {
                continue;
            }

        }

        if(numbersThatOccured.size() == 0)
            return 1;


        for(int i = 0; i < numbersThatOccured.size(); ++i){

            if(!numbersThatOccured.contains(i+1)){
                return i+1;
            }

            if(i == numbersThatOccured.size()-1){
                return i+2;
            }

        }

        return 1;

    }
}
