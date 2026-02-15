package OOP;

public class User {
    private final String login;
    private String password;
    private int age;
    private String name;

    public User (String login, String password, int age, String name) {
        this.login = login;
        this.password = password;
        setAge(age);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 125) {
            this.age = age;
        } else {
            System.out.println("Age must be in range from 18 to 125");
        }
    }

    public void changePassword(String oldPassword, String newPassword){
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
        } else {
            System.out.println("Incorrect old password");
        }
    }

    public void authenticate(String login, String password) {
        System.out.println(login.equals(this.login) && password.equals(this.password));
    }

    public void getUserData(){
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }
}

