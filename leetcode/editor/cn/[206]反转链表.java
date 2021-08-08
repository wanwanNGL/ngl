//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
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
// Related Topics 递归 链表 
// 👍 1885 👎 0

//Java：反转链表
class ReverseLinkedList{
  public static void main(String[] args) {

    Solution solution = new ReverseLinkedList().new Solution();
    ListNode reverseList =
        solution.reverseList(
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    System.out.println(reverseList);
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
    /*public ListNode reverseList(ListNode head) {

      if (head == null  || head.next == null) {
        return head;
      }

      // 返回以head.next为头节点反转后的所有节点的头节点
      ListNode reverseList = reverseList(head.next);

      // head.next节点的下一节点指向头节点head
      head.next.next = head;
      // 头节点的下一节点指向空
      head.next = null;
      return reverseList;
    }*/

    /**
     * 方案二：迭代
     *
     * @param
     * @return
     */
    public ListNode reverseList(ListNode head) {

      ListNode cur = head;
      ListNode pre = null;
      while (cur != null) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
      }
      return pre;
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
