class Solution {
    public ListNode mergeKLists(ListNode[] al) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );

        // Add first node of every list
        for (int i = 0; i < al.length; i++) {
            if (al[i] != null) {
                pq.offer(al[i]);
            }
        }

        ListNode temp = new ListNode(-1);
        ListNode arr = temp;

        while (!pq.isEmpty()) {

            ListNode node = pq.poll();

            arr.next = node;
            arr = arr.next;

            // IMPORTANT: add next node of the current list
            if (node.next != null) {
                pq.offer(node.next);
            }
        }

        return temp.next;
    }
}