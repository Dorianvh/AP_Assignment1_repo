import java.util.Scanner;
import java.io.PrintStream;
import java.util.regex.Pattern;

public class ap1 {

    static final int MAX_NUMBER_OF_ELEMENTS = 10;
    PrintStream out = System.out;


    boolean askSet (Scanner input, String question, Set set) throws Exception {
        do {out.printf("%s", question);
            if (! input.hasNextLine()) {
                out.printf("\n"); // otherwise line with ^D will be overwritten
                return false;
            }
        } while (! inputContainsCorrectSet(input, set));
        return true;
    }

    boolean askBothSets (Scanner input, Set set1, Set set2) {
        try {
           boolean result = askSet(input, "Give first set : ", set1) && askSet(input, "Give second set : ", set2);
           return result;
        } catch (Exception e) {
           System.out.println(e);
        }

        return true;
    }

    char nextChar (Scanner in) {
        return in.next().charAt(0);
    }

    boolean inputContainsCorrectSet(Scanner input, Set set) throws Exception {
        Identifier id = new Identifier();
        StringBuffer sb = new StringBuffer();
        sb.append(input.nextLine());
        input.useDelimiter("");

        if (sb.charAt(0) != '{') {

            throw new Exception("Set needs to starts with: { ");
        }

        if (sb.charAt(sb.length() - 1) != '}') {
            throw new Exception("Set needs to end with: } ");
        }


        for (int i = 1; i < sb.length() - 1;i++){
            if (sb.charAt(i) == ' '){
                set.addElement(id);
                i++;
                id.init(sb.charAt(i));
                i++;

            }
            id.add(sb.charAt(i));

        }
        set.addElement(id);

        return true;
        /*

        char c = nextChar(input);
        while (c != '}' ) {
            id.add(c);
            c = nextChar(input);
            if (c == ' ') {
                c = nextChar(input);
                if (!(nextCharIsLetter(input))) {
                    throw new Exception("Identifier must start with a letter");
                }
                set.addElement(id);
                id.init(c);
                c = nextChar(input);
            }
        }
        set.addElement(id);
        return true;

         */
    }

    boolean nextCharIsLetter (Scanner in) {
        return in.hasNext("[a-zA-Z]");
    }


    boolean nextCharIs(Scanner in, char c) {
        return in.hasNext(Pattern.quote(c+""));
    }


    String printSet(Set s){
        String result = "{";
        while(s.size() != 0){
            Identifier randomElement = s.getElement();
            result.concat(randomElement.print());
            s.removeElement(randomElement);
            result.concat(" ");
        } result.concat("}");
        return result;
    }

    void calculateAndGiveOutput(Set set1, Set set2){

        String difference = printSet(set1.difference(set2));
        out.printf("Difference = %s %n", difference);

        String intersection = printSet(set1.intersection(set2));
        out.printf("Intersection = %s %n",intersection);

        try{
            String union = printSet(set1.union(set2));
            out.printf("Union = %s %n", union);
        } catch (Exception e){
            System.out.println(e);
        }

        try{
            String symmetricDifference = printSet(set1.symmetricDifference(set2));
            out.printf("Sym. Diff. = %s %n", symmetricDifference);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    void start () {
        Scanner in = new Scanner(System.in);
        Set set1 = new Set();
        Set set2 = new Set();
        while (askBothSets(in, set1, set2)) {
            calculateAndGiveOutput(set1, set2);
        }
    }

    public static void main(String[] args) {
        new ap1().start();
    }
}
