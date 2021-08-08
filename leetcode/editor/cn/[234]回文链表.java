//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 栈 递归 链表 双指针 
// 👍 1073 👎 0

import java.util.ArrayList;
import java.util.List;

//Java：回文链表
class PalindromeLinkedList{
  public static void main(String[] args) {
    Solution solution = new PalindromeLinkedList().new Solution();
    System.out.println(solution.isPalindrome(new ListNode(1, new ListNode(0,new ListNode(0)))));
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
    * 方案一：切割法
    *
    * @param
    * @return
    */
    public boolean isPalindrome(ListNode head) {

      if (head == null) {
        return false;
      }

      ArrayList<ListNode> list = new ArrayList<>();
      ListNode cur = head;
      while (cur != null) {
        list.add(new ListNode(cur.val));
        cur = cur.next;
      }

      int middle = list.size() / 2;
      List<ListNode> pre = list.subList(0, middle);
      List<ListNode> suf = list.subList(middle, list.size());
      if (list.size() % 2 == 1) {
        if (middle - 1 < 0) {
          return true;
        }
        pre = pre.subList(0, middle);
        suf = list.subList(middle + 1, list.size());
      }

      for (int i = 0; i < pre.size(); i++) {
        //
        if (pre.get(i).val != suf.get(pre.size() - i - 1).val) {
          return false;
        }
      }

      return true;
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
