package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NameGenerator {

    // class variable
    private final static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
    private final static String digits = "12345674890";

    private final static java.util.Random rand = new java.util.Random();

    // consider using a Map<String,Boolean> to say whether the identifier is being used or not
    private final static Set<String> identifiers = new HashSet<String>();

    private final static Set<Integer> numericIds = new HashSet<Integer>();

    public static String randomIdentifier() {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }

    public static int randomNumericIdentifier(){
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = 5;
            for(int i = 0; i < length; i++) {
                builder.append(digits.charAt(rand.nextInt(digits.length())));
            }
            if(numericIds.contains(Integer.parseInt(builder.toString()))) {
                builder = new StringBuilder();
            }
        }
        return Integer.parseInt(builder.toString());
    }

    public static String[] getNames(int quantity) {

        List<String> allNames = new ArrayList<>();
        //parsing a CSV file into Scanner class constructor
        Scanner sc = null;
        try {
            sc = new Scanner(new File("random_names_fossbytes.csv"));
            sc.useDelimiter("\r\n");   //sets the delimiter pattern
            while (sc.hasNext())  //returns a boolean value
            {
                allNames.add(sc.next());
            }
            sc.close();  //closes the scanner
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.shuffle(allNames);
        List<String> selected = allNames.subList(0, quantity);
        return selected.toArray( new String[selected.size()]);

    }

    public static void main(String[] args){
        NameGenerator.getNames(10);
        for(int i = 0; i< 20; i++){
            IBIO.output(NameGenerator.randomIdentifier());
        }

    }
}
