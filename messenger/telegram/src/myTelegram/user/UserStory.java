package myTelegram.user;


interface UserStore {

    boolean isUserExist(String login);

    User addUser(User user);

    User getUser(String login, String pass);

    User getUserById(Long id);
}
