import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static boolean hasDuplicates(int[] nums) {
        // Used a HashSet bc this data structure can't have duplicates
        Set<Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            set.add(num);
        }

        // If HashSet's size is smaller than input array, then it returns True (has duplicates), 
        // if length is the same it returns False (No duplicates)
        return set.size() < nums.length;
    }
}
