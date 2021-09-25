
public interface SetInterface {
	/*
     * Elements : objects of type Identifier
     * Structure: none
     * Domain   : all sets with minimum 0 and maximum of MAX_ELEMENTS Identifiers
     *
     * Constructors:
     *
     * Set();
     * PRE  - 
     * POST - A new Set-object has been made and is the empty Set.
     *
     * Set (Set src);
     * PRE  - 
     * POST - A new Set-object has been made and contains a copy of the elements src.
     *
     */
	
	int MAX_ELEMENTS = 20;
	
	void init();
		 /* PRE  -
			POST - The set is now empty
		 */
	
	void addElement (Identifier element) throws Exception; 
		/*  PRE  - 
	   		POST - Success: A copy of element is now in set
	   			 - Failure: Set was full and element is not contained in set
		 */
	
	int size ();
		/* PRE  - 
		   POST - The amount of elements of the set has been returned.
		*/
	
	boolean isEmpty();
		/* PRE  - 
    	   POST - returns true if set is empty
    	   		- returns false if set is not empty
		 */
	
	void removeElement(Identifier element);
		/* PRE  - 
	       POST - Element is not in the set
		 */
	
	boolean checkForPresence(Identifier element);
		/* PRE  - 
		   POST - Returns true if element is contained in set
  		    	- Returns false if element is not contained in set
		 */
	
	Identifier getElement();
		/*  PRE  - Set is not empty
	   		POST - Returns a copy of a random element
		 */

	Set intersection(Set set2);
		/*  PRE  - 
			POST - returns a new set with copies ofThe intersection of set and set2 is returned
		 */
	
	
	Set union(Set set2) throws Exception;
		/*  PRE  - 
			POST - Success: Returns a new set containing copies of all the elements in both sets
			 	   Failure: the union of set and set2 consists of more elements than MAX_ELEMENTS
		 */	
	
	Set difference(Set set2);
		/*  PRE  - 
			POST - Returns a new set containing copies of the elements in set that are not in set2
		 */
	
	Set symmetricDifference(Set set2) throws Exception;
		/*  PRE  - 
			POST - Success: Returns a new set containing copies of the elements in set1 and set2 that are not in their intersection
			 	 - failure: the symmetricdifference of set and set2 consists of more elements than MAX_ELEMENTS
		 */
}