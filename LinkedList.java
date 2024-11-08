// a lovely Linked List
public class LinkedList{
        public Node head;
    
        /**
         * inner class for the Nodes
         */
        public static class Node{
            public int value;
            public Node next;
            Node(int value){
                this.value = value;
                next = null;
            }
        }
        /**
         * appends a new value at the end of the Linked List
         * @param value the value that will be appended
         */
        public void append(int value){
            Node newNode = new Node(value);
            if (head == null){
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
    
        // helper funtion for getting the size
        // for testing
        public int size(){
            int i = 0;
            Node temp = head;
            while (temp != null){
                temp = temp.next;
                i++;
            }
            return i;
        }

        // helper function to turn an int[] into a LinkedList
        // for testing
        public static LinkedList toLinkedList(int[] array){
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < array.length; i++){
                linkedList.append(array[i]);
            }
            return linkedList;
        }

        // helper function to turn a LinkedList into an int[]
        // for testing
        public static int[] toInt(LinkedList linkedList){
            int[] array = new int[linkedList.size()];
            Node curr = linkedList.head;
            for (int i = 0; i < linkedList.size() - 1; i++) {
                array[i] = curr.value;
                curr = curr.next;
            }
            return array;
        }
    
    }
    
