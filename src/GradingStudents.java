import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        var result = new ArrayList<Integer>();
        for(var g : grades){
            if(g < 38){
                result.add(g);
                continue;
            }
            int quotient = g / 10;
            int remainder = g % 10;
            int multiple;
            boolean round;
            if(remainder >= 5)
                multiple = (quotient + 1)*10;
            else
                multiple = quotient*10 + 5;
            round = (multiple - g) < 3;
            if(round)
                g = multiple;
            result.add(g);
        }
        return result;
    }
}
