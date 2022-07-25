/**
 * problem :- Trapping Rain Water Problem 
 * problem set:- Trapping rainwater problem: Find the maximum amount of water that can be trapped within a given set of bars where each bar’s width is 1 unit.
 */


public class RainWaterProb {
    public static int maxWaterTrapped(int[] A){
        int trappedWater = 0;
        int[] TWater = new int[A.length];
        int[] Left = new int[A.length];
        int[] Right = new int[A.length];
        int Lmax = 0, Rmax = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]>Lmax){
                Lmax = A[i];
                Left[i] = Lmax;
            }
            else{
                Left[i] = Lmax;
            }
        }
        for(int j=A.length - 1;j>=0;j--){
            if(A[j]>Rmax){
                Rmax = A[j];
                Right[j] = Rmax ;
            }
            else{
                Right[j] = Rmax;
            }
        }
        for(int i=0;i<A.length;i++){
            TWater[i] = Math.min(Left[i],Right[i]) - A[i];
            trappedWater += TWater[i];
        }
        return trappedWater;
    }
    public static void main(String[] args){
        int[] A = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println(maxWaterTrapped(A));
    }    
}
/**
 * tc = O(n);
 * sc = O(1);
 */
