package day24CustomMethodsReturn;

public class WarmupTasks {
    public static void main(String[] args) {
        initials("Kamala", "guliyeva");
        domain("kami@gmail.com");
        System.out.println("------------------");

        String[] emails={"ali@gmail.com","li@yahoo.com","john@hotmail.com"};
        for(String email:emails){
            domain("email");
        }

        nameOfMonth(3);
        ageGroups(1);
        uniqueChar("Kamala");


    }

    //display initial of the person
    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);
    }

    public static void domain(String email) {
        String domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf("."));
        System.out.println(domain);
    }

    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "feb"
                    : (number == 3) ? "March" : (number == 4) ? "April" : "invalid";

        } else {
            name = "invalid";
        }
        System.out.println(name);

    }

    public static void ageGroups(int age) {
        if (age >= 1 && age < 2) {
            System.out.println("infant");
        } else {
            System.out.println("pre teen");
        }

    }

    public static void uniqueChar(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (word.indexOf(ch) == word.lastIndexOf(ch)) {
                result += ch;

            }

        }
        System.out.println(result);
    }
}