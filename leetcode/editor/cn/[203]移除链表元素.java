//给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,6,3,4,5,6], val = 6
//输出：[1,2,3,4,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [], val = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [7,7,7,7], val = 7
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 列表中的节点数目在范围 [0, 104] 内 
// 1 <= Node.val <= 50 
// 0 <= val <= 50 
// 
// Related Topics 递归 链表 
// 👍 671 👎 0

import lombok.Data;

//Java：移除链表元素
class RemoveLinkedListElements{
  public static void main(String[] args) {
    Solution solution = new RemoveLinkedListElements().new Solution();
    ListNode listNode =
        solution.removeElements(
            new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))), 7);
    System.out.println(listNode);
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
    * 迭代
    *
    * @param
    * @return
    */
    public ListNode removeElements(ListNode head, int val) {

      if (head == null) {
        return null;
      }

      ListNode newListNode = new ListNode(-1);
      newListNode.next = head;
      ListNode cur = newListNode;
      while (cur.next != null) {
        if (cur.next.val != val) {
          cur = cur.next;
        } else {
          cur.next = cur.next.next;
        }
      }

      return newListNode.next;
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
