package quiz;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[2];
    String selection[] = new String[2];

    public QuestionService(){
        questions[0] = new Question(1, "What", "Java", "Cpp", "Python", "HTML", "Java");
        questions[1] = new Question(2, "What", "A", "B", "C", "D", "C");
    }

    public void playQuiz(){
        int i = 0;
        for (Question q : questions){
            System.out.println("Question no. :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine(); 
        }
        int index = 0;
        for (String s : selection){
            if ((questions[index].getAnswer()).toString().equals(s.toString())){
                System.out.println("Correct answer :" + s);
            }
            else {
                System.out.println("Incorrect answer. The correct answer to this is :" + questions[index].getAnswer());
            }
            System.out.println((questions[index].getAnswer()).toString());
            System.out.println(s.toString());
            index++;
        }
    }
}
