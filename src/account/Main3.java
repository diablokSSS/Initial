package account;

import com.company.Kitchen;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        SantanderAccount santanderAccount = new SantanderAccount(3000);
        MbankAccount mbankAccount = new MbankAccount(2000);

        AccountOperations santanderAccount2 = new SantanderAccount(5000);
        AccountOperations mbankAccount2 = new MbankAccount(7000);

        List<AccountOperations> list = new LinkedList<>();

        list.add(santanderAccount);
        list.add(mbankAccount);
        list.add(santanderAccount2);
        list.add(mbankAccount2);

//        for (AccountOperations ac : list){
//            ac.deposit(100);
//            System.out.println(ac.toString());
//        }
//
//
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).deposit(100);
//        }

        Set<String> set = new HashSet<>();

        set.add("Hubert");
        set.add("Hubert");
        set.add("Marcin");
        set.add("Marcin");

        for (String s :
                set) {
            System.out.println(s.toString());
        }

        santanderAccount.deposit(10);
        santanderAccount.deposit(10);
        santanderAccount.deposit(10);
        santanderAccount.deposit(1042);
        santanderAccount.deposit(1021);
        santanderAccount.withdraw(2342);
        santanderAccount.withdraw(2342);
        santanderAccount.withdraw(2342);
    }
}
