package btc;

import java.security.SecureRandom;

import org.bitcoinj.core.ECKey;
import org.bitcoinj.params.MainNetParams;

public class Keypair {
	ECKey keypair;
	
	public void generate(){
		keypair = new ECKey(new SecureRandom());
	}
	
	@SuppressWarnings("deprecation")
	public String getpriv(){
		return keypair.getPrivateKeyAsWiF(org.bitcoinj.core.NetworkParameters.prodNet());
	}
	
	public String getpub(){
		return keypair.toAddress(MainNetParams.get()).toString();
	}
	
	public void setkey(String priv){ //REDO WILL NOT WORK, hex input, needs Wif input
		new ECKey();
		keypair = ECKey.fromPrivate(hexStringToByteArray(priv));
	}
	
	public byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}
}
