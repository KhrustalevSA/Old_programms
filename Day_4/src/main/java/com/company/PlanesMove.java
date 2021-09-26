package com.company;

public class PlanesMove implements Plane{
    boolean move;

    boolean plane_moves_on_plus_x(String map[][], Vehicle_Properties plane_properties){
        for (int i=0; i<3; i++) {
            if ( map[plane_properties.coordinate_x + plane_properties.movement_speed][plane_properties.coordinate_y] == plane_properties.where_vehicle_can_move[i] ) {
                return true;
            }
        }
        return false;
    }
    boolean plane_moves_on_minus_x(String map[][], Vehicle_Properties plane_properties){
        for (int i=0; i<3; i++) {
            if ( map[plane_properties.coordinate_x - plane_properties.movement_speed][plane_properties.coordinate_y] == plane_properties.where_vehicle_can_move[i] ) {
                return true;
            }
        }
        return false;
    }
    boolean plane_moves_on_plus_y(String map[][], Vehicle_Properties plane_properties){
        for (int i=0; i<3; i++) {
            if ( map[plane_properties.coordinate_x][plane_properties.coordinate_y + plane_properties.movement_speed] == plane_properties.where_vehicle_can_move[i] ) {
                return true;
            }
        }
        return false;
    }
    boolean plane_moves_on_minus_y(String map[][], Vehicle_Properties plane_properties){
        for (int i=0; i<3; i++) {
            if ( map[plane_properties.coordinate_x][plane_properties.coordinate_y - plane_properties.movement_speed] == plane_properties.where_vehicle_can_move[i] ) {
                return true;
            }
        }
        return false;
    }

    void go(int x, int y,String map[][], Vehicle_Properties plane_properties){
        if(map[x][y] =="." || map[x][y] =="^^" ||map[x][y] =="~"){
            if( Math.abs(plane_properties.coordinate_x - x) <= plane_properties.max_range_of_movement &&
                    Math.abs(plane_properties.coordinate_y - y) <= plane_properties.max_range_of_movement){
                move = true;
                while(move) {

                    map[plane_properties.coordinate_x][plane_properties.coordinate_y] = plane_properties.map_value;

                    if (x < plane_properties.coordinate_x) {
                        if (plane_moves_on_minus_x(map,plane_properties)) {
                            if ( plane_properties.coordinate_x != plane_properties.coordinate_x - plane_properties.movement_speed &&
                                    plane_properties.coordinate_x != x) {
                                plane_properties.coordinate_x--;
                            }
                        }

                    }
                    if (x > plane_properties.coordinate_x) {
                        if (plane_moves_on_plus_x(map, plane_properties)) {
                            if ( plane_properties.coordinate_x != plane_properties.coordinate_x + plane_properties.movement_speed &&
                                    plane_properties.coordinate_x != x) {
                                plane_properties.coordinate_x++;
                            }
                        }
                    }
                    if (y < plane_properties.coordinate_y) {
                        if( plane_moves_on_minus_y(map,plane_properties)) {
                            if(plane_properties.coordinate_y != plane_properties.coordinate_y - plane_properties.movement_speed &&
                                    plane_properties.coordinate_y != y){
                                plane_properties.coordinate_y--;
                            }
                        }
                    }
                    if (y > plane_properties.coordinate_y) {
                        if( plane_moves_on_plus_y(map, plane_properties) ) {
                            if(plane_properties.coordinate_y != plane_properties.coordinate_y + plane_properties.movement_speed &&
                                    plane_properties.coordinate_y != y){
                                plane_properties.coordinate_y++;
                            }
                        }
                    }
                    plane_properties.map_value = map[plane_properties.coordinate_x][plane_properties.coordinate_y];
                    map[plane_properties.coordinate_x][plane_properties.coordinate_y] = plane_properties.vehicle_name;
                    move = false;
                }

            }
        }

    }
}
