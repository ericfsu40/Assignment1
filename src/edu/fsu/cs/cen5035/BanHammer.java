package edu.fsu.cs.cen5035;

public class BanHammer extends BasicWeapon implements Weapon{

	public BanHammer() {
		super(Integer.MAX_VALUE);
	}

    @Override
    public int hit() {
        return DAMAGE;
    }

	@Override
	public int hit(int armor) {
		//we set our local armor variable to 0 out of spite.
		
		System.out.print("Your account was deleted. Also, ");
		armor = 0;
		return DAMAGE;
	}

}
