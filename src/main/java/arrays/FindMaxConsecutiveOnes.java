package arrays;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,1,0,0}));
    }
    public int findMaxConsecutiveOnes(int[] numbers) {
        int temp=0;
        int maxConsecutiveOnes=0;
        for (int number: numbers) {
            if(number==1){
             temp++;
             maxConsecutiveOnes=Math.max(temp,maxConsecutiveOnes);
            }else{
                temp=0;
            }
        }
        return maxConsecutiveOnes;
    }
}
