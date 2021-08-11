//给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。 
//
// 返回删除后的链表的头节点。 
//
// 注意：此题对比原题有改动 
//
// 示例 1: 
//
// 输入: head = [4,5,1,9], val = 5
//输出: [4,1,9]
//解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
// 
//
// 示例 2: 
//
// 输入: head = [4,5,1,9], val = 1
//输出: [4,5,9]
//解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
// 
//
// 
//
// 说明： 
//
// 
// 题目保证链表中节点的值互不相同 
// 若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点 
// 
// Related Topics 链表 
// 👍 148 👎 0

import lombok.AllArgsConstructor;

//Java：删除链表的节点
class ShanChuLianBiaoDeJieDianLcof{
    public static void main(String[] args) {
        Solution solution = new ShanChuLianBiaoDeJieDianLcof().new Solution();
        solution.deleteNode(new ListNode(4,new ListNode(5,new ListNode(1,new ListNode(9)))),9);
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
    public ListNode deleteNode(ListNode head, int val) {

      if (head == null) {
        return null;
      }

      if (head.val == val) {
        return head.next;
      }

      // 声明一个暂存当前节点前一个节点的变量，用于删除当前节点
      ListNode pre = head;
      ListNode cur = pre.next;

      while (cur != null) {
        if (cur.val == val) {
          // 删除当前节点
          pre.next = cur.next;
          return head;
        } else {
          pre = cur;
          cur = cur.next;
        }
      }

      return head;
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
