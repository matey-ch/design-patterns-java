import java.util.HashMap;
import java.util.Map;

public class AdminLoginHandler extends Handler {
    private Map<String, String> accounts = new HashMap<>();

    void addAccount(String login, String password){
        accounts.put(login,password);
    }

    @Override
    void handle(Account account) {
        Account.AccessType accessType = account.getAccessType();
        String userLogin = account.getLogin();
        String userPassword = account.getPassword();

        if (accessType == Account.AccessType.Administrator) {

            String passwordFromStorage = accounts.get(userLogin);
            if (userPassword.equals(passwordFromStorage) && userPassword.length() >= 8) {
                System.out.println("Administrator access provided: " + userLogin);
            } else {
                System.out.println("Access denied: " + userLogin);
            }
        }
        else next.handle(account);


    }
}
