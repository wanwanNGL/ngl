//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 栈 递归 链表 双指针 
// 👍 167 👎 0

import java.util.Arrays;
import java.util.Stack;

//Java：从尾到头打印链表
class CongWeiDaoTouDaYinLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
        ListNode node = new ListNode(1);
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        node.next = listNode;

        int[] ints = solution.reversePrint(node);
        System.out.println(ints);
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
    public int[] reversePrint(ListNode head) {
      if (head == null) {
        return new int[0];
      }

      Stack<ListNode> stack = new Stack();
      stack.push(head);
      while (head.next != null) {
        stack.push(head.next);
        head = head.next;
      }

      int[] ints = new int[stack.size()];
      int index = 0;
      while (!stack.isEmpty()) {
        ints[index] = stack.pop().val;
        index++;
      }

      return ints;
    }

    /**
     * 方案二：递归
     *
     * @param
     * @return
     */
    /*public int[] reversePrint(ListNode head) {
      if (head == null) {
        return new int[0];
      }

      int[] ints = reversePrint(head.next);
      // 当前节点有后继节点时，根据当前节点的值加入后继节点返回的数组构建新的数组
      if (ints.length > 0) {
        int[] copy = Arrays.copyOf(ints, ints.length + 1);
        copy[ints.length] = head.val;
        return copy;
      }

      // 无后继节点时返回当前节点本身的值
      int[] copy = new int[1];
      copy[0] = head.val;
      return copy;
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)
public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

}
