package tools;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

/**
 * 
 * @author Reece
 *
 * new Clipboard(String)
 * -Puts the string given into the users clipboard
 */

public class Clipboardtool {
	public Clipboardtool(String theString){
		StringSelection selection = new StringSelection(theString);
	    java.awt.datatransfer.Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(selection, selection);
	}
}
