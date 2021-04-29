package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit{
    public Archer() {
        this.hitPoints = 50;
        this.damage = 20;
        this.hasArmor = false;
    }


    @Override
    public int doDamage() {
        return this.damage;
    }
}