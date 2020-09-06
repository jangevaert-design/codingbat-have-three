public class haveThree {
  public boolean haveThree(int[] nums) {
    int count = 0;
    boolean next = false;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 3) {
        next = false;
      }
      if (nums[i] == 3 && next == true) {
        return false;
      }
      if (nums[i] == 3 && next == false) {
        next = true;
        count++;
      }
    }
    if (count == 3) {
      return true;
    } else {
      return false;
    }
  }

}
