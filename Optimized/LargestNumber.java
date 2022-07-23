/**
 * problem :- Find the largest number possible from a given set of numbers
 * 
 * problem set :- Find the largest number possible from a set of given numbers where the numbers append to each other in any order to form the largest number
 */

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class LargestNumber {
    public static String largestNumber(List<Integer> nums){
        Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
        return nums.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
    }
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10,68,97,9,21,12);
        String largestNumber = largestNumber(numbers);
        System.out.println(largestNumber);
    }
}
/**
 * tc :- O(nlogn);
 */