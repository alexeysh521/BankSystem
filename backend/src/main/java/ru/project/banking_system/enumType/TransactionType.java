package ru.project.banking_system.enumType;

public enum TransactionType {
    DEPOSIT, WITHDRAW, TRANSFER;

    public static TransactionType getTransactionFromString(String type){
        try{
            return TransactionType.valueOf(type.trim().toUpperCase());
        }catch(IllegalArgumentException e){
            throw new IllegalArgumentException("Неверный ввод.");
        }
    }

}
