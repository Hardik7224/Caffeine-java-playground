package section11_Exception_Handling;
// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class NoInternetFoundException extends Exception {
    public NoInternetFoundException(String message) {
        super(message);
    }
}

class GooglePayProcessor {
    int balance = 1000;

    public void pay(int amount, boolean isNetworkConnected)
            throws InsufficientBalanceException, NoInternetFoundException {

        if (isNetworkConnected == false) {
            throw new NoInternetFoundException("JIO Net Is Not Connected");
        }

        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance : " + balance);
        }

        balance = balance - amount;
    }
}

public class Example7{
    public static void main(String[] args) {
        GooglePayProcessor gpay = new GooglePayProcessor();

        try {
            gpay.pay(300, false);
            System.out.println(gpay.balance);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (NoInternetFoundException e) {
            System.out.println(e);
        }

        // gpay.pay(400, false);
        // System.out.println(gpay.balance);

        // gpay.pay(600, true);
        // System.out.println(gpay.balance);
    }
}