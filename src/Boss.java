public class Boss extends GameEntity {
    private WeaponType weaponType;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
    public Boss (int health, int damage, WeaponType weaponType){
        super();
        this.setHealth(health);
        this.setDamage(damage);
        this.setWeaponType(weaponType);


    }

}
