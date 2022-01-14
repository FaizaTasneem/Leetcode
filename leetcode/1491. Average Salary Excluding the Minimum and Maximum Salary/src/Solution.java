import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        int[] a = {8000,9000,2000,3000,6000,1000};
        System.out.println(average(a));
    }
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double avg = 0;
        for(int i=1; i<salary.length-1; i++){
            avg=avg+salary[i];
        }
        avg=avg/(salary.length-2);
        return avg;
    }
}
