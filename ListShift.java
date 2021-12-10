public class ListShift {
    public ListNode shift(ListNode start, int key) {
        ListNode greater = null;
        ListNode beginG = null;
        ListNode lesser = null;
        ListNode beginL = null;

        while (start != null) {
            if (start.info > key) {
                if (beginG == null) {
                    beginG = new ListNode(start.info);
                    greater = beginG;
                } else {
                    greater.next = new ListNode(start.info);
                    greater = greater.next;
                }
            } else {
                if (beginL == null) {
                    beginL = new ListNode(start.info);
                    lesser = beginL;
                } else {
                    lesser.next = new ListNode(start.info);
                    lesser = lesser.next;
                }
            }
            start = start.next;
        }
        if (greater == null) return beginL;

        greater.next = beginL;

        return beginG;
    }
}