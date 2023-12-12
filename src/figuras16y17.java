public class figuras16y17 {

        public static void f16(int nroNiveles){
            System.out.println();
            for (int i = 0; i < nroNiveles; i++) {
                for (int j = 0; j < nroNiveles; j++) {
                    if (i==j || i==nroNiveles-j) {
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
        public static void f17(int nroNivel){
            System.out.println();
            for (int i = 0; i < nroNivel; i++) {
                for (int j = 0; j < nroNivel; j++) {
                    if (i==j || i==nroNivel-j) {
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

