package com.company;


public class Main {

    public static void main(String[] args) {
        int i = 0;
        String card = "";
        Double transferAmount = null;
        BankOnlineException bank = new BankOnlineException();
        String str = null;
        FileRead file = new FileRead();
        card = file.getString();
        System.out.println();

        while (i <= 6){                           // Цикл подставляет разные значения в переменные чтобы выкинулись разные ошибки
            if (i == 0){
                card = "1111 1111 1111";
                transferAmount = 1.0;
            }                      // Неправильный номер карты
            if (i == 1){
                card = "2222 2222 2222 2222";
                transferAmount = 0.0;
            }                      // Сумма перевода 0
            if (i == 2){
                card = "1111 1121 1111 1111";
                transferAmount = 50001.0;
            }                      // Сумма перевода слишком большая, > 50000
            if (i == 3){
                card = "1111 1121 1111 1111";
                transferAmount = -1.0;
            }                      // Сумма перевода отрицательная, < 50000
            if (i == 4){
                card = "1233 1243 1243 1322";
                transferAmount = 100.0;
            }                      // Все впорядке
            if (i == 5){
                card = "2222 2222 2222 2222";
                transferAmount = 100.0;
            }                      // Карта заблокирована
            if (i == 6){
                card = null;
                transferAmount = null;
            }
            try{
                bank.send(card,transferAmount);
            } catch (AllUserExceptions.InvalidNumberCardException e){
                System.out.println("Wrong card number");
            } catch (AllUserExceptions.InvalidTransferAmountException e){
                System.out.println("Wrong transfer amount (Must be > 0 or < 50000 )");
            } catch (NullPointerException e){
                System.out.println("One of the arguments == null");
            } catch (AllUserExceptions.BlockedCardsException e){
                System.out.println("Card is blocked");
            } catch (AllUserExceptions.NullException e){
                System.out.println("One of the arguments == 0");
            }
            i++;
        }


    }
}
