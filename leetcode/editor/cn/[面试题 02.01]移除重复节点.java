//编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。 
//
// 示例1: 
//
// 
// 输入：[1, 2, 3, 3, 2, 1]
// 输出：[1, 2, 3]
// 
//
// 示例2: 
//
// 
// 输入：[1, 1, 1, 1, 2]
// 输出：[1, 2]
// 
//
// 提示： 
//
// 
// 链表长度在[0, 20000]范围内。 
// 链表元素在[0, 20000]范围内。 
// 
//
// 进阶： 
//
// 如果不得使用临时缓冲区，该怎么解决？ 
// Related Topics 哈希表 链表 双指针 
// 👍 116 👎 0

import lombok.AllArgsConstructor;

import java.util.HashSet;

//Java：移除重复节点
class RemoveDuplicateNodeLcci{
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicateNodeLcci().new Solution();
    solution.removeDuplicateNodes(
        new ListNode(
            1,
            new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1)))))));
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
    /*public ListNode removeDuplicateNodes(ListNode head) {

      ListNode outHead = head;
      while (outHead != null) {
        ListNode innerHead = outHead;
        while (innerHead.next != null) {
          if (outHead.val == innerHead.next.val) {
            innerHead.next = innerHead.next.next;
          } else {
            innerHead = innerHead.next;
          }
        }
        outHead = outHead.next;
      }
      return head;
    }*/

    /**
     * 方案二：哈希表
     *
     * @param
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {

      if (head == null) {
        return null;
      }

      HashSet<Integer> hashSet = new HashSet<>();
      hashSet.add(head.val);
      ListNode cur = head;
      while (cur.next != null) {
        ListNode next = cur.next;
        if (hashSet.contains(next.val)) {
          cur.next = cur.next.next;
        } else {
          hashSet.add(next.val);
          cur = cur.next;
        }
      }

      return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @AllArgsConstructor
     public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

}
