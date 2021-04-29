package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    protected int hp;
    protected int damage;
    protected boolean hasArmor;

    public int getHp() {
        return hp;
    }

    int doDamage() {
        return damage;
    }

    abstract void sufferDamage(int damage);

}