package myTelegram.user;

public class Main {

    public static void main(String[] args) {
        UserStore userStore = new UserStore() {
            @Override
            public boolean isUserExist(String login) {
                return false;
            }

            @Override
            public User addUser(User user) {
                return null;
            }

            @Override
            public User getUser(String login, String pass) {
                return null;
            }

            @Override
            public User getUserById(Long id) {
                return null;
            }
        };
        AuthorizationService service = new AuthorizationService(userStore);

        service.startAuthorization();

    }
}


