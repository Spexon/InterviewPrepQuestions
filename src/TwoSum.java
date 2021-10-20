import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  // We can reduce the lookup time from O(n)O(n)O(n) to O(1)O(1)O(1) by trading space for speed.
  // A hash table is well suited for this purpose  because it supports fast lookup in near constant time.
  // I say "near" because if a collision occurred, a lookup could degenerate to O(n)O(n)O(n) time.
  // However, lookup in a hash table should be amortized O(1)O(1)O(1) time as long as the hash function was chosen carefully.
  public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[] { i, map.get(complement) };
      }
    }
    // no solution
    return null;
  }

//     public int[] twoSum(int[] nums, int target) { // brute force way O(n^2)

//         int[] returnArr = new int[2];
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = i+1; j < nums.length; j++) {
//                 if ((nums[i] + nums[j]) == target) {
//                     returnArr[0] = i;
//                     returnArr[1] = j;
//                     break;
//                 }
//             }
//         }
//         return returnArr;
//     }

}
