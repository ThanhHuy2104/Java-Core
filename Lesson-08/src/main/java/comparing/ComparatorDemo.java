package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(1, "Toán", 10));
        questions.add(new Question(1, "Lý", 8.5));
        questions.add(new Question(2, "Hóa", 8));
        questions.add(new Question(2, "Sinh", 9));

        for (Question question : questions) {
            System.out.println("question = " + question);
        }

        Comparator<Question> comparator = Comparator
                .comparingInt(Question::getId)
                .thenComparingDouble(Question::getScore);

        System.out.println("------------------------------------------------------");
        Collections.sort(questions, comparator);

        for (Question question : questions) {
            System.out.println("question = " + question);
        }
    }
}
