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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        ArrayList<Integer> points = new ArrayList<>();
        for (int i = 1; i < nums.size() - 1; i++) {
            int prev = nums.get(i - 1);
            int curr = nums.get(i);
            int next = nums.get(i + 1);
            if (curr > prev && curr > next) {
                points.add(i);
            }
            else if (curr < prev && curr < next) {
                points.add(i);
            }
        }
        if (points.size() < 2) {
            return new int[]{-1, -1};
        }
        int max = points.get(points.size() - 1) - points.get(0);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < points.size(); i++) {
            int distance = points.get(i) - points.get(i - 1);
            if (distance < min) {
                min = distance;
            }
        }
        return new int[]{min, max};
    }
}