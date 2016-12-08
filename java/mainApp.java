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
		   System.out.println("Found value: " + m.group(0) );
		   System.out.println("Found value: " + m.group(1) );
		   System.out.println("Found value: " + m.group(2) );
	   }else {
		   System.out.println("NO MATCH");
	   }
	   //*******************************************************************************************
   
   }
} 