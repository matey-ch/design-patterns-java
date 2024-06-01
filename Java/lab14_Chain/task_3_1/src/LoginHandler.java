public class LoginHandler extends Handler {
    @Override
    void handle(Account account) {
        Account.AccessType accessType = account.getAccessType();
        if (accessType == Account.AccessType.Guest) {
            System.out.println("Guest access provided!");
        }
        else next.handle(account);
    }
}
