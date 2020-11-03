package chooseokProject;

public class Character {
	//instance variable 
	//name, hp, ad, mp, attack speed, ap, level, critical
	int weapon = 0;
	String name;
	int maxHp, hp, ad, level, critical,gold;
	
	int a = 19;
	
	//constructor
	public Character(String userName, int health, int attackDamage) {
		//constructor
		name = userName;
		hp = health;
		maxHp = health;
		ad = attackDamage;
		level = 1;
		critical = 30;
		gold = 0;
	}
	//method - attack, show status.....
	public void attack(Monster monster) {
		if((int)(Math.random()*100)<critical) {
			monster.hp = monster.hp - 2*ad;
			System.out.println("critical!");
		}else {
			monster.hp = monster.hp - ad;
		}
	}
	//System out print 
	//vote return type 없을때 사용하는것 
	public void showStatus(){
		System.out.println( name +" has "+ad+" attack power, " + "and "+ hp +"heath");

	}
	
	public void attack(Character counterpart) {
		counterpart.hp = counterpart.hp - ad;
		System.out.println(name + " attack "+ counterpart.name + " with "+ ad+" att power");
		
	}
	
	
}