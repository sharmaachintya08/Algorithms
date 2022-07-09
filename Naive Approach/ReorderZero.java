/**
    in this problem we have to reorder 0 to the last
 */

class ReorderZero{
    static void reOrder(int[] array){
        int k=0;
        for(int i:array){
            if(i!=0){
                array[k] = i;
                k++;
            }
        }
        for(int i=k;i<array.length;i++){
            array[i] = 0;
        }
    }
    public static void main(String[] args){
        int[] array = {1,2,3,0,0,5,6};
        reOrder(array);
        for(int i :array ){
            System.out.println(i);
        }
    }
}
/**
    time complexity :- O(n);
    space complexity :- O(1);
 */