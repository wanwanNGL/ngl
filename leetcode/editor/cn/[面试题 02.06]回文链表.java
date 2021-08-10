//编写一个函数，检查输入的链表是否是回文的。 
//
// 
//
// 示例 1： 
//
// 输入： 1->2
//输出： false 
// 
//
// 示例 2： 
//
// 输入： 1->2->2->1
//输出： true 
// 
//
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 栈 递归 链表 双指针 
// 👍 76 👎 0

import java.util.Stack;

//Java：回文链表
class PalindromeLinkedListLcci{
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedListLcci().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
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

      if (head == null) {
        return true;
      }

      Stack<Integer> stack = new Stack();
      ListNode cur = head;
      while (cur != null) {
        stack.push(cur.val);
        cur = cur.next;
      }

      cur = head;
      while (cur != null) {
        if (cur.val == stack.pop()) {
          cur = cur.next;
          continue;
        } else {
          return false;
        }
      }

      return true;
    }
}
  // leetcode submit region end(Prohibit modification and deletion)
  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
