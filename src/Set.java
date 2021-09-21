public class Set  {
	private static final int INITIAL_AMOUNT_OF_ELEMENTS = 0;

    private Identifier[] identiefierArray;
    private int amountOfElements;

    public Set () {
    	identiefierArray = new Identifier[INITIAL_AMOUNT_OF_ELEMENTS];
    	amountOfElements = 0;
    }


    public Set (Set src) {
    	identiefierArray = new Identifier[src.identiefierArray.length];
    	amountOfElements = src.amountOfElements;
    	copyElements(identiefierArray, src.identiefierArray, amountOfElements);
    }
    
    public boolean checkForPresence(Identifier element) {
    	
    	for (int i = 0; i < amountOfElements; i++) {
    		if(identiefierArray[i] == element) { //Method Identical
    			return true;
    		}
    	} return false;
    }
    
    public void addElement (Identifier element) throws Exception {
    	if (checkForPresence(element)) {
    		return;
    	}
    	if (amountOfElements == MAX_ELEMENTS) {
    		throw new Exception("");
    		
    	}
    	identiefierArray[amountOfElements] = new Identifier(element);
    	amountOfElements += 1;
    }
    
    private int getIndex(Identifier element) {
    	for (int i = 0; i < amountOfElements; i++) {
    		if(identiefierArray[i] == element) {
    			return i;
    		}
    	} return 0;
    }
    
    public void removeElement(Identifier element) {
    	if (checkForPresence(element) == false) {
    		return;
    	}
    	for (int i = amountOfElements; getIndex(element) > i; i--) {
			identiefierArray [i] = identiefierArray [i - 1];
		}
		amountOfElements -= 1;
    }
    
    public Set intersection(Set set2) {
    	
    	Set intersection = new Set();
    	
    	for(int i = 0; i < amountOfElements; i++) {
    		for(int j = 0; j < set2.amountOfElements; j++) {
    			
    			if(identiefierArray[i].isIdentical(set2.identiefierArray[j])) { //pakt identiefierArray nu de set die achter . staat?
    				try {
						intersection.addElement(set2.identiefierArray[j]);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    			}
    		}
    	}
    	return intersection;
    }
    
    
    public Set union(Set set2) throws Exception{
    	
    	int elementsInUnion = size() + set2.size() - intersection(set2).size();
    	
    	if(elementsInUnion > MAX_ELEMENTS) {
    		throw new Exception("union"); //make exception work
    	}
    	Set union = new Set(set2);
    	
    	for(int i = 0; i < amountOfElements; i++) {
    		union.addElement(identiefierArray[i]);
    	}
    	return union;
    }
    
    public Set difference(Set set2) {
    	Set difference = new Set(set2);
    	
    	for(int i = 0; i < amountOfElements; i++) {
    		for(int j = 0; j < set2.amountOfElements; j++) {
    			
    			if(identiefierArray[i].isIdentical(set2.identiefierArray[j])) {
    				difference.removeElement(identiefierArray[i]);
    			}
    		}
    	}
    	return difference;
    }
    
    //public Set symmetricDifference() throws Exception{
    	//int elementsInSymmetricDifference = 
    	
   // }
    
    public void init () {
    	amountOfElements = 0;
    }

    public boolean isEmpty () {
    	return amountOfElements == 0;
    }

    public int size () {
    	return amountOfElements;
    }
    
    //unnecessary methods
    
    private void copyElements (Identifier[] dest, Identifier[] src, int amount) { //Niet nodig voor deze implementatie
    	for (int i = 0; i < amount; i++) {
    		//dest[i] = new Identifier(src[i]);
    	}
    }
    
    
    private void moveElementsForward(int fromPosition) { // niet nodig voor deze implementatie
    	
    	for (int i = amountOfElements; i >= fromPosition; i--) {
			identiefierArray [i] = identiefierArray [i+1];
		}
    	 
    }


	@Override
	public Identifier getElement() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set symmetricDifference(Set set2) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

    //public void copyElementTo (Identifier[] dest, Identifier[] src, int copyAtIndex) { // Niet nodig voor deze implementatie
    //	dest.push(Identifier(src[copyAtIndex]));
    //}
}


