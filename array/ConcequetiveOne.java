//in this problem set we will be given that how many 0 can be converted to 1 for the maximum concequetive array length
//there will be a limit to the zeros
//in this program i made the limit with 2 

class ConcequetiveOne{
    public static int ConcequetiveOne(int[] array){
        int j = -1;
        int count = 0;
        int sum = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                count++;
            }
            while(count>2){
                j++;
                if(array[j] == 0){
                    count --;
                }
            }
            int len = i-j;
            if(len>sum){
                sum = len;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] array = {1,0,0,1,1,0,1,1,1,0};
        int ans = ConcequetiveOne(array);
        System.out.println(ans);
    }
}