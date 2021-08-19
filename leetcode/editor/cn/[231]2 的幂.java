//给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。 
//
// 如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 1
//输出：true
//解释：20 = 1
// 
//
// 示例 2： 
//
// 
//输入：n = 16
//输出：true
//解释：24 = 16
// 
//
// 示例 3： 
//
// 
//输入：n = 3
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：n = 4
//输出：true
// 
//
// 示例 5： 
//
// 
//输入：n = 5
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// -231 <= n <= 231 - 1 
// 
//
// 
//
// 进阶：你能够不使用循环/递归解决此问题吗？ 
// Related Topics 位运算 递归 数学 
// 👍 393 👎 0

//Java：2 的幂
class PowerOfTwo {
    public static void main(String[] args) {
        Solution solution = new PowerOfTwo().new Solution();

        System.out.println(Integer.toBinaryString(16));
        System.out.println(Integer.toBinaryString(15));
        System.out.println(16 & 15);
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
//        /**
//         * 方案一：位运算
//         *
//         * @param
//         * @return
//         */
//        public boolean isPowerOfTwo(int n) {
//            return n > 0 && (n & (n - 1)) == 0;
//        }

        /**
         * 方案二：数学法
         * @param
         * @return
         */
        public boolean isPowerOfTwo(int n) {
            if (n == 0) {
                return false;
            }
            if (n == 1) {
                return true;
            }
            while (n > 1) {
                int remain = n % 2;
                if (remain == 1) {
                    return false;
                }
                n = n / 2;
                if (n == 1) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
