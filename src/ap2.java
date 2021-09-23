import java.awt.*;
import java.util.Scanner;

public class ap2 {
    Identifier id = new Identifier();

    void getInput() {

        Scanner in = new Scanner(System.in).useDelimiter("");
        char c = nextChar(in);
        while



    }

    void test(){
        System.out.println(id.print());
    }






    void start() {
        getInput();
    }






    char nextChar (Scanner in) {
        return in.next().charAt(0);
    }

    public static void main(String[] args) {
        new ap2().start();
    }
}
