import java.util.Scanner;

public record TheTernaryOperator() {
    public static String describeAge(int age) {
//        if (age <= 12) {
//            return "You're a(n) kid";
//        } else if (age >= 13 && age <= 17) {
//            return "You're a(n) teenager";
//        } else if (age >= 18 && age <= 64) {
//            return "You're a(n) adult";
//        } else {
//            return "You're a(n) elderly";
//        }
        age = 12;
        return "You are a(n) " + (age <= 12 ? "kid" : age >= 13 && age <= 17 ? "teenager" : age >= 18 && age <= 64 ? "adult" : "elderly");
    }
}
