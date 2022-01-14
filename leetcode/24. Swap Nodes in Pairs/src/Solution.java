import java.util.Scanner;

public class Solution {
    public static ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        int c=0;
        for(ListNode n=head; n!=null; n=n.next){
            c++;
        }
        int[] a = new int[c];
        int k=0;
        for(ListNode n=head; n!=null; n=n.next){
            a[k]=n.val;
            k++;
        }
        if(c%2==0){
            for(int i=0; i<c-1; i=i+2){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        else{
            for(int i=0; i<c-2; i=i+2){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        ListNode [] list1 = new ListNode[c];

        for(int i=0; i<list1.length; i++){
            ListNode n = new ListNode(a[i],null);
            list1[i]=n;

        }

        for(int i=0; i<list1.length-1; i++){
            list1[i].next=list1[i+1];
        }

        return list1[0];


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = 3;
        ListNode [] list1 = new ListNode[size1];

        for(int i=0; i<list1.length; i++){
            ListNode n = new ListNode(sc.nextInt(),null);
            list1[i]=n;

        }

        for(int i=0; i<list1.length-1; i++){
            list1[i].next=list1[i+1];
        }

        //ListNode ans = swapPairs(list1[0]);
        ListNode ans = swapPairs(null);
        for(ListNode l=ans; l!=null; l=l.next){
            System.out.print(l.val+"->");
        }
    }
}
