public class Solution {
    public int[] solve(int[] A) {

        int N = A.length;

        for(int i = 0; i<N; i++){

            int min = i;

            for(int j = i+1; j<N; j++){
                if(A[j]<min){
                    min = j;
                }
            }

            if(min != i){
                int temp = A[j];
                A[j] = A[min];
                A[min] = temp;
            }
        }


    }
}
