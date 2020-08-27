package demo.citi.pojo;

public class LoginInfo {
    private String account;
    private String password;


    public LoginInfo(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public LoginInfo() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
