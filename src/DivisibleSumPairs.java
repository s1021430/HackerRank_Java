import java.util.List;

public class DivisibleSumPairs {
    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        var result = 0;
        for(int i = 0;i < ar.size() - 1;i++){
            for(int j = i + 1; j < ar.size(); j++){
                if(isDivisible(ar.get(i),ar.get(j),k))
                    result++;
            }
        }
        return result;
    }

    private static boolean isDivisible(int a,int b,int divisor){
        return (a + b) % divisor == 0;
    }
}
