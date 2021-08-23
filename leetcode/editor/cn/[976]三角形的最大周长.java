//给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。 
//
// 如果不能形成任何面积不为零的三角形，返回 0。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：[2,1,2]
//输出：5
// 
//
// 示例 2： 
//
// 输入：[1,2,1]
//输出：0
// 
//
// 示例 3： 
//
// 输入：[3,2,3,4]
//输出：10
// 
//
// 示例 4： 
//
// 输入：[3,6,2,3]
//输出：8
// 
//
// 
//
// 提示： 
//
// 
// 3 <= A.length <= 10000 
// 1 <= A[i] <= 10^6 
// 
// Related Topics 贪心 数组 数学 排序 👍 147 👎 0

import java.util.Arrays;

/**
 * 三角形的最大周长
 *
 * @author wanwan
 * @date 2021-08-23 11:38:09
 */
class LargestPerimeterTriangle {
    public static void main(String[] args) {
        Solution solution = new LargestPerimeterTriangle().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 解题思路：三角形两边之和大于第三边，因此可以尝试尽量取较长的边作为第三边，另外两边长度次之
         *
         * @param
         * @return
         */
        public int largestPerimeter(int[] nums) {
            Arrays.sort(nums);
            for (int i = nums.length - 1; i > 1; i--) {
                if (nums[i] < (nums[i - 1] + nums[i - 2])) {
                    return nums[i] + nums[i - 1] + nums[i - 2];
                }
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}