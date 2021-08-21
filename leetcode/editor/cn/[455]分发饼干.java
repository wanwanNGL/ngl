//假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。 
//
// 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[
//i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。 
// 
//
// 示例 1: 
//
// 
//输入: g = [1,2,3], s = [1,1]
//输出: 1
//解释: 
//你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
//虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
//所以你应该输出1。
// 
//
// 示例 2: 
//
// 
//输入: g = [1,2], s = [1,2,3]
//输出: 2
//解释: 
//你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
//你拥有的饼干数量和尺寸都足以让所有孩子满足。
//所以你应该输出2.
// 
//
// 
//
// 提示： 
//
// 
// 1 <= g.length <= 3 * 10⁴ 
// 0 <= s.length <= 3 * 10⁴ 
// 1 <= g[i], s[j] <= 2³¹ - 1 
// 
// Related Topics 贪心 数组 排序 👍 364 👎 0

import java.util.Arrays;

/**
 * 分发饼干
 *
 * @author wanwan
 * @date 2021-08-20 21:00:48
 */
class AssignCookies {
    public static void main(String[] args) {

        Solution solution = new AssignCookies().new Solution();
        System.out.println(solution.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 方案一：排序+贪心
         *
         * @param
         * @return
         */
        public int findContentChildren(int[] g, int[] s) {
            // 先进行排序
            Arrays.sort(g);
            Arrays.sort(s);
            int meet = 0;
            // 第i块饼干不一定满足第i个胃口，所以要分别进行计数
            int gIndex = 0;
            for (int i = 0; i < s.length; i++) {
                if (gIndex >= g.length) {
                    break;
                }
                // 如果第一块饼干能满足胃口，则进行计数；否则取下一块饼干进行重试
                if (s[i] >= g[gIndex]) {
                    meet++;
                    // 满足后取下一个
                    gIndex++;
                }
            }
            return meet;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}