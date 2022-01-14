import java.math.BigDecimal;
import java.util.Scanner;

public class Solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "";
        String s2 = "";
        ListNode n1 = l1;
        ListNode n2 = l2;
        int c1=0;
        int c2=0;

        for(ListNode n=l1; n!=null; n=n.next){
            c1++;
        }
        int [] a1 = new int[c1];
        for(int i=a1.length-1; i>=0; i--){
            a1[i]=n1.val;
            n1=n1.next;
        }

        for(ListNode n=l2; n!=null; n=n.next){
            c2++;
        }
        int [] a2 = new int[c2];
        for(int i=a2.length-1; i>=0; i--){
            a2[i]=n2.val;
            n2=n2.next;
        }

        for(int i=0; i<a1.length; i++){
            s1=s1+String.valueOf(a1[i]);
        }
        for(int i=0; i<a2.length; i++){
            s2=s2+String.valueOf(a2[i]);
        }
        //System.out.println(s1);
        //System.out.println(s2);
        //double x = Double.parseDouble(s1);
        //double y = Double.parseDouble(s2);
        BigDecimal x = new BigDecimal(s1);
        BigDecimal y = new BigDecimal(s2);
        //System.out.println(x);
        //System.out.println(y);
        BigDecimal n3 = x.add(y);
        //System.out.println(n3);
        String s = n3+"";
        //System.out.println(s);
        char[] c = new char[s.length()];
        //System.out.println(c.length);
        int j=0;
        for(int i=c.length-1; i>=0; i--){
            c[j]=s.charAt(i);
            //System.out.println(c[j]);
            j++;
        }
        ListNode [] nodes = new ListNode[s.length()];
        ListNode ln = new ListNode(Character.getNumericValue(c[0]),null);
        nodes[0]=ln;
        for(int i=1; i<nodes.length; i++) {
            ListNode n = new ListNode(Character.getNumericValue(c[i]),null);
            nodes[i] = n;
            nodes[i-1].next = nodes[i] ;
        }
        return nodes[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = 3;
        int size2 = 4;
        ListNode [] list1 = new ListNode[size1];
        ListNode [] list2 = new ListNode[size2];

        for(int i=0; i<list1.length; i++){
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
        }
        ListNode ans = addTwoNumbers(list1[0],list2[0]);
        for(ListNode l=ans; l!=null; l=l.next){
            System.out.print(l.val+"->");
        }
    }
}
