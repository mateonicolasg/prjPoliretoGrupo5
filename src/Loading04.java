public class Loading04 {
    public void loading04() {
        int retraso = 100; 
        String[] patron = {"0oo", "o0o", "oo0"};
        
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r"  +patron[i % patron.length] + " " + i + "%" ); 

            try {
                Thread.sleep(retraso); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}