package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{
    private boolean hasShield;

    Swordsman(boolean hasArmor) {
        hp = 100;
        damage = 10;
        this.hasArmor = hasArmor;
        hasShield = true;
    }

    @Override
    void sufferDamage(int damage) {
        if (!hasShield) {
            if (hasArmor) {
                hp = hp - (damage / 2);
            } else hp = hp - damage;
        } else hasShield = false;
    }
}