package com.zk.myspring;

public class TextEditor {
	public SpellChecker spellchecker;

	public SpellChecker getSpellchecker() {
		return spellchecker;
	}

	public void setSpellchecker(SpellChecker spellchecker) {
		System.out.println("Inside setSpellchecker");
		this.spellchecker = spellchecker;
	}
	
	public void spellcheck(){
		spellchecker.checkspelling();
	}
}
