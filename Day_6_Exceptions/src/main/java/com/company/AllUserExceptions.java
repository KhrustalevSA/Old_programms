package com.company;

public class AllUserExceptions {

     static class BlockedCardsException extends RuntimeException {
        public BlockedCardsException(String message){
            super(message);
        }
    }

    public static class InvalidNumberCardException extends RuntimeException{
        public InvalidNumberCardException(String message){
            super(message);
        }
    }

    public static class InvalidTransferAmountException extends RuntimeException{
        public InvalidTransferAmountException(String message){
            super(message);
        }
    }

    public static class NullException extends RuntimeException {
        public NullException(String message){
            super(message);
        }
    }
}
