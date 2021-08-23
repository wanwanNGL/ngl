//给你一个整数数组 arr，只有可以将其划分为三个和相等的 非空 部分时才返回 true，否则返回 false。 
//
// 形式上，如果可以找出索引 i + 1 < j 且满足 (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + 
//arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1]) 
//就可以将数组三等分。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [0,2,1,-6,6,-7,9,1,2,0,1]
//输出：true
//解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
// 
//
// 示例 2： 
//
// 
//输入：arr = [0,2,1,-6,6,7,9,-1,2,0,1]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：arr = [3,3,6,5,-2,2,5,1,-9,4]
//输出：true
//解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
// 
//
// 
//
// 提示： 
//
// 
// 3 <= arr.length <= 5 * 10⁴ 
// -10⁴ <= arr[i] <= 10⁴ 
// 
// Related Topics 贪心 数组 👍 151 👎 0

/**
 * 将数组分成和相等的三个部分
 *
 * @author wanwan
 * @date 2021-08-23 14:27:46
 */
class PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
        Solution solution = new PartitionArrayIntoThreePartsWithEqualSum().new Solution();
        System.out.println(solution.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public boolean canThreePartsEqualSum(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            if (sum % 3 != 0) {
                return false;
            }

            // 左侧中间数组的分界线
            int leftIndex = getIndex(0, arr, sum);
            if (leftIndex < 0) {
                return false;
            }
            int middleIndex = getIndex(leftIndex + 1, arr, sum);
            if (middleIndex < 0) {
                return false;
            }
            int rightIndex = getIndex(middleIndex + 1, arr, sum);
            if (rightIndex < 0) {
                return false;
            }
            return true;
        }

        private int getIndex(int fromIndex, int[] arr, int sum) {
            int value = 0;
            for (int i = fromIndex; i < arr.length; i++) {
                value += arr[i];
                if (sum / 3 - value == 0) {
                    fromIndex = i;
                    return fromIndex;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}