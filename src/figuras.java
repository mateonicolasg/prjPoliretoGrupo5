public class figuras {

    public void f16(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j || i==n-j) {
                    if (i%2==0 && j%2==0) {
                        System.out.print("- ");
                    }
                    else
                        System.out.print("+ ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void f17(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j || i==n-j) {
                    if (i%2==0 && j%2==0) {
                        System.out.print("0 ");
                    }
                    else
                        System.out.print("1 ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        
    }
    System.out.println();
    }
}