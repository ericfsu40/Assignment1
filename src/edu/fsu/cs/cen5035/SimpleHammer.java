package edu.fsu.cs.cen5035;

public class SimpleHammer extends BasicWeapon implements Weapon{

	public SimpleHammer() {
		super(35);
	}

    @Override
    public int hit() {
        return DAMAGE;
    }

	@Override
	public int hit(int armor) {
		if(armor < 30)
			return DAMAGE;
		return DAMAGE-armor;
	}

}
