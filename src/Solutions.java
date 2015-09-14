import java.util.ArrayList;

/**
 * Created by xsun on 15-09-07.
 */
public class Solutions {
    public int singleNumber(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int n = A[0];
        for (int i = 1; i < A.length; i++) {
            n = n ^ A[i];
        }

        return n;
    }

    boolean isBit1(int num, int index) {
        num = num >> index;
        if ((num & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    int singleNumberII(int[] A) {
        int n = A.length;
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (isBit1(A[j], i))
                    ++count;
            }
            result |= (count % 3) << i;
        }
        return result;
    }

    int singleNumber2(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int a = 0;
        int b = 0;
        for (int i = 0; i < A.length; i++) {
            b = a & (b ^ A[i]);
            a = b | (a ^ A[i]);
        }

        return a;
    }

    ArrayList<Integer> singleNumber3(int[] A) {
        if (A.length == 0) {
            return null;
        }

        int fstRet = A[0];
        for (int i = 1; i < A.length; i++) {
            fstRet = fstRet ^ A[i];
        }

        int msk = 0;
        int fstBit1Index = 0;
        for (; fstBit1Index < 32; fstBit1Index++) {
            if (isBit1(fstRet, fstBit1Index)) {
                break;
            }
        }
        //System.out.println(fstBit1Index);
        msk = 1 << fstBit1Index;
        System.out.println(fstRet - (fstRet & (fstRet - 1)));
        System.out.println(msk);
        int groupFst = 0;
        int groupSnd = 0;
        for (int i = 0; i < A.length; i++) {
            if ((msk & A[i]) == 0) {
                groupFst = groupFst ^ A[i];
            } else
                groupSnd = groupSnd ^ A[i];
        }

        ArrayList<Integer> ret = new ArrayList<Integer>();
        ret.add(groupFst);
        ret.add(groupSnd);

        return ret;
    }

    public int majorityNumber(ArrayList<Integer> nums) {
        if(nums == null || nums.size() == 0){
            return Integer.MIN_VALUE;
        }
        int number = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(count == 0){
                number = nums.get(i);
                count = 1;
            }
            else if(nums.get(i) == number){
                count++;
            }else{
                count--;
            }
        }

        return number;
    }
}

