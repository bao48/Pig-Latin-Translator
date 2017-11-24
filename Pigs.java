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
        piggy = new String[segs.length];    //piggy is what is going to be printed
        
        // If the word starts with a vowel, add "way" right after the world. Wikipedia says "yay" can also be used.
        for (int i=0; i<=segs.length-1; i++) {
            
            // This is for putting punctuation at the end of a word.
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
                
            // If the word starts with consonant clusters. 
            // Here we're assuming that any word with three consonants starting it may be assumed to have a three consonant cluster.
            } else if (!(segs[i].substring(2, 3).equals("a")) &&
                       !(segs[i].substring(2, 3).equals("e")) && 
                       !(segs[i].substring(2, 3).equals("i")) && 
                       !(segs[i].substring(2, 3).equals("o")) && 
                       !(segs[i].substring(2, 3).equals("u")) &&
                       !(segs[i].substring(1, 2).equals("a")) &&
                       !(segs[i].substring(1, 2).equals("e")) && 
                       !(segs[i].substring(1, 2).equals("i")) && 
                       !(segs[i].substring(1, 2).equals("o")) && 
                       !(segs[i].substring(1, 2).equals("u"))) {
                if ((segs[i].substring(segs[i].length()-1).equals("!")) ||
                    (segs[i].substring(segs[i].length()-1).equals(".")) ||
                    (segs[i].substring(segs[i].length()-1).equals("?"))) {
                    piggy[i] = segs[i].substring(3, segs[i].length()-1) + segs[i].substring(0, 3) + "ay" + segs[i].substring(segs[i].length()-1);
                } else {
                    piggy[i] = segs[i].substring(3) + segs[i].substring(0, 3) + "ay";
                }

            // Same thing as previous else if but this one is checking for two consonant clusters
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
                
            // ... And any other word
            } else {
                if ((segs[i].substring(segs[i].length()-1).equals("!")) ||
                    (segs[i].substring(segs[i].length()-1).equals(".")) ||
                    (segs[i].substring(segs[i].length()-1).equals("?"))) {
                    piggy[i] = segs[i].substring(1, segs[i].length()-1) + segs[i].substring(0, 1) + "ay" + segs[i].substring(segs[i].length()-1);
                } else {
                    piggy[i] = segs[i].substring(1) + segs[i].substring(0, 1) + "ay";
                }
            }
            
        }
    }


    // Huge black box that user doesn't need to know about, so this is basically the only power that the user has over this object.
    public void translatePrint() {
        for (int i=0; i<= piggy.length-1; i++){
            System.out.print(piggy[i] + " ");
        }
    }
       
}
