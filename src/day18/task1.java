package day18;

public class task1 {

    public static void main(String[] args) {
        int [] A = {1,3,6,4,1,2};
        int [] A1 = {-1,-3};

        // Find a minimum number which is greater than 0, and not specified in the array.
        System.out.println(solution(A));
        System.out.println(solution(A1));

    }
    public static int solution(int[] A){

        int [] result = new int [100001];

        for(int num : A){
            if(num<0){
                continue;
            }
            result[num] += 1;
        }

        int res = 0;
        for (int i = 1; i < result.length; i++) {
            if(result[i]==0){
                res = i;
                break;
            }
        }
            return res;
    }

}
