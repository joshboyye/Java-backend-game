package chooseokProject;

public class Monster {
	//Instance Variable 
	
	String name;
	int att, hp;
	int dropMoney;
	//constrator 
	public Monster (String monsterName, int ad, int heath, int drop) {
		name = monsterName;
		att = ad;
		hp = heath;
		dropMoney = drop;
			
	}
	//method 
	public void monster() {
		System.out.println("Monster name " + name + " Attatck dam " + att + "Heath" + hp);
			
	}
	
	public void attack(Character ash) {
		ash.hp = ash.hp-att;	
	}
	
	public void showStatus() {
		System.out.println(name +" has "+att+" attack power, "+ 
				"and "+hp+"hp");
		
	}
	
	
}

