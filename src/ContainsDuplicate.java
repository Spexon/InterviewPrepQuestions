import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    // map<key, value>
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0;i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        return true;
      }
      map.put(nums[i], 1);
    }
    return false;
  }
}
