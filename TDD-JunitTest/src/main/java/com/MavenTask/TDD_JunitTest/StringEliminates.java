package com.MavenTask.TDD_JunitTest;

public class StringEliminates 
{
	public String remove(String string) {
		
		int stringLength = string.length();
		String result = " ";
		char firstChar = string.charAt(0);
		char secondChar = string.charAt(1);
		result = string; 
		if((firstChar == 'A') && (secondChar == 'A'))
			result =  string.substring(2,stringLength);
      	else if(firstChar == 'A')
      		result =  string.substring(1,stringLength);
		else if(secondChar == 'A')
		    result = string.charAt(0) + string.substring(2,stringLength);
		return result;
	}
}
