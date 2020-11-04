package com.example.johnbatista.quizapp;

/**
 * Created by JOHN BATISTA on 5/24/2020.
 */
public class logic {
    private  String question;
    private String[] options;

    public static String[] options1 = {"teeth", "laps", "tongue", "back"};
    public  static String[] options2 = {"Bill gates", "Steve Crown", "Steve Hawkings", "Mark Zuckerberg"};
    public  static String[] options3 = {"Bible", "Didache", "A paper", "A scroll"};
    public static String[] options4 = {"English", "Nigerian", "German", "American"};
    public static String[] options5 = {"Martin Luther", "George bush",  "George Washington", "Barrack Obama"};
    public static String[] options6 = {"Right Small", "The wright brothers", "Will Smith",  "Oliver"};
    public static String[] options7 = {"Micheal Faraday", "Mark ZuckerBerg", "Arnold Shwarznegger",  "Bill Gates"};
    public static String[] options8 = {"French", "Latin", "English",  "German"};
    public static String[] options9 = {"New York", "California", "Dubai",  "China"};
    public static String[] options10= {"Sinai", "Tabor", "Kilimanjaro",  "Everest"};
    public static String[] options11= {"Everest", "Tabor", "Kilimanjaro",  "Sinai"};
    public static String[] options12= {"Micheal Faraday", "Einstein", "Newton",  "Pythagoras"};
    public static String[] options13= {"Micheal Faraday", "Einstein", "Isaac Newton",  "Pythagoras"};
    public static String[] options14= {"Pythagoras", "Faraday", "Einstein",  "John Dalton"};
    public static String[] options15= {"Pele", "Robinho", "Delimma",  "Maradona"};
    public static String[] options16= {"George Weah", "Zidene Zidane", "Leonel Messi",  "Christiano Ronaldo"};
    public static String[] options17= {"Arsenal", "Liverpool", "Chelsea",  "Man U"};
    public static String[] options18= {"Guardiola", "Wenger", "Alex Ferguson",  "Zidane"};
    public static String[] options19= {"Real Madrid", "Barcelona", "Ajax", "Bayern"};
    public static String[] options20= {"Pakistan", "China", "India",  "USA"};
    public static String[] options21= {"Spain", "Algeria", "England",  "Brazil"};
    public static String[] options22= {"eye", "tongue", "nose",  "ear"};
    public static String[] options23= {"NOTA", "Basic", "Ada",  "Javalist"};
    public static String[] options24= {"8", "9", "6",  "7"};
    public static String[] options25= {"Curie", "Einstein", "Tesla",  "Faraday"};

    private String correctAnswer;


    public logic(String question, String[] options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public static final logic[] LOGIC = {
            new logic("What part of the body has no bone?", options1, "tongue"),
            new logic("Who is the owner of facebook?", options2, "Mark Zuckerberg"),
            new logic("What is the ever first book to be printed", options3, "Bible"),
            new logic("The fastest computer in the world was produced by a? ", options4, "Nigerian"),
            new logic("Who is the first Black president of USA?", options5,  "Barrack Obama"),
            new logic("Who invented the aeroplane?", options6,  "The wright brothers"),
            new logic("Who is the owner of microsoft?", options7, "Bill Gates"),
            new logic("What language do Italians speak?", options8, "Latin"),
            new logic("What is the biggest city in the world?", options9, "New York"),
            new logic("What is the largest mountain in Africa?", options10, "Kilimanjaro"),
            new logic("What is the largest mountain in he world?", options11, "Everest"),
            new logic("Who invented electricity?", options12, "Micheal Faraday"),
            new logic("Who propounded the law of gravity?", options13, "Isaac Newton"),
            new logic("Who is the father of Atom?", options14, "John Dalton"),
            new logic("Who is the highest goal scorer in the history of football?", options15, "Pele"),
            new logic("Who is the first player to win balon d'or?", options16, "George Weah"),
            new logic("What is the first team to carry Premier League for three consecutive times?", options17, "Man U"),
            new logic("Who is the best Football coach of all time?", options18, "Alex Ferguson"),
            new logic("What is the first team to carry Champions League for three consecutive times??", options19, "Real Madrid"),
            new logic("What is the most populated country in the world?", options20, "China"),
            new logic("Which country did the the first balon d' or winner come from?", options21, "Algeria"),
            new logic("Which part of the body has the smallest bone?", options22, "ear"),
            new logic("Who is the firs programmer?", options23, "Ada"),
            new logic("How many continents are in the world?", options24, "7"),
            new logic("Who is rated with the highest IQ?", options25, "Einstein"),

    };

    public String getQuestions(){
        return this.question;
    }

    public  String[] getOptions(){
        return this.options;
    }

    public String getCorrectAnswer(){
        return this.correctAnswer;
    }

    public static int[] getQuestionIndex(){

        int[] rand = new int[10];
        for (int i = 0; i < 10; i++) {
            rand[i] = (int) (Math.random() * 24);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {


                if ((i != j) && (rand[i] == rand[j])) {
                    rand[i] = (int) (Math.random() * 24);
                }
            }
        }
        return rand;
    }

}
