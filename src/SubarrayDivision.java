import java.util.List;

public class SubarrayDivision {
    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        var result = 0;
        for(int i = 0;i < s.size();i++){
            var slideIndex = i + m;
            if(slideIndex > s.size())
                break;
            var sum = 0;
            for(int j = i;j < slideIndex;j++){
                sum += s.get(j);
            }
            if(sum == d)
                result++;
        }
        return result;
    }
}
