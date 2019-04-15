package minion;

public class TeaParty {
	String name;
	boolean isWoman;
	boolean isKnighted;
public String Welcome(String name, boolean isWoman, boolean isKnighted) {
	if(isWoman==true && isKnighted==true) {
		name="Lady " + name;
	}
	else if(isWoman==true && isKnighted==false) {
		name="Ms. " + name;
	}
	else if(isWoman==false && isKnighted==true) {
		name="Sir " + name;
	}
	else if(isWoman==false && isKnighted==false) {
		name="Mr. " + name;
	}
	String output="Hello "  + name ;
	this.name=name;
	this.isWoman=isWoman;
	this.isKnighted=isKnighted;
	return output;
}
}
