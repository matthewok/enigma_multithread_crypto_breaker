package com.demo.crypto.enigma.model.crib;

public abstract class Crib {

	protected Integer startIndex;
	protected final String plainText;
	protected final String translation;
	
	protected Crib( String plainText, String translation ) {
		this(null, plainText, translation);
	}
	
	protected Crib( Integer startIndex, String plainText, String translation ) {
		this.startIndex = startIndex;
		this.plainText = plainText;
		this.translation = translation;
	}
	
	
	public Integer getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	
	public char[] getPlainText() {
		return plainText.toCharArray();
	}
	
	public String getTranslation() {
		return translation;
	}
	
	@Override
	public String toString() {
		return plainText;
	}
}