//实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 2.00000, n = 10
//输出：1024.00000
// 
//
// 示例 2： 
//
// 
//输入：x = 2.10000, n = 3
//输出：9.26100
// 
//
// 示例 3： 
//
// 
//输入：x = 2.00000, n = -2
//输出：0.25000
//解释：2-2 = 1/22 = 1/4 = 0.25
// 
//
// 
//
// 提示： 
//
// 
// -100.0 < x < 100.0 
// -231 <= n <= 231-1 
// -104 <= xn <= 104 
// 
// Related Topics 递归 数学 
// 👍 698 👎 0

//Java：Pow(x, n)
class PowxN{
    public static void main(String[] args) {
        Solution solution = new PowxN().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    /**
     * 方案一：递归 超时
     *
     * @param
     * @return
     */
    /*public double myPow(double x, int n) {
      if (n < 0) {
        return 1 / (x * (myPow(x, Math.abs(n) - 1)));
      }
      if (n == 0) {
        return 1;
      }
      if (n == 1) {
        return x;
      }
      return x * myPow(x, n - 1);
    }*/

    /**
     * 方案二：暴力法 Time Limit Exceeded
     *
     * @param
     * @return
     */
    /*public double myPow(double x, int n) {
      if (n < 0) {
        x = 1 / x;
        n = Math.abs(n);
      }

      double v = 1.0;
      for (int i = 0; i < n; i++) {
        //
        v *= x;
      }
      return v;
    }*/

    /**
      * 方案三：快速幂
      *
      * @param
      * @return
      */
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

        public double quickMul(double x, long N) {
            if (N == 0) {
                return 1.0;
            }
            double y = quickMul(x, N / 2);
            return N % 2 == 0 ? y * y : y * y * x;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}
