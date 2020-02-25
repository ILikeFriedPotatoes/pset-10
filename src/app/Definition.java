package app;

public class Definition {
	String definition;
    String POS;
	    
    public Definition(String definition, String POS) {
        this.definition = definition;
        this.POS = POS;
    }
	    
    public String getDefinition() {
    	return definition;
    }
	    
	public String getPOS() {
		return POS;
	}
}
