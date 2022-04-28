package com.edu;

public class TextEditor {
	private SpellCheck spell;


	




	public TextEditor(SpellCheck spell) {
		super();
		this.spell = spell;
	}







	public void textFunction()
	{
		if(spell!=null)
		{

spell.enable();

		}
		else
		{
			System.out.println("spellcheck is disable");
		}
	}

}
