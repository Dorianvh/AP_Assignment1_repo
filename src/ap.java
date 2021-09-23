import java.util.Scanner;

public class ap {


     Set firstSet = new Set();
    Set secondSet = new Set();

    void start(){
        getFirstSet();
        getSecondSet();
    }

    void getFirstSet(){
        System.out.println("Give the first set:");
        try {
            readInput(firstSet);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    void getSecondSet(){
        System.out.println("Give the second set:");
        try {
            readInput(secondSet);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    void readInput(Set set) throws Exception{
        Scanner in = new Scanner(System.in).useDelimiter("");

            if (nextChar(in) != '{'){
                throw new Exception("Set needs to starts with: } ");
        }
            while (in.hasNext()) {

                if (nextChar(in) == ' ');{
                    set.amountOfElements++;
                }
              set.identifierArray[set.amountOfElements].add(nextChar(in));  ;
            }

            in.close();
    }

    char nextChar (Scanner in) {
        return in.next().charAt(0);
    }

    public static void main(String[] args) {
        new ap().start();
    }
}
