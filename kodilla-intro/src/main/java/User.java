public class User  {
String userName;
int userAge;

public User (String userName, int userAge ) {
    this.userName = userName;
    this.userAge = userAge;
    }

    public static void main(String[] args) {
        User stefan = new User("Stefan", 12);
        User joanna = new User("Joanna", 13);
        User baltazar = new User("Baltazar", 87);
        User zdzislaw = new User("Zdzislaw", 35);
        User olga = new User("Olga", 29);
        User jan = new User("Jan", 27);
        User marek = new User("Marek", 39);

        User[] users = {stefan, joanna, baltazar, zdzislaw, olga, jan, marek};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].userAge;
        }
        int averageAge = result / users.length;
        System.out.println("srednia wieku to " + " " + averageAge);
        for (int i = 0; i < users.length; i++) {
            if (users[i].userAge < averageAge) {
                System.out.println(users[i].userName);
            }
        }
    }}



