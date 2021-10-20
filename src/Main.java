public class Main {

  public static void main(String[] args) { // O(n)

    BinarySearch bs = new BinarySearch();
    ReverseLinkedList rll = new ReverseLinkedList();
    TwoSum ts = new TwoSum();
    MaxProfit mp = new MaxProfit();
    ContainsDuplicate cd = new ContainsDuplicate();
    ProductExceptSelf pes = new ProductExceptSelf();
    MaximumSubarray ms = new MaximumSubarray();
    ThreeSum ths = new ThreeSum();
    

    //bs.binarySearch();
    //rll.reverse();
    int[] twosum = ts.twoSum(new int[] {1, 4, 6, 7, 11, 15}, 15);
    //System.out.println(mp.maxProfit(new int[] {2,4,1}));
    System.out.println(cd.containsDuplicate(new int[] {1,1,2,5,6,9}));
    int[] product = pes.productExceptSelf(new int[] {1,2,3,4});
    for (int x : product) {
      System.out.print(x + " ");
    }
    System.out.println();
    ms.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
    System.out.println();
    System.out.println(ths.threeSum(new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4}));



  }
}
