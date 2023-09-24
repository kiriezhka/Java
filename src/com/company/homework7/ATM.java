package com.company.homework7;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    public Map<Integer, Integer> getBanknotes() {
        return banknotes;
    }
    private Map<Integer, Integer> banknotes; // Номинал банкноты и их количество
    private int minWithdrawalAmount; // Минимальная сумма для снятия
    private int maxWithdrawalCount; // Максимальное количество банкнот для выдачи

    public ATM() {
        this.banknotes = new HashMap<>();
        this.minWithdrawalAmount = 10; // Пример минимальной суммы
        this.maxWithdrawalCount = 50; // Пример максимального количества банкнот
    }

    public void initializeATM(Map<Integer, Integer> initialBanknotes, int minWithdrawalAmount, int maxWithdrawalCount) {
        this.banknotes.clear();
        this.banknotes.putAll(initialBanknotes);
        this.minWithdrawalAmount = minWithdrawalAmount;
        this.maxWithdrawalCount = maxWithdrawalCount;
    }

    public void depositMoney(Map<Integer, Integer> depositedBanknotes) {
        for (Map.Entry<Integer, Integer> entry : depositedBanknotes.entrySet()) {
            int denomination = entry.getKey();
            int count = entry.getValue();
            banknotes.put(denomination, banknotes.getOrDefault(denomination, 0) + count);
        }
    }

    public Map<Integer, Integer> withdrawMoney(int amount) throws ATMException {
        if (amount < minWithdrawalAmount) {
            throw new ATMException("Сумма для снятия меньше минимальной допустимой суммы");
        }

        Map<Integer, Integer> withdrawalBanknotes = new HashMap<>();
        int remainingAmount = amount;

        // Выдача банкнот с наименьшими номиналами для минимизации их количества
        int[] denominations = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int denomination : denominations) {
            if (banknotes.containsKey(denomination)) {
                int availableCount = banknotes.get(denomination);
                int requiredCount = remainingAmount / denomination;
                int countToWithdraw = Math.min(availableCount, requiredCount);
                if (countToWithdraw > 0) {
                    withdrawalBanknotes.put(denomination, countToWithdraw);
                    remainingAmount -= countToWithdraw * denomination;
                    banknotes.put(denomination, availableCount - countToWithdraw);
                }
            }
        }

        if (remainingAmount > 0) {
            throw new ATMException("Невозможно выдать указанную сумму");
        }

        return withdrawalBanknotes;
    }
}
