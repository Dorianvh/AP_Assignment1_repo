import java.util.Scanner;

public class ap1 {

    Scanner input = new Scanner(System.in).useDelimiter("");
    Set firstSet = new Set();
    Set secondSet = new Set();

    void start(){
        char c = nextChar(input);
        if (c != '}') {
            firstSet.identiefierArray[0].add(c);
        }
        System.out.println(firstSet.identiefierArray[0].print());
    }

    char nextChar (Scanner in) {
        while (in.hasNext()) {
            return in.next().charAt(0);
        }
    }

    public static void main(String[] args) {
        new ap1().start();
    }

}