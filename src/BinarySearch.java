import java.util.Arrays;

public class BinarySearch {

  public void binarySearch() {

    Integer[] myList = new Integer[]{
        1, 9, 55, 3, 44, 2, 25, 57, 23, 15, 45, 4, 34, 10, 33, 36, 44, 19, 99, 41
    };

    Arrays.sort(myList);
    for(int it = 0; it < myList.length; it++) {
      System.out.print(myList[it] + " ");
    }

    int num = 57;
    int low = 0;
    int i = 0;
    int high = myList.length;
    int iteration = 0;
    while (myList[i] != num) {
      i = (low + high) / 2;

      if (myList[i] < num) {
        low = i;
      }
      else if (myList[i] > num){ // i > num
        high = i;
      }
      iteration++;
    }
    System.out.println("\nNum Found, iterations = " + iteration);
  }
}
