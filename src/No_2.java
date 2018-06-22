import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang on 2017/10/10.
 */
public class No_2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        helper(l1, l2, 0);
        if (result.size() == 0) return null;
        ListNode root = new ListNode(result.get(0));
        ListNode current = root;
        for (int i = 1; i < result.size(); i++) {
            current.next = new ListNode(result.get(i));
            current = current.next;
        }
        return root;
    }

    List<Integer> result = new ArrayList<>();

    private List<Integer> helper(ListNode l1, ListNode l2, int count) {
        if (l1 == null && l2 == null) {
            if (count == 1) {
                result.add(1);
            }
            return result;
        }

        int sum = 0;
        sum += (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (count == 1 ? 1 : 0);
        if (sum >= 10) {
            result.add(sum % 10);
        } else {
            result.add(sum);
        }

        if (l1 == null && l2 != null) {
            helper(null, l2.next, sum / 10);
        } else if (l1 != null && l2 == null) {
            helper(l1.next, null, sum / 10);
        } else {
            helper(l1.next, l2.next, sum / 10);
        }


        return result;
    }
}
