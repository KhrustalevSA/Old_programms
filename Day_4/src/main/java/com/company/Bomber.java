package com.company;

/*class Bomber implements Action{                                                // Одинаковая реализация с истребителем,
    Vehicle_Properties plane_properties = new Vehicle_Properties();            // меняется только урон оружия
    String map[][];
    Bomber(int plane_health, int plane_max_range_of_movement, String name,
        int coordinate_x, int coordinate_y, int ammo_count, String map[][]){

        plane_properties.health_of_vehicle = plane_health;
        plane_properties.max_range_of_movement = plane_max_range_of_movement;
        plane_properties.coordinate_x = coordinate_x;
        plane_properties.coordinate_y = coordinate_y;


        this.map = map;
        plane_properties.map_value = map[plane_properties.coordinate_x][plane_properties.coordinate_y];


    }

    public void go(int x, int y){
        int started_coordinate_x = plane_properties.coordinate_x;
        int started_coordinate_y = plane_properties.coordinate_y;


        if( ( Math.abs(started_coordinate_x - x)) <= plane_properties.max_range_of_movement  &&
                ( Math.abs(started_coordinate_y - y) <= plane_properties.max_range_of_movement )){
            if(map[x][y] == ".") {
                plane_properties.coordinate_x = x;
                plane_properties.coordinate_y = y;

                map[started_coordinate_x][started_coordinate_y] = plane_properties.map_value;
                plane_properties.map_value = map[plane_properties.coordinate_x][plane_properties.coordinate_y];

            } else {
                System.out.println("This place occupied");
            }
        } else {
            System.out.println("This plane can't travel that far away");
        }

    }
    public void fire(int x, int y){

    }
}*/
