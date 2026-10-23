package comparing;

public class Question implements Comparable<Question>{
    private int id;
    private double score;
    private String content;

    public Question(int id, String content, double score) {
        this.id = id;
        this.content = content;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", score=" + score +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public int compareTo(Question that) {
        return Integer.compare(this.id, that.id);
    }
}
