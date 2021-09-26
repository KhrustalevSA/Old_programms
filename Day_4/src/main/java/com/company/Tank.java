package com.company;

/*class Tank implements Action {                                               // Аналогично истребителю и бомбардировщику
    Vehicle_Properties land_transport_properties = new Vehicle_Properties();

    String map[][];

    Tank(int land_transport_health, int land_transport_max_range_of_movement, String name,
         int coordinate_x, int coordinate_y, int ammo_count, String map[][]) {

        land_transport_properties.health_of_vehicle = land_transport_health;
        land_transport_properties.max_range_of_movement = land_transport_max_range_of_movement;
        land_transport_properties.coordinate_x = coordinate_x;
        land_transport_properties.coordinate_y = coordinate_y;
        land_transport_properties.vehicle_name = name;

        this.map = map;
        land_transport_properties.map_value = map[land_transport_properties.coordinate_x][land_transport_properties.coordinate_y];
        this.map[land_transport_properties.coordinate_x][land_transport_properties.coordinate_y] = land_transport_properties.vehicle_name;

    }


    public void go(int x, int y) {
        int started_coordinate_x = land_transport_properties.coordinate_x;
        int started_coordinate_y = land_transport_properties.coordinate_y;


        if ((Math.abs(started_coordinate_x - x)) <= land_transport_properties.max_range_of_movement &&
                (Math.abs(started_coordinate_y - y) <= land_transport_properties.max_range_of_movement)) {
            if (map[x][y] == ".") {
                land_transport_properties.coordinate_x = x;
                land_transport_properties.coordinate_y = y;

                map[started_coordinate_x][started_coordinate_y] = land_transport_properties.map_value;
                land_transport_properties.map_value = map[land_transport_properties.coordinate_x][land_transport_properties.coordinate_y];
                map[land_transport_properties.coordinate_x][land_transport_properties.coordinate_y] = land_transport_properties.vehicle_name;
            } else {
                System.out.println("This place occupied");
            }
        } else {
            System.out.println("This Tank can't travel that far away");
        }

    }

    public void fire(int x, int y) {


    }
}*/
