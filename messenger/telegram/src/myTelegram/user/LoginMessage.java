package myTelegram.user;

public class LoginMessage extends Message {


    private ArgType argType;
    private String login;
    private String pass;
    private Long id;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArgType getArgType() {
        return argType;
    }

    public void setArgType(ArgType argType) {
        this.argType = argType;
    }

    public Long getUserId() {
        return id;
    }

    public void setUserId(Long id) {
        this.id = id;
    }
}