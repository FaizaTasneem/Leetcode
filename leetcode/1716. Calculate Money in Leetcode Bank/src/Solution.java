public class Solution {
    public static void main(String[] args) {
        System.out.println(totalMoney(20));
    }
    public static int totalMoney(int n) {
        int total = 0;
        int [] bank = new int[n];
        for(int i=0; i<bank.length; i++){
            if(i%7==0){
                int round = i/7+1;
                bank[i] = round;
            }
            else{
                bank[i] = bank[i-1]+1;
            }
        }
        for(int i=0; i<bank.length; i++){
            total=total+bank[i];
        }
        return total;
    }
}
