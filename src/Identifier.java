public class Identifier {

    private final static int INITIAL_AMOUNT_OF_ELEMENTS = 10;
    private char[] charArray;
    private int amountOfElements;

    public Identifier(){
        charArray = new char[INITIAL_AMOUNT_OF_ELEMENTS];
        amountOfElements = 0;
    }

    private void copyElements (char[] dest, char[] src, int amount) {
        for (int i = 0; i < amount; i++) {
            dest[i] = src[i];
        }
    }

    public Identifier(Identifier src) {
        charArray = new char[src.charArray.length];
        amountOfElements = src.amountOfElements;
        copyElements(charArray, src.charArray, amountOfElements);
    }

    public void init(char c) {
        amountOfElements = 0;
        add(c);
    }

    private void increaseIdentifiersize () {
        char[] result = new char[2 * charArray.length];
        copyElements(result, charArray, amountOfElements);
        charArray = result;
    }

    public void add(char character) {
        if (amountOfElements == charArray.length) {
            increaseIdentifiersize();
        }

        charArray[amountOfElements] = character;
        amountOfElements += 1;
    }

    public int size() {
        return amountOfElements;
    }


    public String print() {
        return String.valueOf(charArray);
    }

    public boolean isIdentical(Identifier id2){
        return String.valueOf(id2.charArray) == String.valueOf(charArray);
    }

}