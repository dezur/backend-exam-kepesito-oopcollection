package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    protected int hitPoints;
    protected int damage;
    protected boolean hasArmor;

    abstract public int doDamage();

    public void sufferDamage(int damage) {
        if(hasArmor) {
            hitPoints = hitPoints - (damage / 2);
        } else {
            hitPoints -= damage;
        }
    }
}
