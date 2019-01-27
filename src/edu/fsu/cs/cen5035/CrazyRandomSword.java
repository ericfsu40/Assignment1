package edu.fsu.cs.cen5035;

import java.util.Random;

public class CrazyRandomSword extends BasicWeapon implements Weapon{

	public CrazyRandomSword() {
		super((int) ((Math.random()*95)+4));
	}

    @Override
    public int hit() {
        return DAMAGE;
    }

	@Override
	public int hit(int armor) {
		if(armor <= 3) 
			return DAMAGE;
		
		Random rand = new Random();
		int armorIgnored = 3 + rand.nextInt((int)(armor/3) - 3);
		
		if(DAMAGE-armor+armorIgnored <= 0)
			return 0;
		
		return DAMAGE-armor+armorIgnored;
	}

}
