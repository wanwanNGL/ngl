//给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。 
//
// 请你返回该链表所表示数字的 十进制值 。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：head = [1,0,1]
//输出：5
//解释：二进制数 (101) 转化为十进制数 (5)
// 
//
// 示例 2： 
//
// 输入：head = [0]
//输出：0
// 
//
// 示例 3： 
//
// 输入：head = [1]
//输出：1
// 
//
// 示例 4： 
//
// 输入：head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
//输出：18880
// 
//
// 示例 5： 
//
// 输入：head = [0,0]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 链表不为空。 
// 链表的结点总数不超过 30。 
// 每个结点的值不是 0 就是 1。 
// 
// Related Topics 链表 数学 
// 👍 92 👎 0

import java.util.Stack;

//Java：二进制链表转整数
class ConvertBinaryNumberInALinkedListToInteger{
  public static void main(String[] args) {
    Solution solution = new ConvertBinaryNumberInALinkedListToInteger().new Solution();
    int decimalValue = solution.getDecimalValue(new ListNode(1, new ListNode(0, new ListNode(1))));
    System.out.println(decimalValue);
    // TO TEST
  }

    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    /**
     * 方案一：栈
     *
     * @param
     * @return
     */
    /*public int getDecimalValue(ListNode head) {

      if (head == null) {
        //
        return 0;
      }

      Stack<Integer> stack = new Stack<>();
      ListNode cur = head;
      while (cur != null) {
        stack.push(cur.val);
        cur = cur.next;
      }

      int value = 0;
      int size = stack.size();
      for (int i = 0; i < size; i++) {
        //
        Integer pop = stack.pop();
        if (pop == 1) {
          double v = Math.pow(2, i);
          value += v;
        }
      }
      return value;
    }*/

    /**
     * 方案二：
     *
     * @param
     * @return
     */
    public int getDecimalValue(ListNode head) {

      if (head == null) {
        //
        return 0;
      }

      ListNode cur = head;
      int sum = 0;
      while (cur != null) {
        sum = sum * 2 + cur.val;
        cur = cur.next;
      }
      return sum;
    }
}
  // leetcode submit region end(Prohibit modification and deletion)

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
