//实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。 
//
// 注意：本题相对原题稍作改动 
//
// 示例： 
//
// 输入： 1->2->3->4->5 和 k = 2
//输出： 4 
//
// 说明： 
//
// 给定的 k 保证是有效的。 
// Related Topics 链表 双指针 
// 👍 76 👎 0

import lombok.AllArgsConstructor;

//Java：返回倒数第 k 个节点
class KthNodeFromEndOfListLcci{
    public static void main(String[] args) {
        Solution solution = new KthNodeFromEndOfListLcci().new Solution();
        solution.kthToLast(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))),2);
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
      * 方案一：返回倒数第 k 个节点
      *
      * @param
      * @return
      */
    public int kthToLast(ListNode head, int k) {

      // 先行节点
      ListNode fast = head;

      // 当前节点
      ListNode cur = head;

      // 给出的k保证是有效的
      while (--k > 0) {
        fast = fast.next;
      }

      while (fast != null) {

        if (fast.next != null) {
          cur = cur.next;
          fast = fast.next;
        } else {
          break;
        }
      }

      return cur.val;
    }
}
  // leetcode submit region end(Prohibit modification and deletion)

    @AllArgsConstructor
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
