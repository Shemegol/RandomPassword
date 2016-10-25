import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String sourceOfPassword = partOfSource('A', 26).concat(partOfSource('a', 26)).concat(partOfSource('0', 10)).concat("!@#$%&()?");
        int lengthOfPassword = 8;
        System.out.println("Генерация случайного пароля длинной " + lengthOfPassword + " символов.");
        System.out.println("Ваш пароль: " + createPassword(sourceOfPassword, lengthOfPassword));
    }

    private static String partOfSource(char ch, int length) {
        char sourceOfPassword[] = new char[length];
        for (int i = 0; i < sourceOfPassword.length; i++) {
            sourceOfPassword[i] = (char) (ch + i);
        }
        return String.valueOf(sourceOfPassword);
    }

    private static String createPassword(String source, int length) {
        Random random = new Random();
        char password[] = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = source.charAt(random.nextInt(source.length()));
        }
        return String.valueOf(password);
    }
}

