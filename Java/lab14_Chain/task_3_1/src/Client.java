public class Client {

    public static void main(String[] args) {

        Handler loginHandler = new LoginHandler();
        UserLoginHandler userLoginHandler = new UserLoginHandler();
        AdminLoginHandler adminLoginHandler = new AdminLoginHandler();

        loginHandler.setNext(userLoginHandler);
        userLoginHandler.setNext(adminLoginHandler);

        adminLoginHandler.addAccount("admin", "123qweASD");
        adminLoginHandler.addAccount("administrator", "1234");

        userLoginHandler.addAccount("andrii", "1234");
        userLoginHandler.addAccount("black_knight", "S@ruman1");
        userLoginHandler.addAccount("white_knight", "ruman1");

        Account[] users = {
            Account.createAdmin("admin", "123qweASD"),
            Account.createAdmin("administrator", "1234"),
            Account.createUser("andrii", "1234"),
            Account.createGuest(),
            Account.createUser("black_knight", "S@ruman1"),
            Account.createUser("white_knight", "S111"),
            Account.createGuest(),
        };

        for (Account user : users) {

            loginHandler.handle(user);
        }
    }
}
