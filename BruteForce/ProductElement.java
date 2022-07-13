/**
    in this problem we hae to replace the current element in the array with the product of every other element before or after in the array
 */

public class ProductElement{
    static void productElement(int[] array){
        int product = 1;
        int[] array1 = new int[array.length];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i == j){
                    continue;
                }
                product = product * array[j];
            }
            if(array.length < 1){
                System.out.println("theres only one element in the array ");
            }
            else{
                array1[i] = product;
                product = 1;
            }
        }
        for(int i=0;i<array.length;i++){
            array[i] = array1[i];
        }
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        productElement(array);
        for(int elements:array){
            System.out.println(elements);
        }
    }
}
/**
    time complexity :- O(n^2);
    space complexity :- O(1);
 */