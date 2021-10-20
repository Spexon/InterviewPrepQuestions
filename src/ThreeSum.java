import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> sumOf3Nums = new ArrayList<>();
    List<Integer> retainNums = new ArrayList<>();


    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {

          if ((i != j && i != k && j != k) && nums[i] + nums[j] + nums[k] == 0) {

            List<Integer> wtf = new ArrayList<>();
            if (retainNums.contains(nums[i]) && retainNums.contains(nums[j]) && retainNums.contains(nums[k])) {
              System.out.print("Do Nothing: ");
            }
            else {
              System.out.print("Added:      ");
              wtf.add(nums[j]);
              wtf.add(nums[i]);
              wtf.add(nums[k]);
              sumOf3Nums.add(wtf);
              retainNums.addAll(wtf);
            }
            System.out.println("i = " + i + " j = " + j + " k = " + k);
          }
        }
      }
    }
    return sumOf3Nums;
  }
}
