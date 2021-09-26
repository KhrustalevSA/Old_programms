package com.company;

import java.io.Serializable;

public class PaladinUtherTheLightbringer implements Serializable{
    final String name = "Uther the Lightbringer";
    Weapon weapon = new WeaponHammerOfTheLightbringer();
    ItemsUtherTheLightbringer item = new ItemsUtherTheLightbringer();
    private int lvl = 1;
    private int strange = 26;
    private int agility = 19;
    private int intelligence = 24;
    String[] itemsArr = new String[6];

    public void lvlUp(){
        if (lvl != 10) {
            lvl++;
            strange += 2;
            agility += 1;
            intelligence += 1;
        }
    }
    public void getItem(){
        for(int i=0; i<6; i++) {
            if (itemsArr[5] == null){
                if(itemsArr[i] == null){
                    itemsArr[i] = item.setItem();
                    break;
                }
            }
        }
    }
    public String toString(){
        return "Имя = " + name +
                "\nУровень= " + lvl +
                "\nОружие= " + weapon +
                "\nСила= " + strange +
                "\nЛовкость= " + agility +
                "\nИнтелект= " + intelligence;
    }
}
