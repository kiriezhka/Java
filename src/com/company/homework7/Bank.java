package com.company.homework7;

import java.util.Map;

public class Bank {
    private ATM[] atms; // Сеть банкоматов

    public Bank(int atmCount) {
        this.atms = new ATM[atmCount];
        for (int i = 0; i < atmCount; i++) {
            atms[i] = new ATM();
        }
    }

    public void initializeNetwork(int atmIndex, Map<Integer, Integer> initialBanknotes, int minWithdrawalAmount, int maxWithdrawalCount) throws BankException {
        if (atmIndex < 0 || atmIndex >= atms.length) {
            throw new BankException("Недопустимый индекс банкомата");
        }

        atms[atmIndex].initializeATM(initialBanknotes, minWithdrawalAmount, maxWithdrawalCount);
    }

    public void depositToATM(int atmIndex, Map<Integer, Integer> depositedBanknotes) throws BankException {
        if (atmIndex < 0 || atmIndex >= atms.length) {
            throw new BankException("Недопустимый индекс банкомата");
        }

        atms[atmIndex].depositMoney(depositedBanknotes);
    }

    public Map<Integer, Integer> withdrawFromATM(int atmIndex, int amount) throws ATMException, BankException {
        if (atmIndex < 0 || atmIndex >= atms.length) {
            throw new BankException("Недопустимый индекс банкомата");
        }

        return atms[atmIndex].withdrawMoney(amount);
    }

    public int getTotalAmountInNetwork() {
        int totalAmount = 0;
        for (ATM atm : atms) {
            for (Map.Entry<Integer, Integer> entry : atm.getBanknotes().entrySet()) {
                totalAmount += entry.getKey() * entry.getValue();
            }
        }
        return totalAmount;
    }
}
