package sample2;

import javax.swing.JOptionPane;

public class theNPC {
	private String charName;
	
	public theNPC(String cn) {
		charName=cn;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}
	
	public void say(String diag) {
		game1.print("BOBO");
		game1.print("\n");
		game1.print(diag);
	}
	
	public void talk() {
		game1.print("you cannot talk to BOBO");
	}
	
	public int getResponse(String[] responses) {
		for (String s:responses) {
			game1.print(s);
			game1.print("\n");
		}
		
		String input = JOptionPane.showInputDialog(null, "Choose an option:");
		return Integer.parseInt(input);
	}
	
	
	
}
