// S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
//      1 1 2
public class SerieCaracteres2 {
    private String uno, dos;
    public SerieCaracteres2(){
        this.uno = "+";
        this.dos = "+";
    }
public void showSerieFor(int nroTerminos){
    if (nroTerminos < 1)
        System.out.println(uno);
    else if (nroTerminos < 2)
        System.out.println(uno + " " + dos);
    else
        System.out.print(uno + " " + dos + " ");
        for (int i = 0; i < nroTerminos; i++) {
            String suma = uno + dos;
            System.out.print(suma + " ");
            uno = dos;
            dos = suma;

    }
}
}