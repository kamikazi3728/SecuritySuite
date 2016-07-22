package isvl;

public class isvlObject {
	
	public String id;
	public String style;
	public String value;
	public String piece[];
	
	public isvlObject(String line){
		id = "unassigned";
		style = "unassigned";
		value = "unassigned";
		piece = line.split(":");
		id = piece[0];
		style = piece[1];
		value = piece[2];
	}
	
	public void setid(String val){
		id=val;
	}
	public void setstyle(String val){
		style=val;
	}
	public void setvalue(String val){
		value=val;
	}
	
	public String getpart(int number){
		return(piece[number]);
	}
}
