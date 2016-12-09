import java.io.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class OS {
	/**
	* types of Operating Systems
	*/
	public enum OSType {WINDOWS, LINUX, MAC, OTHER};
	
	public static void showAll() {
		System.getProperties().list(System.out);
	}
	
	/**
	* detect operating system name from the os.name System property
	* 
	* @returns - OS name.
	*/
	public static String getName() {
		return System.getProperty("os.name").toLowerCase();
	}
	
	/**
	* detect operating system version from the os.name System property
	* 
	* @returns - OS name.
	*/
	public static String getVersion() {
		return System.getProperty("os.version").toLowerCase();
	}
	
	/**
	* detect operating system name from the os.name System property
	* 
	* @returns - OS name.
	*/
	public static String getArch() {
		return System.getProperty("os.arch").toLowerCase();
	}
	
	public static boolean isWindows() {
		String osname = getName();
		boolean ret = false;

		if (osname.indexOf("win") >= 0) {
			ret = true;
		}

		return ret;
	}
	
	public static boolean isMac() {
		String osname = getName();
		boolean ret = false;
		
		if ((osname.indexOf("mac") >= 0) || (osname.indexOf("darwin") >= 0)) {
			ret = true;
		}
		return ret;
	}
	
	public static boolean isUnix() {
		String osname = getName();
		boolean ret = false;
		
		if (osname.indexOf("nux") >= 0){
			ret = true;
		}
		return ret;
	}
	
	public static OSType getType() {
		OSType ostype = OSType.OTHER;
		
		if (isWindows()) {
			ostype = OSType.WINDOWS;
		} else if (isUnix()) {
			ostype = OSType.LINUX;
		} else if (isMac()) {
			ostype = OSType.MAC;
		} else {
			ostype = OSType.OTHER;
		}
		
		return ostype;
	}
	
}

public class MainApp {

	/* This is demo java program.
    * This will print 'Hello World' as the output
    */
	
