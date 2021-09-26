package com.company;

class Jet extends PlanesMove {
    Vehicle_Properties jet_properties = new Vehicle_Properties();
    boolean move = true;
    String map[][];
    Jet(int coordinate_x, int coordinate_y, String map[][], Objects objects_on_map){
        for (int i=0; i<10; i++){
            if(objects_on_map.planes_list[i] == null){
                objects_on_map.planes_list[i] = jet_properties ;
                jet_properties.vehicle_name = "J" + Integer.toString(i+1);

                break;
            }
        }

        this.map = map;
        jet_properties.coordinate_y = coordinate_y;
        jet_properties.coordinate_x = coordinate_x;
        jet_properties.max_range_of_movement = 6;
        jet_properties.ammo_count = 50;
        jet_properties.movement_speed = 2;
        jet_properties.health_of_vehicle = 50;
        jet_properties.weapon_type = 1111111111;
        jet_properties.where_vehicle_can_move[0] = ".";
        jet_properties.where_vehicle_can_move[1] = "~";
        jet_properties.where_vehicle_can_move[2] = "^";
        jet_properties.fuel = 100;
        jet_properties.map_value = map[coordinate_x][coordinate_y];
        map[coordinate_x][coordinate_y] = jet_properties.vehicle_name;


    }

}
