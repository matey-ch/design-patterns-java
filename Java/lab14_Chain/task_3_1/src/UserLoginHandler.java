import java.util.HashMap;
import java.util.Map;

public class UserLoginHandler extends Handler {
    private Map<String, String> accounts = new HashMap<>();

    void addAccount(String login, String password){
        accounts.put(login,password);
    }

    @Override
    void handle(Account account) {
        Account.AccessType accessType = account.getAccessType();
        String userLogin = account.getLogin();
        String userPassword = account.getPassword();

        if (accessType == Account.AccessType.User) {

            String passwordFromStorage = accounts.get(userLogin);
            if (userPassword.equals(passwordFromStorage)) {
                System.out.println("User access provided: " + userLogin);
            } else {
                System.out.println("Access denied: " + userLogin);
            }
        }
        else next.handle(account);


    }
}
