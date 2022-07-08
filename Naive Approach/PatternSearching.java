//in this problem we will be given a array and a patter we have to find out the index where that pattern is starting in the array
//in this problem we are solving it by naive approach
/**
    in this approach we may or may not get the answer and this is the most basic and stupidest approach to follow
 */

class PatternSearching{
    static void patternSearch(String line,String pattern){
        int len_one = line.length();
        int len_two = pattern.length();
        for(int i=0;i<=len_one - len_two;i++){
            for(int j=i;j<=len_one;j++){
                if(pattern.equals(line.substring(i,j))){
                    System.out.println("pattern found at index :- " + i);
                    break;
                }
            }
        }
    }
    public static void main(String[] array){
        String line = "AAABAAACAAABA";
        String pattern = "AABA";
        patternSearch(line,pattern);
    }
}