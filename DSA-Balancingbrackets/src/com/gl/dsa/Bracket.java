package com.gl.dsa;

public class Bracket {
	private Character openCharacter;
	private Character closeCharacter;
	
	public Bracket(Character openCharacter, Character closeCharacter)
	{
		this.openCharacter = openCharacter;
		this.closeCharacter = closeCharacter;
	}

	public Character getOpenCharacter() {
		return openCharacter;
	}

	public void setOpenCharacter(Character openCharacter) {
		this.openCharacter = openCharacter;
	}

	public Character getCloseCharacter() {
		return closeCharacter;
	}

	public void setCloseCharacter(Character closeCharacter) {
		this.closeCharacter = closeCharacter;
	}

}
