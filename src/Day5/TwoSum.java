//package Day5;
//import java.util.HashMap;
//import java.util.Map;
//
//  public class TwoSum {
//      public int[] twoSum(int[] nums, int target) {
//          Map<Integer, Integer> map = new HashMap<>();
//          for (int i = 0; i < nums.length; i++) {
//              if (map.containsKey(target - nums[i])) {
//                  return new int[]{ map.get(target - nums[i]), i};
//              }
//              map.put(nums[i], i);
//          }
//          return new int[0];
//      }
//      public static void main(String[] args) {
//          TwoSum twoSum = new TwoSum();
//          int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
//          if (result.length == 0) {
//              System.out.println("No pair exists");
//          } else {
//          System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
//      }
//  }
//  }
