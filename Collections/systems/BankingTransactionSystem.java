import java.util.*;

class Account {
    String id;
    double balance;

    Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + id + ", balance=" + balance + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account a = (Account) o;
        return Objects.equals(id, a.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class Transaction {
    String accountId;
    double amount; // positive = deposit, negative = withdrawal

    Transaction(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" + accountId + ", amount=" + amount + "}";
    }
}

public class BankingTransactionSystem {

    public static void main(String[] args) {
        List<Transaction> allTransactions = new ArrayList<>();
        Queue<Transaction> pending = new LinkedList<>();
        Stack<Transaction> rollbackStack = new Stack<>();

        Set<Account> validAccounts = new HashSet<>();
        validAccounts.add(new Account("A1", 1000));
        validAccounts.add(new Account("A2", 2000));

        Map<String, Account> accountMap = new HashMap<>();
        for (Account a : validAccounts) accountMap.put(a.id, a);

        pending.add(new Transaction("A1", 500));
        pending.add(new Transaction("A2", -300));
        pending.add(new Transaction("A3", 100)); // invalid

        while (!pending.isEmpty()) {
            Transaction t = pending.remove();
            if (!accountMap.containsKey(t.accountId)) {
                System.out.println("Invalid account, skipping: " + t);
                continue;
            }
            Account acc = accountMap.get(t.accountId);
            double oldBalance = acc.balance;
            acc.balance += t.amount;
            allTransactions.add(t);
            rollbackStack.push(new Transaction(acc.id, -t.amount)); // opposite for rollback
            System.out.println("Executed: " + t + ", new balance of " + acc.id + " = " + acc.balance);

            // simulate rollback of last transaction
        }

        System.out.println("\nRolling back last transaction if any:");
        if (!rollbackStack.isEmpty()) {
            Transaction undo = rollbackStack.pop();
            Account acc = accountMap.get(undo.accountId);
            acc.balance += undo.amount;
            System.out.println("Rolled back: " + undo + ", balance: " + acc.balance);
        }
    }
}
