package jqueryTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatches {

	private boolean checkMatch2 ( ){
	Pattern pattern = Pattern.compile("[, |]+");
	String[] strs = pattern.split("Java Hello World  Java,Hello,,World|Sun");
	for (int i=0;i<strs.length;i++) {
	    System.out.println(strs[i]);
	}
	return false; 
	}
	
	private boolean checkMatchs(String regex, String content ){
		Pattern p = Pattern.compile("^java.*");
		Matcher m = p.matcher("java不是人");
		boolean b = m.matches();
		System.out.println(b);
		return b;
	}
	public static void main(String[] args) {
		TestMatches  match = new TestMatches();
		match.checkMatchs("^java.*", "java不是人");
		
		match.checkMatch2();
	}
}
