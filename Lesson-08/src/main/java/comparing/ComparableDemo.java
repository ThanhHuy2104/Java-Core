package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(2, "Toán", 10));
        questions.add(new Question(1, "Lý", 8.5));
        questions.add(new Question(4, "Hóa", 8));
        questions.add(new Question(3, "Sinh", 9));

        for (Question question : questions) {
            System.out.println("question = " + question);
        }

        System.out.println("------------------------------------------------------");
        Collections.sort(questions);

        for (Question question : questions) {
            System.out.println("question = " + question);
        }
    }
}
