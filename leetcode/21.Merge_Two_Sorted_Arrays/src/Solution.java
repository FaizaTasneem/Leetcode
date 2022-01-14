import java.util.Scanner;
public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return null;
        }

        ListNode n1 = l1;
        ListNode n2 = l2;
        int c1=0;
        int c2=0;

        for(ListNode n=l1; n!=null; n=n.next){
            c1++;
        }
        for(ListNode n=l2; n!=null; n=n.next){
            c2++;
        }

        int [] a = new int[c1+c2];

        for(int i=0; i<c1; i++) {
            a[i]=n1.val;
            n1=n1.next;
        }
        for(int i=c1; i<c1+c2; i++) {
            a[i]=n2.val;
            n2=n2.next;
        }

        int smallest = 0;

        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    smallest=a[j];
                    a[j]=a[i];
                    a[i]=smallest;
                }

            }
        }

        ListNode [] nodes = new ListNode[a.length];
        ListNode ln = new ListNode(a[0],null);
        nodes[0]=ln;
        for(int i=1; i<nodes.length; i++) {
            ListNode n = new ListNode(a[i],null);
            nodes[i] = n;
            nodes[i-1].next = nodes[i] ;
        }
        return nodes[0];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = 1;
        int size2 = 1;
        ListNode [] list1 = new ListNode[size1];
        ListNode [] list2 = new ListNode[size2];

        /*for(int i=0; i<list1.length; i++){
            ListNode n = new ListNode(sc.nextInt(),null);
            list1[i]=n;

        }
        for(int i=0; i<list2.length; i++){
            ListNode n = new ListNode(sc.nextInt(),null);
            list2[i]=n;
        }

        for(int i=0; i<list1.length-1; i++){
            list1[i].next=list1[i+1];
        }
        for(int i=0; i<list2.length-1; i++){
            list2[i].next=list2[i+1];
        }*/

        //ListNode ans = mergeTwoLists(list1[0],list2[0]);
        list2[0]=new ListNode(0,null);
        ListNode ans = mergeTwoLists(null,list2[0]);
        for(ListNode l=ans; l!=null; l=l.next){
            System.out.print(l.val+"->");
        }
    }
}
