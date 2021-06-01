package day24;

public class SP {
    public static void main(String[] args) {
        int number = -324545641;
        int i = sortInteger(number);
        System.out.println("i = " + i);

    }

    public static int sortInteger(int number){

        int[] sortArray = new int[10];

        boolean isNegative = number < 0; number = Math.abs(number);

        while(number>0){
            sortArray[number%10] += 1;
            number /= 10;
        }

        for (int i = 0; i < sortArray.length; i++) {

            if(sortArray[i] > 0) {
                int counter = 0;
                while(counter++ < sortArray[i]){
                    number = number*10 + i;
                }
            }
        }
        return (isNegative) ? (-1)*number : number;
    }
}
