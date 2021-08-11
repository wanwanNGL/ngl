//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。 
//
// 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。 
//
// 
//
// 示例： 
//
// 
//给定一个链表: 1->2->3->4->5, 和 k = 2.
//
//返回链表 4->5. 
// Related Topics 链表 双指针 
// 👍 220 👎 0

import lombok.AllArgsConstructor;
import lombok.Data;

//Java：链表中倒数第k个节点
class LianBiaoZhongDaoShuDiKgeJieDianLcof{
  public static void main(String[] args) {
    Solution solution = new LianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();
    ListNode kthFromEnd =
        solution.getKthFromEnd(
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2);
    System.out.println(kthFromEnd);
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
     * 方案一：双指针
     *
     * @param
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {

      if (head == null || k <= 0) {
        return head;
      }

      ListNode fast = head;
      ListNode low = head;
      int times = 0;
      while (fast != null) {
        // 快指针比慢指针先走k步，然后再快、慢指针每次移动一步，当快指针走到最后一个节点时，快指针还是领先慢指针k步，慢指针的下一个节点即为倒数第k个节点
        if (times < k) {
          times++;
          if (fast.next == null) {
            return low;
          } else {
            fast = fast.next;
          }
        } else {
          if (fast.next != null) {
            low = low.next;
          }
          fast = fast.next;
        }
      }

      return low.next;
    }
}
  // leetcode submit region end(Prohibit modification and deletion)

  @Data
  @AllArgsConstructor
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
