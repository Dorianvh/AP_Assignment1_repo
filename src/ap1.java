import java.util.Scanner;

public class ap1 {

    Scanner input = new Scanner(System.in).useDelimiter("");
    Set firstSet = new Set();
    Set secondSet = new Set();
    Identifier a = new Identifier();

    //print statement met getElement en removeElement

    void start(){
        try {
            firstSet.addElement(a);
        } catch (Exception e){

        }


        /*
        char c = nextChar(input);
        if (c != '}') {
            firstSet.identifierArray[0].add(c);
        }
        System.out.println(firstSet.identifierArray[0].print());

         */
    }

    char nextChar (Scanner in) {
            return in.next().charAt(0);
    }

    public static void main(String[] args) {
        new ap1().start();
    }

}