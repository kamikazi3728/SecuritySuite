package fxionSecurity;

import tools.Clipboardtool;
import btc.Keypair;

public class tester {
	public static void main(String[] args){
		Keypair key = new Keypair();
		key.generate();
		new Clipboardtool(key.getpub());
	}
}
