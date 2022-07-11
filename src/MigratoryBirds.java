import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        var birds = new HashMap<Integer, Integer>();
        arr = arr.stream().sorted().collect(Collectors.toList());
        for(var i : arr){
            if(birds.containsKey(i))
                birds.put(i, birds.get(i) + 1);
            else
                birds.put(i,1);
        }
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : birds.entrySet())
        {
            if(maxEntry == null)
            {
                maxEntry = entry;
                continue;
            }
            int compareResult = entry.getValue().compareTo(maxEntry.getValue());
            if(compareResult > 0 || compareResult == 0 && entry.getKey() < maxEntry.getKey())
                maxEntry = entry;
        }
        assert maxEntry != null;
        return maxEntry.getKey();
    }
}
