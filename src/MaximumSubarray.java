import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import java.util.*;


class MaximumSubarray {
  public int maxSubArray(int[] nums) {
    int largestNum = nums[0];
    int sum;
    int greatestSum;
    int startAgain = 0;
    int endAgain = nums.length - 1;

    for (int i = 0; i < nums.length; i++) { // find largest sum
      if (largestNum < nums[i]) {
        largestNum = nums[i];
      }
    }
    greatestSum = largestNum;
    int getMeOutOfHere = nums.length - 1;
    while (true) {

      sum = 0;
      for (int i = startAgain; i <= endAgain; i++) {

        sum += nums[i];
        getMeOutOfHere--;
        if (greatestSum < sum) {
          greatestSum = sum;
        }
        System.out.print(sum + " ");
        if (sum < 0 && sum < largestNum) {
          startAgain = i + 1;
          System.out.print(" break left ");
          break;
        }

      }
      if (getMeOutOfHere <= 0) {
        return greatestSum;
      }
      sum = 0;
      for (int i = endAgain; i >= startAgain; i--) {
        sum += nums[i];
        getMeOutOfHere--;
        if (greatestSum < sum) {
          greatestSum = sum;
        }
        System.out.print(sum + " ");
        if (sum < 0 && sum < largestNum) {
          endAgain = i - 1;
          System.out.print(" break right ");
          break;
        }

      }

    }


  }
}
