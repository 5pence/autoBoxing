package com.spencer;

import java.util.ArrayList;
import java.util.List;

public class Gremlin implements ISaveable {

    private int hitpoints = 100;
    private int attackStrength, defense;
    private String description;

    public Gremlin(int hitpoints, int attackStrength, int defense, String description) {
        this.hitpoints = hitpoints;
        this.attackStrength = attackStrength;
        this.defense = defense;
        this.description = description;
    }

    @Override
    public List write() {
        List<String> gremlin = new ArrayList<String>();
        gremlin.add(0, "" + this.hitpoints);
        gremlin.add(1, "" + this.attackStrength);
        gremlin.add(2, "" + this.defense);
        gremlin.add(3, this.description);
        return gremlin;
    }

    @Override
    public void read(List<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.hitpoints = Integer.parseInt(arrayList.get(0));
            this.attackStrength = Integer.parseInt(arrayList.get(1));
            this.defense = Integer.parseInt(arrayList.get(2));
            this.description = arrayList.get(3);
        }
    }

    @Override
    public String toString() {
        return "Gremlin{" +
                "hitpoints=" + hitpoints +
                ", attackStrength=" + attackStrength +
                ", defense=" + defense +
                ", description='" + description + '\'' +
                '}';
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
