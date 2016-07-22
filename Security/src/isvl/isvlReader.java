package isvl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class isvlReader {
	
	public ArrayList<isvlObject> objects;
	private int i;
	
	public isvlReader(String filename){
		i=0;
		objects = new ArrayList<>();
		try {
			String line;
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while(i == 0){
				line = br.readLine();
				if(line == null){
					i=1;
				}
				else{
					objects.add(new isvlObject(line));
				}
			}
			br.close();
		} catch (IOException e) {}
	}
	
	public isvlObject getisvl(String identifier){
		for (int i = 0; i < objects.size(); i++){
			if(objects.get(i).id.equalsIgnoreCase(identifier)){
				return objects.get(i);
			}
		}
		return null;
	}
	
	public isvlObject getisvl(int number){
		return objects.get(number-1);
	}
	
	public int objectsinFile(){
		return objects.size();
	}
}
