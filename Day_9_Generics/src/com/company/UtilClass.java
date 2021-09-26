package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * Сделайте методы типизированными (Используйте generics)
 */
public class UtilClass {
    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static <T> boolean isBlank(List list) {
        if(list == null || list.isEmpty()){
            return true;
        }
        return false;
    }

    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */

    public static <T> Object getLastElem(List<T> list) {
        if (list == null){
            throw new IllegalArgumentException();
        }
        return list.get(list.size() - 1);
    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param list список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <E> Object findElem(List<E> list, Object elem) {
        if (list == null || elem == null){
            throw new IllegalArgumentException();
        }
        for(Object s: list){
            if (s == elem){
                return s;
            }
        }
        return null;
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static<T> List union(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null){
            throw new IllegalArgumentException();
        }
        List<T> list = new ArrayList<>();
        for (T s: list1 ){
            list.add(s);
        }
        for (T s: list2 ){
            list.add(s);
        }
        return list;
    }

    /**
     * Удаляет все элементы из списка list1, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static <T> List removeAll(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null){
            throw new IllegalArgumentException();
        }
        List <T> list = new ArrayList<>();
        for (T s:list1){
            list.add(s);
        }
        for (T s:list){
            for(T s2:list2){
                if (s == s2){
                    list.remove(s);
                }
            }
        }
        return list;
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return сумма чисел.
     */
    public static <T> double sum(List<? extends Number> list1, List<? extends Number> list2) {
        Number sum = 0;
        if(list1 == null || list2 == null){
            throw new IllegalArgumentException();
        }

        for (Number n1:list1){
           sum = sum.doubleValue() + n1.doubleValue();
        }
        for (Number n2:list2){
            sum = sum.doubleValue() + n2.doubleValue();
        }
        return sum.doubleValue();
    }
}
