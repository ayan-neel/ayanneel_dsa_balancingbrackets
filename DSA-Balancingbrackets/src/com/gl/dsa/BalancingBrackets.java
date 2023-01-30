package com.gl.dsa;

import java.util.Set;
import java.util.Stack;

public class BalancingBrackets {
	
	public static boolean evaluate(String s)
	{
		if(s.length()%2!=0)
			return false;
		Stack<Character> stack = new Stack<>();
		Set<Character> openBracketSet = BracketsManager.getOpenBracketCharsSet();
		Set<Character> closeBracketSet = BracketsManager.getCloseBracketCharsSet();
		for(int i=0;i<s.length();i++)
		{
			Character c = s.charAt(i);
			if(openBracketSet.contains(s.charAt(i)))
			{
				stack.push(s.charAt(i));
			}
			else if(closeBracketSet.contains(s.charAt(i)))
			{
				if(stack.isEmpty())
					return false;
				Bracket bracket = BracketsManager.getBracket(c);
				Character  o = stack.pop();
				if(!(o.equals(bracket.getOpenCharacter())))
						return false;
			else
				continue;
				
		}
		
	}
		return stack.isEmpty();
	
	}
}
