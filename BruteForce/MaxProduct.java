//in this problem we have to find the maximum product of 2 numbers in an array
//for this problem i am using bruteforce
//time complexity is O(n^2)

class MaxProduct{
    public static void MaxProduct(int[] array){
        int product = 0;
        int max_i = -1;
        int max_j = -1;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]*array[j]>product){
                    product = array[i]*array[j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println(array[max_i]+" "+array[max_j]);
    }
    public static void main(String[] args){
        int[] array = {-10,-3,5,6,2};
        MaxProduct(array);
    }
}