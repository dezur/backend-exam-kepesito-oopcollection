package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{

    private boolean hasShield = true;

    public Swordsman(boolean hasArmor) {
        this.hitPoints = 100;
        this.damage = 10;
        this.hasArmor = hasArmor;
    }


    @Override
    public int doDamage() {
        this.hasArmor = false;
        return this.damage;
    }


}