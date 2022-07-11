import java.util.ArrayList;
import java.util.List;

public class BreakingtheRecords {
    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        var min = scores.get(0);
        var max = scores.get(0);
        var breakLeastCount = 0;
        var breakMaxCount = 0;
        List<Integer> result = new ArrayList<>();
        for(var i = 1;i < scores.size();i++){
            var s = scores.get(i);
            if(s < min){
                min = s;
                breakLeastCount++;
            }
            else if (s > max){
                max = s;
                breakMaxCount++;
            }
        }
        result.add(breakMaxCount);
        result.add(breakLeastCount);
        return result;
    }

}
