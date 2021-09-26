package com.company;

public class Objects{
    Object all_vehicle_list[] = new Object[4];
    Object planes_list[] = new Object[2];
    Jet[] jet_list = new Jet[10];
    Vehicle_Properties land_vehicles_list[] = new Vehicle_Properties[10];
    Vehicle_Properties ships_list[] = new Vehicle_Properties[10];
    Vehicle_Properties structures_list[] = new Vehicle_Properties[4];
    Objects(){

        all_vehicle_list[0] = planes_list;
        planes_list[0] = jet_list;
    }


}
