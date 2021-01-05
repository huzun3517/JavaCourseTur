package Gun46.Encapsulation3;

public class User {

    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    private static int sayac =1;

    public User(String username, String password) {

    //  this.id = sayac++; // sayacın o anki değeri atanır, ++ lar sağda olduğu için sonrasında değeri 1 artar.
        this.id = id;
        setUsername(username);
        setPassword(password);
        setActive(true);
        setSignedIn(false);

    }


    public int getId() {
        return id;
    }

    public void setId() {
        this.id = sayac++; // sayacın o anki değeri atanır, ++ lar sağda olduğu için sonrasında değeri 1 artar
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 6)
            throw new RuntimeException("Password 6 karakterden az olamaz");

        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
