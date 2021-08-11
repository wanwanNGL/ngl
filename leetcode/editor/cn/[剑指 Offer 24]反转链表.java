//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 递归 链表 
// 👍 275 👎 0

import lombok.AllArgsConstructor;
import lombok.Data;

//Java：反转链表
class FanZhuanLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new FanZhuanLianBiaoLcof().new Solution();
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
      * 方案一：递归
      *
      * @param
      * @return
      */
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        // 返回以head.next节点为头节点的所有节点反转后的新的头节点
        ListNode reverseList = reverseList(head.next);
        // 改变原头节点和新头节点的指向关系
        head.next.next = head;
        head.next = null;

        return reverseList;
    }
}
  // leetcode submit region end(Prohibit modification and deletion)

  @Data
  @AllArgsConstructor
  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
