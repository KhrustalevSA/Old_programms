package com.company;

class Map {                                              // Класс карты действия
    int map_row = 15;
    int map_colomn = 15;
    public String map[][] = new String[map_row][map_colomn];

    Map() {                                              // Заполнение карты. "." - земля
        for (int i = 0; i < map_row - 5; i++) {
            for (int j = 0; j < map_colomn; j++) {
                map[i][j] = ".";
            }
        }
        for (int i = map_row - 1; i > map_row - 6; i--) {
            for (int j = 0; j < map_colomn; j++) {
                map[i][j] = "~";
            }
        }
        map[5][4] = "^^";map[5][5] = "^^";map[6][4] = "^^";map[8][2] = "^^";map[2][13] = "^^";map[3][13] = "^^";
        map[11][9] = "^^";map[10][9] = "^^";map[11][8] = "^^";map[4][9] = "^^";map[4][10] = "^^";



    }

    void print_map() {                                   // Метод вывода карты
        for (int i = 0; i < map_row; i++) {
            for (int j = 0; j < map_colomn; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
