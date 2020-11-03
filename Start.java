package chooseokProject;

import java.util.*;

public class Start {
	private static final String Character = null;
	static Character user;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		user = new Character("Josh", 400, 40);
		//TODO: explain about each room(NEWS)
		/*
		 * EAST hunting room
		 * WEST store
		 * NORTH boss
		 * SOUTH healing room UMUL
		 */
		
		
		//hunting room
		while(true) {
	        System.out.println("\tEAST\t\tNORTH\tSOUTH");
	        System.out.println("\t====\t\t=====\t=====");
	        System.out.println("\tHunting room\tBOSS\tHealing Room");
	        

			String ans = sc.next();
			if(ans.equals("east")) {
				Monster monster;
				if(user.level<=3) {
					monster = new Monster("raptor", 30, 600, 300);
				}
				else if(user.level<=7) {
					monster = new Monster("golem", 40, 1500,400);
				}
				else {
					monster = new Monster("dragon", 60, 2000,500);
				}
				fight(monster);
			}
			else if(ans.equals("south")) {
				//TODO: healing mention
				System.out.println("\tSouth healing station");
		        System.out.println("\t__________________________________________________\t");
		        System.out.println("\tThis is a healint station it will heal up your HP");
		        System.out.println("\t__________________________________________________");


				user.hp = user.maxHp;
			}
			else {
				Monster monster = new Monster("Boss", 100, 4000, 0);
				fight(monster);
			}
		
			
		}
			
		
	}
	//Boss
			//while(true) {
	
	public static void fight(Monster monster) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			//TODO: run or attack 
			monster.showStatus();
			System.out.println("fight / run");
			String ans = sc.next();
			if(ans.equals("run")) {
				break;
			}else {
				user.attack(monster);
				if(monster.hp>0) {
					monster.attack(user);
				}else {
					user.level++;
					user.hp+=70;
					user.maxHp += 70;
					user.ad+=10;
					user.critical+=5;
					user.gold+=monster.dropMoney;
					break;
				}
				user.showStatus();
				monster.showStatus();
				if(user.hp<0) {
					System.out.println("GG");
					System.out.println("Game Restart");
					main(null);
				}
			}
			
		}

	}
	
}
