import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;
        int totalQuestions = 5;

        System.out.println("Welcome to  Test!");
        System.out.print("Введіть своє імя: ");
        String name = scanner.nextLine();

        System.out.println("Привіт, " + name + "! Гайда проходити тест.");

        String[] questions = {
                "1. Hпше ave you ever been to Paris?",
                "2. How many times have you watched that movie?",
                "3. Has she finished her homework?",
                "4. Have they visited their grandparents recently?",
                "5. Have you seen this TV show before?"
        };

        String[] options = {
                "a) Yes, I have.", "b) No, I haven't.", "c) I'm not sure.", "d) Maybe."
        };

        String[] answers = {
                "a", "b", "a", "a", "b"
        };

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println();
            System.out.println(questions[i]);

            for (String option : options) {
                System.out.println(option);
            }

            String userAnswer = "";

            while (!userAnswer.matches("[a-d]")) {
                System.out.print("Your answer (a, b, c, d): ");
                userAnswer = scanner.nextLine().toLowerCase();

                if (!userAnswer.matches("[a-d]")) {
                    System.out.println("Invalid option! Please choose a valid answer.");
                }
            }

            if (userAnswer.equals(answers[i])) {
                correctAnswers++;
            }
        }

        double score = (double) correctAnswers / totalQuestions * 100;
        System.out.println();
        System.out.println("Test completed!");
        System.out.println("Name: " + name);
        System.out.println("Correct answers: " + correctAnswers + "/" + totalQuestions);
        System.out.printf("Score: %.2f%%\n", score);

        System.out.println();
        System.out.print("Enter the administrator password to view the correct answers: ");
        String password = scanner.nextLine();

        if (password.equals("1111")) {
            System.out.println("Correct answers:");
            for (int i = 0; i < totalQuestions; i++) {
                System.out.println(questions[i] + " Answer: " + options[answers[i].charAt(0) - 'a']);
            }
        }

        System.out.println("Thank you for taking the test!");
    }
}
