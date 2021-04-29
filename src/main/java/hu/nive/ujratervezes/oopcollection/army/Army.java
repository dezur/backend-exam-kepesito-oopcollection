package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit militaryUnit: militaryUnits) {
            militaryUnit.setHitPoints(militaryUnit.getHitPoints() - damage);
            if(militaryUnit.getHitPoints() < 25) {
                militaryUnits.remove(militaryUnit);
            }
        }
    }

    public int getArmyDamage() {
        return militaryUnits.stream()
                .mapToInt(MilitaryUnit::getDamage)
                .sum();
    }

    public int getArmySize() {
        return militaryUnits.size();
    }
}