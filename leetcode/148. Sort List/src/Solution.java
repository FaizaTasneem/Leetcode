import java.util.Scanner;

public class Solution {
    public static ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        int c=0;
        ListNode ln = head;
        for(ListNode n= head; n!=null; n=n.next){
            c++;
        }
        int[] a = new int[c];
        for(int i=0; i<a.length; i++){
            a[i]=ln.val;
            ln=ln.next;
        }
        int temp;
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }

        ListNode [] list1 = new ListNode[a.length];

        for(int i=0; i<list1.length; i++) {
            ListNode n = new ListNode(a[i], null);
            list1[i] = n;
        }

        for(int i=0; i<list1.length-1; i++){
            list1[i].next=list1[i+1];
        }

        return list1[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = 5;
        ListNode [] list1 = new ListNode[size1];

        for(int i=0; i<list1.length; i++){
            ListNode n = new ListNode(sc.nextInt(),null);
            list1[i]=n;

        }

        for(int i=0; i<list1.length-1; i++){
            list1[i].next=list1[i+1];
        }

        //ListNode ans = sortList(list1[0]);
        ListNode ans = sortList(null);
        for(ListNode l=ans; l!=null; l=l.next){
            System.out.print(l.val+"->");
        }
    }
}
