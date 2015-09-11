/**
 * Created by xsun on 15-09-07.
 */
public class Solutions {
    public int singleNumber(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int n = A[0];
        for(int i = 1; i < A.length; i++) {
            n = n ^ A[i];
        }

        return n;
    }

    boolean isBit1(int num, int index)  {
        num = num >> index;
        if((num & 1) == 1){
            return true;
        }else{
            return false;
        }
    }

    int singleNumberII(int[] A) {
        int n = A.length;
        int result = 0;
        for(int i = 0; i < 32; ++i) {
            int count = 0;
            for(int j = 0; j < n; ++j) {
                if(isBit1(A[j], i))
                    ++count;
            }
            result |= (count % 3) << i;
        }
        return result;
    }
}
