package com.kodilla.bank.homework;

public class CashMachine {
    private int[] moneyIn; // tablica z wartościami int oznaczającymi pieniądze w bankomacie
    private int size;

    public CashMachine() { //konstruktor, który umieszcza wartości początkowe w tablicy
        this.size = 0;
        this.moneyIn = new int[0];
    }
    public void add(int money) { // metoda która dodaje nową kwotę do tablicy, zgodnie z sugestią w zadaniu że pieniądze wybierane z bankomatu mają wartości ujemne nie tworzę metody, która wyjmuje pieniądze tylko chcę trzymać wartości dodatnie i ujemne - zobaczymy czy wyjdzie
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(moneyIn, 0, newTab, 0, moneyIn.length);
        newTab[this.size - 1] = money;
        this.moneyIn = newTab;
    }
    public int[] getMoneyIn() {
        return moneyIn;
    }
    public int getBalance() {   // getBalance to metoda licząca sumę elementów w tabeli moneyIn; zastosowałem gotowca z zadania ze stopniami ucznia tylko nie liczę średniej tylko sumę
        int sum = 0;
        for (int i = 0; i < this.moneyIn.length; i++) {
            sum += this.moneyIn[i];
        }
        return sum;
    }
    public int numberOfTransactions() { // metoda która liczy ilość wykonanych transakcji na podstawie ilości elementów w tabeli - mam nadzieję że ok
        int transactionCount = this.moneyIn.length;

        return transactionCount;
    }



}

