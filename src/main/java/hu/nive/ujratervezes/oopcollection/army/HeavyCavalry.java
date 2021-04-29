package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{

    private boolean isFirstAttack = true;

    public HeavyCavalry() {
        this.hitPoints = 150;
        this.damage = 20;
        this.hasArmor = true;
    }

    @Override
    public int doDamage() {
        if (isFirstAttack) {
            isFirstAttack = false;
            return this.damage * 3;
        }
        return this.damage;
    }

    @Override
    public void sufferDamage(int damage) {
        this.hitPoints -= (damage / 2);
    }
}