//给定一个链表的 头节点 head ，请判断其是否为回文链表。 
//
// 如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入: head = [1,2,3,3,2,1]
//输出: true 
//
// 示例 2： 
//
// 
//
// 
//输入: head = [1,2]
//输出: fasle
// 
//
// 
//
// 提示： 
//
// 
// 链表 L 的长度范围为 [1, 105] 
// 0 <= node.val <= 9 
// 
//
// 
//
// 进阶：能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
//
// 
//
// 注意：本题与主站 234 题相同：https://leetcode-cn.com/problems/palindrome-linked-list/ 
// Related Topics 栈 递归 链表 双指针 
// 👍 1 👎 0

import java.util.Stack;

//Java：回文链表
class AMhZSa{
  public static void main(String[] args) {
    Solution solution = new AMhZSa().new Solution();
    solution.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))));
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
    public boolean isPalindrome(ListNode head) {

        if (head == null){
            return true;
        }

      ListNode cur = head;

      Stack<Integer> stack = new Stack<>();
      while (cur != null) {
        stack.push(cur.val);
        cur = cur.next;
      }

      cur = head;
      while (cur != null) {
        Integer pop = stack.pop();
        if (cur.val != pop) {
          return false;
        }
        cur = cur.next;
      }

      return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)



     public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
