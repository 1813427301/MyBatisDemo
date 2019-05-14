package entriy;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private String sex;
    private Date date;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User() {
    }

    public User(String username, String password, String sex, Date date) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.date = date;
    }

    public User(int id, String username, String password, String sex, Date date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", date=" + date +
                '}';
    }
}
