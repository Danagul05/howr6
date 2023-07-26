public class Main {
    public static void main(String[] args) {
    Boss myBoss = new Boss(500, 200,WeaponType.COLD) ;
        System.out.println(myBoss.getDamage());
        System.out.println(myBoss.getHealth());
        System.out.println(myBoss.getWeaponType());


    }
}