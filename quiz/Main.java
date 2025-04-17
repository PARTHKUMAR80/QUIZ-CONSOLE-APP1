package quiz;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        QuestionService service = new QuestionService();
        service.playQuiz();
    }
}