//给定单链表的头节点 head ，请反转链表，并返回反转后的链表的头节点。 
//
// 
// 
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
//
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
// 
// 
//
// 
//
// 注意：本题与主站 206 题相同： https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 递归 链表 
// 👍 2 👎 0

//Java：反转链表
class UHnkqh{
    public static void main(String[] args) {
        Solution solution = new UHnkqh().new Solution();
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
      * 方案一：递归
      *
      * @param
      * @return
      */
    public ListNode reverseList(ListNode head) {

      if (head == null || head.next == null) {
        return head;
      }

      // 原本是head.next指向next
      ListNode next = head.next;
      ListNode reverseList = reverseList(next);
      // 反转后应该为next.next指向head
      next.next = head;
      // head的next指向null
      head.next = null;

      return reverseList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
