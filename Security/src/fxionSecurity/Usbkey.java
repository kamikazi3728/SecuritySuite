package fxionSecurity;

import isvl.isvlReader;

import java.io.File;

public class Usbkey extends SecurityFactor{
	
	//
	
	public Usbkey(String lockfile, String keyfile, String lockidentity, String keyidentity){
		//get lock file
		File lock = new File(lockfile);
		File key = new File(keyfile);
		if(lock.exists() && !lock.isDirectory()) { 
			if(key.exists() && !key.isDirectory()){
				isvlReader lockreader = new isvlReader(lockfile);
				isvlReader keyreader = new isvlReader(keyfile);
				String storedhash = lockreader.getisvl(lockidentity).getpart(2);
				String input = keyreader.getisvl(keyidentity).getpart(2);
				String inputhash = new Hasher().sha256(input);
				if(inputhash.equalsIgnoreCase(storedhash)){
					System.out.println("hashes equal");
					accept();
				}
				else{
					System.out.println("hashes unequal");
					reject();
				}
			}
			else{
				System.out.println("key file does not exist");
			}
		}
		else{
			System.out.println("lock file does not exist");
		}

		
		
	}
}
