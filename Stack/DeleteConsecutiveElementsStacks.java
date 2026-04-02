import java.util.Stack;
public class DeleteConsecutiveElementsStacks {


        public static String removeConsecutive(String str) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop(); // remove consecutive duplicate
                } else {
                    stack.push(ch);
                }
            }

            // Build result from stack
            String result = "";
            for (char c : stack) {
                result += c;
            }

            return result;
        }

        public static void main(String[] args) {
            String str = "aabbccdde";
            System.out.println(removeConsecutive(str));
        }
    }
