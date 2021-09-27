public interface IdentifierInterface {

    /*
    elements: char
    structure: linear
    domain: Alphanumeric rows, starting with a letter
     */

    /*
    Identifier();
    PRE:
    POST: creates new identifier object containing a placeholder
     */

    /*
    Identifier(Identifier src):
    PRE:
    POST(): new Identifier containing copy of elements of src
     */
    void init(char c);
    /*
    PRE: c contains a letter
    POST: the Identifier only contains c
     */

    void add(char c);
    /*
    PRE: c contains a alphanumeric char
    POST:c is add to the end of row of elements
     */

    int size();
    /*
    PRE:
    POST: numberOfElements is returned
     */

    char getElement(int position);
    /*
    PRE: Position => 0 & < size()
    POST: element at position is returned
     */

    boolean isIdentical(Identifier id2);
    /*
     PRE:
     POST: return if identifier is equel to id2.
      */

    public String print();
    /*
    PRE:
    POST: returns all elements of identifier as a string.
     */
}
