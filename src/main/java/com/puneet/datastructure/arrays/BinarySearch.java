package com.puneet.datastructure.arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BinarySearch {


    /**
     * This method Returns the first occurrence of the position of target in the list
     * else returns -1.
     * @param input
     * @param target
     * @return position
     */
    public int find(List<Integer> input, int target) {

        //Error Handling
        if(input == null || input.size() < 1)
            return -1;

        int low = 0;
        int high = input.size()-1;
        int mid ;

        while(low <= high) {

            mid = low + (high - low)/2;
            int num = input.get(mid);

            if (num == target &&
                    (mid==0 || input.get(mid-1)< num) ){
                return mid;

            } else if (target > num) {
                low = mid+1;

            } else {
                high = mid-1;
            }
        }
        return -1;
    }

    public int findRecursive(List<Integer> input, int target) {
        List<Integer> ls = Optional.ofNullable(input).orElse(new ArrayList<Integer>());
        return findRecursiveHelper(ls, target, 0, ls.size()-1);
    }

    private int findRecursiveHelper(List<Integer> input, int target, int low, int high) {
        if( low > high)
            return -1;
        int mid = (low+high)/2;
        int midNum = input.get(mid);

        if (midNum == target &&
                (mid==0 || input.get(mid-1) < midNum) ) {
            return mid;

        }else if( target > midNum)
            return findRecursiveHelper(input, target, mid+1, high);
        else
            return findRecursiveHelper(input, target, low, mid-1);
    }

}
