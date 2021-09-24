import java.util.Scanner;
import java.io.PrintStream;

public class ap1 {

    static final int MAX_NUMBER_OF_ELEMENTS = 10;
    PrintStream out;


    boolean askSet (Scanner input, String question, Set set) {
        do {out.printf("%s", question);
            if (! input.hasNextLine()) {
                out.printf("\n"); // otherwise line with ^D will be overwritten
                return false;
            }
        } while (! inputContainsCorrectSet(input, set));
        return true;
    }

    boolean askBothSets (Scanner input, Set set1, Set set2) {
        return askSet(input, "Give first set : ", set1) && askSet(input, "Give second set : ", set2);
    }

    char nextChar (Scanner in) {
        return in.next().charAt(0);
    }

    boolean inputContainsCorrectSet(Scanner input, Set set) throws Exception{
        //check for {} and correct " " delimeters
        input.useDelimiter("");
        if (nextChar(input) != '{') {
            throw new Exception("Set needs to starts with: { ");
            return false;
        }

    }

    Set calculateAndGiveOutput(Set set1, Set set2){
        //give union etc
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
