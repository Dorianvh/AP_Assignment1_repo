import java.util.Scanner;

public class ap {

    Scanner in = new Scanner(System.in).useDelimiter("");
    Identifier identifier = new Identifier();

    void start(){
        System.out.println("Give the first set:");
        try {
            readInput();
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println(identifier.print());
    }

    void readInput() throws Exception{
        char c1 = in.next().charAt(0);
        char c2 = in.next().charAt(0);

            if (c1 != '{'){
                throw new Exception("Set needs to starts with: } ");
        }
    }



    public static void main(String[] args) {
        new ap().start();

    }


}
