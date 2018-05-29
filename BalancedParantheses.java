package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Utility;

public class BalancedParantheses {

	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("Enter max size: ");
		int n=u.getInteger();
		/* Creating Stack */
		StackLogic stack = new StackLogic(n);
		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp = u.getString();        
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++)
		{    
		char ch = exp.charAt(i);

			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p = (stack.pop() + 1);
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}
		while (!stack.isEmpty())
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}                        
    }
}