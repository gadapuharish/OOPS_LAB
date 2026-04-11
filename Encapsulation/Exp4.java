class Password {
    private String password;
    public void setPassword(String password) {
        if (password.length() >= 6)
            this.password = password;
        else
            System.out.println("Password too short");
    }
    public void validate() {
        if (password != null)
            System.out.println("Password set successfully");
        else
            System.out.println("Password not set");
    }
}
public class Exp4 {
    public static void main(String[] args) {
        Password p = new Password();
        p.setPassword("2284");
        p.setPassword("rdtfzrg7653");
        p.validate();
    }
}