// 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
//
//
// 示例 1：
//
//
// 输入：s = "()"
// 输出：true
//
//
// 示例 2：
//
//
// 输入：s = "()[]{}"
// 输出：true
//
//
// 示例 3：
//
//
// 输入：s = "(]"
// 输出：false
//
//
// 示例 4：
//
//
// 输入：s = "([)]"
// 输出：false
//
//
// 示例 5：
//
//
// 输入：s = "{[]}"
// 输出：true
//
//
//
// 提示：
//
//
// 1 <= s.length <= 104
// s 仅由括号 '()[]{}' 组成
//
// Related Topics 栈 字符串
// 👍 2521 👎 0

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

// leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  public boolean isValid(String s) {

    if (s == null) {
      return false;
    }

    if (s.length() % 2 == 1) {
      return false;
    }

    HashMap<Character, Character> map = new HashMap(3);
    // 闭合的动作应该触发于遇到闭合的括号
    map.put(')', '(');
    map.put(']', '[');
    map.put('}', '{');

    char[] chars = s.toCharArray();

    Stack<Character> characterStack = new Stack<>();

    for (char c : chars) {
      if (map.containsKey(c)) {
        Character character = map.get(c);
        boolean empty = characterStack.isEmpty();
        if (empty) {
          return false;
        }
        Character stackTopCharacter = characterStack.pop();
        // 一对闭合的括号
        if (Objects.equals(character, stackTopCharacter)) {
          continue;
        }
        return false;
      }
      characterStack.push(c);
    }

    // 循环结束还有未出栈的元素表明括号未闭合
    return characterStack.isEmpty();
  }
}
// leetcode submit region end(Prohibit modification and deletion)
