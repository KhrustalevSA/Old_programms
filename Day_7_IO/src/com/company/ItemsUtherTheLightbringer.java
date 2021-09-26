package com.company;

import java.io.Serializable;
import java.util.Random;

public class ItemsUtherTheLightbringer implements Serializable {
    public String setItem(){
        String item_name = "";

        Random objGenerator = new Random();
        int itemNumber = objGenerator.nextInt(3);
        if (itemNumber == 0){
            item_name = "Gauntlets of Ogre Strength +3";
        }
        if (itemNumber == 1){
            item_name = "Claws of Attack +9";
        }
        if (itemNumber == 2){
            item_name = "Belt of Giant Strength +6";
        }
        if (itemNumber == 3){
            item_name = "Staff of Teleportation";
        }

        return item_name;
    }
}
