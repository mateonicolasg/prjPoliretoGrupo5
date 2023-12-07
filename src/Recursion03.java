public class Recursion03{
    public int recusion03(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + recusion03(a, b - 1);
        }
    }
}