package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        hp = 50;
        damage = 20;
        hasArmor = false;
    }

    @Override
    void sufferDamage(int damage) {
        if (hasArmor) {
            hp = hp - (damage / 2);
        } else hp = hp - damage;
    }
}