	public static void main(String []args) {
	   
		OS os = new OS();
		System.out.println("Hello World");
		System.out.println("OS: " + os.getType() + " " + os.getVersion() + " " + os.getArch());
		os.showAll();
		//*******************************************************************************************

		/* MySingleton */
		MySingleton singleton = MySingleton.getInstance();
		singleton.demoMethod();
		//*******************************************************************************************

		/* RegExp Example */
		// String to be scanned to find the pattern.
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		// Now create matcher object.
		Matcher m = r.matcher(line);
		if (m.find( )) {
		   System.out.println("\nFound value: " + m.group(0) );
		   System.out.println("Found value: " + m.group(1) );
		   System.out.println("Found value: " + m.group(2) );
		}else {
		   System.out.println("\nNO MATCH");
		}
		
		// #2 ****************************************************
		String REGEX = "\\bcat\\b";
		String INPUT = "cat cat cat cattie cat";

   
		Pattern p = Pattern.compile(REGEX);
		Matcher m2 = p.matcher(INPUT);   // get a matcher object
		int count = 0;

		while(m2.find()) {
			count++;
			System.out.println("Match number "+count);
			System.out.println("start(): "+m2.start());
			System.out.println("end(): "+m2.end());
		}
		//***********************************
		
		REGEX = "foo";
		INPUT = "fooooooooooooooooo";
		Pattern pat = Pattern.compile(REGEX);
		Matcher matcher = pat.matcher(INPUT);   // get a matcher object
		System.out.println("\nlookingAt(): "+matcher.lookingAt());  // true
		System.out.println("matches(): "+matcher.matches());        // false
		
		//**********************************
		String REGEX2 = "dog";
		String INPUT2 = "The dog says meow. " + "All dogs say meow.";
		String REPLACE = "cat";
   
		Pattern p3 = Pattern.compile(REGEX2);
		Matcher m3 = p3.matcher(INPUT2); 
		INPUT2 = m3.replaceAll(REPLACE);
		System.out.println(INPUT2);
		
		//**********************************
		String REGEX4 = "a*b";
		String INPUT4 = "aabfooaabfooabfoob";
		String REPLACE4 = "-";

		Pattern p4 = Pattern.compile(REGEX4);
		Matcher m4 = p.matcher(INPUT4);
		StringBuffer sb = new StringBuffer();
		while(m4.find()) {
			m4.appendReplacement(sb, REPLACE4);
		}
		m4.appendTail(sb);
		System.out.println(sb.toString());

		// ^	Matches the beginning of the line.
		// $	Matches the end of the line.
		// .	Matches any single character except newline. Using m option allows it to match the newline as well.
		// [...]	Matches any single character in brackets.
		// [^...]	Matches any single character not in brackets.
		// \A	Beginning of the entire string.
		// \z	End of the entire string.
		// \Z	End of the entire string except allowable final line terminator.
		// re*	Matches 0 or more occurrences of the preceding expression.
		// re+	Matches 1 or more of the previous thing.
		// re?	Matches 0 or 1 occurrence of the preceding expression.
		// re{ n}	Matches exactly n number of occurrences of the preceding expression.
		// re{ n,}	Matches n or more occurrences of the preceding expression.
		// re{ n, m}	Matches at least n and at most m occurrences of the preceding expression.
		// a| b	Matches either a or b.
		// (re)	Groups regular expressions and remembers the matched text.
		// (?: re)	Groups regular expressions without remembering the matched text.
		// (?> re)	Matches the independent pattern without backtracking.
		// \w	Matches the word characters.
		// \W	Matches the nonword characters.
		// \s	Matches the whitespace. Equivalent to [\t\n\r\f].
		// \S	Matches the nonwhitespace.
		// \d	Matches the digits. Equivalent to [0-9].
		// \D	Matches the nondigits.
		// \A	Matches the beginning of the string.
		// \Z	Matches the end of the string. If a newline exists, it matches just before newline.
		// \z	Matches the end of the string.
		// \G	Matches the point where the last match finished.
		// \n	Back-reference to capture group number "n".
		// \b	Matches the word boundaries when outside the brackets. Matches the backspace (0x08) when inside the brackets.
		// \B	Matches the nonword boundaries.
		// \n, \t, etc.	Matches newlines, carriage returns, tabs, etc.
		// \Q	Escape (quote) all characters up to \E.
		// \E	Ends quoting begun with \Q.
		
		// public int start() - Returns the start index of the previous match.
		// public int start(int group) - Returns the start index of the subsequence captured by the given group during the previous match operation.
		// public int end() - Returns the offset after the last character matched.
		// public int end(int group) - Returns the offset after the last character of the subsequence captured by the given group during the previous match operation.
		
		// public boolean lookingAt() - Attempts to match the input sequence, starting at the beginning of the region, against the pattern.
		// public boolean find() - Attempts to find the next subsequence of the input sequence that matches the pattern.
		// public boolean find(int start) - Resets this matcher and then attempts to find the next subsequence of the input sequence that matches the pattern, starting at the specified index.
		// public boolean matches() - Attempts to match the entire region against the pattern.
		
		// Replacement methods
		// public Matcher appendReplacement(StringBuffer sb, String replacement) - Implements a non-terminal append-and-replace step.
		// public StringBuffer appendTail(StringBuffer sb) - Implements a terminal append-and-replace step.
		// public String replaceAll(String replacement) - Replaces every subsequence of the input sequence that matches the pattern with the given replacement string.
		// public String replaceFirst(String replacement) - Replaces the first subsequence of the input sequence that matches the pattern with the given replacement string.
		// public static String quoteReplacement(String s) - Returns a literal replacement String for the specified String. This method produces a String that will work as a literal replacement s in the appendReplacement method of the Matcher class.
	   //*******************************************************************************************
	   
	   /* Thread Example */
	   MyRunnable R1 = new MyRunnable( "tread_1");
	   R1.start();
	   
	   MyRunnable R2 = new MyRunnable( "thread_2");
	   R2.start();
	   //*******************************************************************************************
   }
} 