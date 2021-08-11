//编写一个方法，找出两个数字a和b中最大的那一个。不得使用if-else或其他比较运算符。 
// 示例： 
// 输入： a = 1, b = 2
//输出： 2
// 
// Related Topics 位运算 脑筋急转弯 数学 
// 👍 89 👎 0

//Java：最大数值
class MaximumLcci{
    public static void main(String[] args) {
        Solution solution = new MaximumLcci().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 方案一：求平均值
     *
     * @param
     * @return
     */
    public int maximum(int a, int b) {
      return (int) ((Math.abs((long) a - (long) b) + (long) a + (long) b) / 2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
