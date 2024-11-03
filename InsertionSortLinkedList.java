public class InsertionSortLinkedList{

    /**
     * Sorts the linked list using insertion sort and returns the sorted list.
     * @return the sorted LinkedList
     */
    public LinkedList sort(LinkedList linkedListPreview) {
        if (linkedListPreview.head == null || linkedListPreview.head.next == null) {
            return linkedListPreview;
        }

        LinkedList.Node sorted = null;
        
        LinkedList.Node current = linkedListPreview.head;
        while (current != null) {
            LinkedList.Node next = current.next;

            sorted = sortedInsert(sorted, current);

            current = next;
        }
        
        linkedListPreview.head = sorted;
        return linkedListPreview;
    }

    /**
     * Helper method to insert a node into the sorted part of the list.
     * @param sorted The head of the sorted part of the list.
     * @param newNode The node to insert.
     * @return The new head of the sorted list.
     */
    private LinkedList.Node sortedInsert(LinkedList.Node sorted, LinkedList.Node newNode) {
        if (sorted == null || newNode.value < sorted.value) {
            // Insert at the beginning of the sorted list
            newNode.next = sorted;
            return newNode;
        } else {
            // Traverse the sorted part to find the insertion point
            LinkedList.Node current = sorted;
            while (current.next != null && current.next.value < newNode.value) {
                current = current.next;
            }
            // Insert newNode after current
            newNode.next = current.next;
            current.next = newNode;
        }
        return sorted;
    }
}
