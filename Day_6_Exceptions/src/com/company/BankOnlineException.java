package com.company;



public class BankOnlineException {
    FileRead file = new FileRead();
    String str = "";
    public void send(String cardNumber, double transferAmount){
        str = file.getString();
        if (cardNumber.replaceAll(" ","").length() != 16){
            throw new AllUserExceptions.InvalidNumberCardException("Wrong card number");
        }
        if (transferAmount < 0 || transferAmount > 50000 ){
            throw new AllUserExceptions.InvalidTransferAmountException("Wrong transfer amount (Must be > 0 or < 50000 )");
        }
        if (transferAmount == 0 || cardNumber == null){  // cardNumber always false because we have InvalidNumberCardException
            throw new AllUserExceptions.NullException("One of the arguments == 0");
        }
        if (str.contains(cardNumber)){
            throw new AllUserExceptions.BlockedCardsException("Card is blocked");
        }

    }
}
