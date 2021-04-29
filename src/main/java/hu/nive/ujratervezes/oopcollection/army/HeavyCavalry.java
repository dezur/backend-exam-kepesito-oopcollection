package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{
    private boolean hasShield = true;

    public HeavyCavalry() {
        hp = 150;
        damage = 20;
        hasArmor = true;

    }
    @Override
    int doDamage() {
        if (hasShield) {
            hasShield = false;
            return damage * 3;
        }
        else return damage;
    }


    @Override
    void sufferDamage(int damage) {
        if (hasArmor) {
            hp = hp - (damage / 2);
        } else hp = hp - damage;
    }
}