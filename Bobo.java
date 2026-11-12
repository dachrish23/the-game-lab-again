package sample2;

public class Bobo extends theNPC{
	public Bobo() {
		super("Bobo");
	}
	
	@Override
	public void talk() {
		say("Hello there, what is up with you today");
		String[] responses= {
			"Spare me gum, please",
			"you are no help, why not i help ya instead",
			"loan me a quarter, will you",
		};
		
		int option=getResponse(responses);
		
		switch(option) {
		case 1:
			say("ive only got the flaming hot one left, but its not good though");
			break;
		case 2:
			say("sounds a little rude, but i could use a bit of some help");
			break;
		case 3:
			say("hell no!");
			break;
		default:
			say("well, im waiting");
		}
	}
}
