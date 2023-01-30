package com.gl.dsa;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketsManager {
	
	private static Set<Bracket> predefinedBrackets;

	static {
	                    
	    predefinedBrackets = new LinkedHashSet<Bracket>();
	    
	    // Round brackets / Function brackets
	    predefinedBrackets.add(new Bracket('(', ')'));
	    
	    // Square Brackets / Array brackets
	    predefinedBrackets.add(new Bracket('[', ']'));
	    
	    // Curly brackets / Braces
	    predefinedBrackets.add(new Bracket('{', '}'));
	    
	    // Angle Brackets 
	    predefinedBrackets.add(new Bracket('<', '>'));
	}
	public static Set<Character> getOpenBracketCharsSet(){		
	    
	    Set<Character> result = new LinkedHashSet<Character>();
	    
	    Iterator<Bracket> iterator = predefinedBrackets.iterator();
	    
	    while (iterator.hasNext()) {
	        
	        Bracket bracket = iterator.next();
	        
	        result.add(bracket.getOpenCharacter());			
	    }		
	    return result;
	}
	
	public static Set<Character> getCloseBracketCharsSet(){
	    
	    Set<Character> result = new LinkedHashSet<Character>();
	    
	    Iterator<Bracket> iterator = predefinedBrackets.iterator();
	    
	    while (iterator.hasNext()) {
	        
	        Bracket bracket = iterator.next();
	        
	        result.add(bracket.getCloseCharacter());			
	    }		
	    return result;
	}
	
	public static Bracket getBracket(Character closeBracket) {
        
	    for (Bracket predefinedBracket : predefinedBrackets) {
	        
	        if (predefinedBracket.getCloseCharacter().equals(closeBracket)) {
	            return predefinedBracket;
	        }
	    }
	    return null;
	}




}
