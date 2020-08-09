package arrays;

public class FindNumbersWithEvenNumberDigits {

    public static void main(String[] args) {
        System.out.println(new FindNumbersWithEvenNumberDigits().findNumbers(new int[]{12,345,2,6,7896}));
    }
    public int findNumbers(int[] numbers) {
        int finalResult=0, temp=0,counter=1;
        for (int number: numbers){
            temp=number;
            while(true){
                temp=temp/10;
                if(temp>=1){
                    counter++;
                    continue;
                }else{
                    temp=0;
                    break;
                }
            }
            if(counter%2 ==0){
                finalResult++;
            }
            counter=1;
        }
    return finalResult;
    }

}
