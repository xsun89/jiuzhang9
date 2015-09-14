import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Solutions s = new Solutions();
        int test[] = {1,1,2,3,3,3,2,4,1,4,4,5,2};
        int ret = s.singleNumber2(test);
        System.out.println(ret);

        int test3[] = {1,2,2,3,4,4,5,3};
        ArrayList<Integer> ret3 = s.singleNumber3(test3);
        for (int i = 0; i < ret3.size(); i++) {
            System.out.println(ret3.get(i));
        }
    }
}
