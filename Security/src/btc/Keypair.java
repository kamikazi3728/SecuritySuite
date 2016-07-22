package btc;

import java.security.SecureRandom;

import org.bitcoinj.core.ECKey;

public class Keypair {
	ECKey keypair;
	
	public void generate(){
		keypair = new ECKey(new SecureRandom());
	}
	
	public String getpriv(){
		return keypair.getPrivateKeyAsHex();
	}
	
	public String getpub(){
		return keypair.getPublicKeyAsHex();
	}
}
