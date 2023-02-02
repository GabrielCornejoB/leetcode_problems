// https://leetcode.com/problems/merge-two-sorted-lists/
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
package Java;

public class mergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Si alguno de los elementos es nulo, no combinar nada, retornar el otro
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Variable temporal que almacenará los nodos en orden
        ListNode tmp = new ListNode();
        // Variable que apuntará al siguiente elemento de menor valor
        ListNode pointer = tmp;

        while (list1 != null && list2 != null) {
            // Se asigna el valor del nodo menor al puntero, y a ese valor menor se le asigna su siguiente
            if (list1.val < list2.val) {
                pointer.next = list1;
                list1 = list1.next;
            }
            else {
                pointer.next = list2;
                list2 = list2.next;
            }
            // Puntero se asigna a su siguiente
            pointer = pointer.next;
        }

        // Si alguno de los nodos es nulo, al puntero se le asigna el valor del otro nodo
        if (list1 != null) 
            pointer.next = list1;
        else
            pointer.next = list2;

        return tmp.next;
    }
}
