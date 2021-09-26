package com.company;

class Item {
    Item next;
    Object value;
}

class List {
    private Item first_element = null;      // Перемеменные для хранения начала
    private Item last_element = null;       // и конца списка

    public void add2head(Object value) {
        Item new_element = new Item(); //Создание нового элемента который будет добавлен в список
        new_element.value = value;

        if (first_element != null) {
            new_element.next = first_element; // Если первый элемент есть, то ссылка нового элемента устанавливается
            first_element = new_element;      // на бывший первый элемент и первым элементом тавновится только что
        } else {                              // добавленный
            first_element = new_element;      // Если первого элемента небыло, то новый элемент становится первым и
            last_element = new_element;       // указатели оба ссылаются на этот единственный жлемент
        }
    }

    public void object_get(int i) {
        Item iterator = new Item(); // Создается объект класса Item для итерирования по имеющемуся списку
        iterator = first_element;   // Итератор устанавливается на первый элемент списка
        int iterator_counter = 1;   // Переменная служит счетчиком количества элементов в списке

        while (iterator_counter != i) {
            if (iterator.next == null) { // Если итератор дошел до конца массива, то поиск прекращается
                System.out.print("You enter wrong number!");
                break;
            } else {
                iterator = iterator.next; // Итератор переходит к следующему элементу списка
                iterator_counter += 1;
            }
        }

        if (iterator_counter == i) { // Если счетчик элементов совпал с входным значением, то искомое число выводится
            System.out.print("Element by number " + i + " is " + iterator.value);
        }
        System.out.println();
    }

    public void print() {
        Item iterator = new Item();
        iterator = first_element;
        while (iterator != null) {                  // Через итератор и цикл выводятся значения всех объектов списка
            System.out.print(iterator.value + "; ");
            iterator = iterator.next;
        }
        System.out.println();
        System.out.println();

    }

    public void add2tail(Object value) {
        Item new_element = new Item();
        new_element.value = value;

        if (first_element != null) {          // Если есть элемент в списке, то ссылка последнего элемнта указывает на
            last_element.next = new_element;  // новый элемент, а добавленный элемент становится концом списка
            last_element = new_element;
        } else {
            first_element = new_element;      //Если в списке пусто то указатели становятся на новый объект
            last_element = new_element;
        }


    }

    public Object remove_element_for_number(int i) {
        Item for_return = new Item();
        Item iterator = new Item();
        iterator = first_element;
        int iterator_counter = 1;

        if (i != 1) {
            while (iterator_counter != i - 1) {
                if (iterator.next.next == null) {
                    System.out.print("You enter wrong element!");
                    return "";
                } else {
                    iterator = iterator.next;       //Поиск заданного значения
                    iterator_counter += 1;          //
                }
            }

            if (iterator_counter == i - 1) {
                for_return = iterator.next;
                iterator.next = iterator.next.next;
            }
            System.out.println();
            return ("You deleted the element " + for_return.value); //Возвращение нужного значения
        } else {
            first_element = first_element.next;
            return ("You deleted the element " + first_element.value);       // Возвращение первого значения если первый элмент списка удовлетворяет
        }                                       // условию
    }

    public void remove(Object value) {
        Item iterator = first_element;
        while (iterator.next != null) {
            if (iterator.next.value == value) {
                if (last_element == iterator.next) {
                    last_element = iterator;
                }
                iterator.next = iterator.next.next;     // Замена ссылок ненужного элемента
                return;
            }
            iterator = iterator.next;
        }
    }

    public boolean contains(Object obj) {
        Item iterator = new Item();
        iterator = first_element;
        while (iterator != null) {
            if (iterator.value == obj) {        // При нахождении итератором значения, возвращается true
                return true;
            } else {
                iterator = iterator.next;
            }
        }
        return false;                           // false возврщащается если переданный объект не найден
    }

    public int find(Object obj) {
        Item iterator = new Item();
        int iterator_counter = 1;
        iterator = first_element;

        if (first_element.value != obj) {
            while (iterator.next != null) {
                iterator = iterator.next;
                iterator_counter = +1;
            }
        }

        if (iterator.value == obj) {
            return iterator_counter;        // Возвращение порядкового номера элемента
        } else {
            return -1;
        }
    }

    public void reverse() {
        Item iterator = new Item();
        Item iterator_second = new Item();
        last_element = first_element;       //Последний элемент становится первым
        iterator_second = first_element;
        iterator = first_element.next;
        first_element.next = null;          // Ссылка первого элемента становится равна нулю т.к. в будущем этот элемент
                                            // должен стать последним
        while (iterator != null) {
            first_element = iterator;               // Первый элемент сдвигается на 1 вправо,
            iterator = iterator.next;               // Итератор будучи уже сдвинутым сдвигается давльше прошлого тератора на 1 элемент
            first_element.next = iterator_second;   // Ссылка сдвинутого "первого элемента" переворачивается
            iterator_second = first_element;        // Вспомогательному итератору присвается значение элемента с поменянной ссылкой
        }
    }

    public void removeAll(Object value) {
        Item iterator = first_element;

        while (first_element.value == value) {
            first_element = first_element.next;     // Удаление всех вхождение первого элемента если он
        }                                           // удовлетворяет условию

        while (iterator != null) {
            while (iterator.next != null) {
                if (iterator.next.value == value) {
                    iterator.next = iterator.next.next; // удаление элементов
                } else {
                    iterator = iterator.next;
                }
            }
            iterator = iterator.next;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println();
        List list = new List();
        list.add2head(1);
        list.add2head('R');
        list.add2head(3);
        list.add2tail(12);
        list.add2tail("QWE");
        list.add2head(1);
        list.add2head(1);
        list.add2tail(1);
        System.out.print("Вывод всех элементов массива: ");
        list.print();
        System.out.println("Удаление первого элемента");
        System.out.println(list.remove_element_for_number(1));
        list.print();
        System.out.print("Удаление пятого элемента");
        System.out.println(list.remove_element_for_number(5));
        list.print();
        System.out.println("Удаление Символа R ");
        list.remove('R');
        list.print();
        System.out.println("Получение элементов 3 и 4 из списка ");
        list.object_get(3);
        list.object_get(4);
        System.out.println();
        System.out.println("Проверка на вхождение элементов 3, 1, 22, 0 ");
        list.add2tail(22);
        list.print();
        System.out.println(list.contains(3));
        System.out.println(list.contains(1));
        System.out.println(list.contains(22));
        System.out.println(list.contains(0));
        list.add2head(32);
        list.print();
        System.out.println("Находится ли число 4 и 32 в списке");
        System.out.println(list.find(4));
        System.out.println(list.find(32));
        System.out.println();
        System.out.println("Разворот списка");
        list.add2head(1);
        list.add2head(1123);
        list.add2tail(41);
        list.add2head("QWErrty");
        list.add2head(156);
        list.add2tail(7771);
        list.print();
        list.reverse();
        list.print();
        list.add2head(1);
        list.add2head(1);
        list.add2head(1);
        list.add2head(1);
        list.add2tail(1);
        list.add2tail(1);
        list.add2tail(1);
        System.out.println("Удаление всех единиц из списка");
        list.print();
        list.removeAll(1);
        list.print();


    }
}
