public class Main {

    public static void main(String[] args) {
        Solutions s = new Solutions();
        int test[] = {1,1,2,3,3,3,2,4,1,4,4,5,2};
        int ret = s.singleNumberII(test);
        System.out.println(ret);
    }
}
