import java.awt.*;
import java.util.Scanner;

public class ap2 {
    Set firstSet = new Set();
    Set secondSet = new Set();
    Identifier id = new Identifier();


    void getFirstSet(){
        System.out.println("Give the first set:");
        try {
            getInput(firstSet);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    void getSecondSet(){
        System.out.println("Give the second set:");
        try {
            getInput(secondSet);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    void getInput(Set s) throws Exception {

        Scanner in = new Scanner(System.in).useDelimiter("");
        if (nextChar(in) != '{') {
            throw new Exception("Set needs to starts with: { ");
        }

        char c = nextChar(in);
        while (c != '}' ){
            id.add(c);
            c = nextChar(in);
            if (c == ' '){
               // System.out.println(id.print());
                c = nextChar(in);
                s.addElement(id);
              //  id = new Identifier();
                id.init(c);
                c = nextChar(in);
                }
            }
        s.addElement(id);
        }




    void operations(){
        try {
            firstSet.union(secondSet);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    void printSet(Set s){
        //for (int )
    }
    void start() {
        getFirstSet();
        getSecondSet();
    }






    char nextChar (Scanner in) {
        return in.next().charAt(0);
    }

    public static void main(String[] args) {
        new ap2().start();
    }
}
