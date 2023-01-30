package com.gl.dsa;

public class BalancingBracketsTest {
	static int test=0;
	public static void main(String args[])
	{
		test("[]");
		test("([])))");
	}
	public static void test(String s)
	{
		System.out.printf("test %d: ",++test);
		if(BalancingBrackets.evaluate(s))
			System.out.println("Brackets are balanced");
		else
			System.out.println("Brackets are not balanced");
	}

}
