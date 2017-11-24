// This is the main code to translate english into pig latin!

public class Pigs {

    private final String tidbit;
    private String[] piggy;
    
    public Pigs(String phrase){
        tidbit = phrase;
        translate();
    }

    private void translate() {
        String[] segs = tidbit.split(" ");
        piggy = new String[segs.length];
        for (int i=0; i<=segs.length-1; i++) {
            if ((segs[i].substring(0, 1).equals("a")) || 
                (segs[i].substring(0, 1).equals("e")) || 
                (segs[i].substring(0, 1).equals("i")) || 
                (segs[i].substring(0, 1).equals("o")) || 
                (segs[i].substring(0, 1).equals("u"))) {
                if ((segs[i].substring(segs[i].length()-1).equals("!")) ||
                    (segs[i].substring(segs[i].length()-1).equals(".")) ||
                    (segs[i].substring(segs[i].length()-1).equals("?"))) {
                        piggy[i] = segs[i].substring(0, segs[i].length()-1) + "way" + segs[i].substring(segs[i].length()-1);
                } else {
                    piggy[i] = segs[i] + "way";
                }
            } else if (!(segs[i].substring(1, 2).equals("a")) &&
                       !(segs[i].substring(1, 2).equals("e")) && 
                       !(segs[i].substring(1, 2).equals("i")) && 
                       !(segs[i].substring(1, 2).equals("o")) && 
                       !(segs[i].substring(1, 2).equals("u"))) {
                if ((segs[i].substring(segs[i].length()-1).equals("!")) ||
                    (segs[i].substring(segs[i].length()-1).equals(".")) ||
                    (segs[i].substring(segs[i].length()-1).equals("?"))) {
                    piggy[i] = segs[i].substring(2, segs[i].length()-1) + segs[i].substring(0, 2) + "ay" + segs[i].substring(segs[i].length()-1);
                } else {
                    piggy[i] = segs[i].substring(2) + segs[i].substring(0, 2) + "ay";
                }

            } else {
                if ((segs[i].substring(segs[i].length()-1).equals("!")) ||
                    (segs[i].substring(segs[i].length()-1).equals(".")) ||
                    (segs[i].substring(segs[i].length()-1).equals("?"))) {
                    piggy[i] = segs[i].substring(1, segs[i].length()-1) + segs[i].substring(0, 1) + "ay" + segs[i].substring(segs[i].length()-1);
                } else {
                    piggy[i] = segs[i].substring(1) + segs[i].substring(0, 2) + "ay";
                }
            }
            
        }
    }


    
    public void translatePrint() {
        for (int i=0; i<= piggy.length-1; i++){
            System.out.print(piggy[i] + " ");
        }
    }
       
}
