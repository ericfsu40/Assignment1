package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "spear":
            	return new Spear();
            case "hammer":
            	return new SimpleHammer();
            case "crs":
            	return new CrazyRandomSword();
            case "banHammer":
            	return new BanHammer();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
