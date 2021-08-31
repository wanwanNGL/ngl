// 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
// 进阶：你能尝试使用一趟扫描实现吗？
//
//
//
// 示例 1：
//
//
// 输入：head = [1,2,3,4,5], n = 2
// 输出：[1,2,3,5]
//
//
// 示例 2：
//
//
// 输入：head = [1], n = 1
// 输出：[]
//
//
// 示例 3：
//
//
// 输入：head = [1,2], n = 1
// 输出：[1]
//
//
//
//
// 提示：
//
//
// 链表中结点的数目为 sz
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
//
// Related Topics 链表 双指针 👍 1534 👎 0

/**
 * 删除链表的倒数第 N 个结点
 *
 * @author wanwan
 * @date 2021-09-01 01:57:25
 */
class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
    }
    // leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode()
     * {} ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
     * this.next = next; } }
     */
    class Solution {
        /**
         * 方案一：递归
         *
         * @param
         * @return
         */
        int count = 0;

        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null) {
                return null;
            }
            ListNode listNode = removeNthFromEnd(head.next, n);
            count++;
            if (count == n) {
                return listNode;
            } else {
                head.next = listNode;
                return head;
            }
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
