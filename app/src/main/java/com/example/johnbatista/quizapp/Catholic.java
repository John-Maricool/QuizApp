package com.example.johnbatista.quizapp;

public class Catholic {

    private  String question;
    private String[] options;

    public static String[] options1 = {"Rome", "Vatican city", "Tower", "Italy"};
    public  static String[] options2 = {"Clergy", "Priest", "Couples", "Cathchiest"};
    public  static String[] options3 = {"Red", "Purple", "Black", "White or Cream"};
    public static String[] options4 = {"Lord have Mercy", "I believe", "Lamb of God", "Confeitor"};
    public static String[] options5 = {"St. Catherine", "St. Dominic",  "St SimonStock", "St. Rita"};
    public static String[] options6 = {"Paul", "Isaiah", "Jesse",  "Peter"};
    public static String[] options7 = {"Ram", "Hama", "Rama",  "Ham"};
    public static String[] options8 = {"Red", "White", "Purple",  "Black"};
    public static String[] options9 = {"Josiah", "Enoch", "Adam",  "Methuselah"};
    public static String[] options10= {"Terom", "Terah", "Manasseh",  "Jodah"};
    public static String[] options11= {"Saul", "Paul", "Peter",  "Unknown"};
    public static String[] options12= {"Saul", "Jesus", "Peter",  "Unknown"};
    public static String[] options13= {"Terah", "Jesus", "Peter",  "Samson"};
    public static String[] options14= {"Judas", "Jude", "Peter",  "Andrew"};
    public static String[] options15= {"Adam", "Seth", "Cain",  "Abel"};
    public static String[] options16= {"Mary", "Anna", "Theresa",  "Rebecca"};
    public static String[] options17= {"300", "500", "700",  "900"};
    public static String[] options18= {"Esther", "Ruth", "Jezebel",  "Rebecca"};
    public static String[] options19= {"Alb", "Amice", "Chalsible",  "Stole"};
    public static String[] options20= {"Fisherman Ring", "Cimborium Ring", "Ring",  "Signet"};
    public static String[] options21= {"Enoch", "Adam", "Methuselah",  "St. John"};
    public static String[] options22= {"St. Paul", "St. Peter", "St. Andrew",  "St. John"};
    public static String[] options23= {"St. Polycarp", "St. Matthias", "St. Stephen",  "St. John"};
    public static String[] options24= {"ps 91", "Jn 11", "Ps 118",  "Ps 119"};
    public static String[] options25= {"Jerusalem", "Galilee", "Rome",  "Patmos"};
    public static String[] options26= {"Judas", "Peter", "John",  "Jesus"};
    public static String[] options27= {"St. Anna", "St. Therese", "St. Agnes",  "St. Rita"};
    public static String[] options28= {"St. Matthew", "St. Peter", "St. Paul",  "St. James"};
    public static String[] options29= {"Black", "Yellow", "Red",  "White and yellow"};
    public static String[] options30= {"St. Maria", "St. Rita", "Mother Theresa",  "St. Agnes"};
    public static String[] options31= {"Confession at least once a year", "Preach thee gospel", "Live like Christ",  "Fasting and abstinence"};
    public static String[] options32= {"St. Livinus", "St. Joann", "St. Frances",  "St. Anthony"};
    public static String[] options33= {"Cinture", "Alb", "Stole",  "Chasable"};
    public static String[] options34= {"John", "Luke", "Matthew",  "Mark"};
    public static String[] options35= {"60 days", "50 days", "30 days",  "40 days"};
    public static String[] options36= {"7 statements", "2 statements", "5 statements",  "9 statements"};
    public static String[] options37= {"St. Dominic", "St. Anthony", "St. Livinus",  "St. Bernard"};
    public static String[] options38= {"Religion", "Philosophy", "Theology",  "Christianity"};
    public static String[] options39= {"Bible", "Didache", "C C C",  "Canon Law"};
    public static String[] options40= {"Jesus", "Pope Clement", "Pope Peter",  "Constantine"};
    public static String[] options41= {"Italy", "Spain", "Brazil", "Argentina"};
    public static String[] options42= {"Phil Foden", "George Bergoglio", "Joseph Ratzinger",  "Jan Wilnut"};
    public static String[] options43= {"4", "5", "6",  "7"};
    public static String[] options44= {"Saints", "Martyr", "Church Triumphant",  "Suffering"};
    public static String[] options45= {"St. John", "St. Peter", "St. Paul",  "St. James"};
    public static String[] options46= {"Clergy", "Anyone", "Priest",  "Pope"};
    public static String[] options47= {"Magic", "Consubstanciation", "Transsubstanciation",  "Transsignification"};
    public static String[] options48= {"Monsignor", "Alter Knight", "Seminarian",  "Deacon"};
    public static String[] options49= {"Italy", "Rome", "Vatican",  "World"};
    public static String[] options50= {"Aramaic", "Hebrew", "Greek",  "Latin"};


    private String correctAnswer;


    public Catholic(String question, String[] options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public static final Catholic[] catholic = {
            new Catholic("Where does the pope live? ", options1, "Vatican city"),
            new Catholic("Who is the chief celebrant in the sacrament of Matrimony? ", options2, "Couples"),
            new Catholic("What color of vestment does the priest wear during lent or Advent?", options3, "Purple"),
            new Catholic("Which part of the latin mass is said in Greek? ", options4, "Lord have Mercy"),
            new Catholic("Who received the scapular from the BVM?", options5,  "St SimonStock"),
            new Catholic("Who is the father of David?", options6,  "Jesse"),
            new Catholic("Who is the first person to see his fathers nakedness?", options7, "Ham"),
            new Catholic("What color of vestment does the priest wear on the second of november?", options8, "Red"),
            new Catholic("Who is the father of Seth?", options9, "Adam"),
            new Catholic("Who was the father of Abraham?", options10, "Terah"),
            new Catholic("Who wrote the book of hebrew?", options11, "Unknown"),
            new Catholic("Who fed people with bread and fish?", options12, "Jesus"),
            new Catholic("Who is the strongest man in the bible?", options13, "Samson"),
            new Catholic("Who betrayed Jesus?", options14, "Judas"),
            new Catholic("The first to be born in the world?", options15, "Cain"),
            new Catholic("Who is the mother of Mary (mother of Jesus)?", options16, "Anna"),
            new Catholic("How many wives did Solomon (son of david) have?", options17, "700"),
            new Catholic("Who was the first woman to wear earring in the bible?", options18, "Rebecca"),
            new Catholic("What is the name of the scalf the priest wears on his neck during confession?", options19, "Stole"),
            new Catholic("What is the name of the ring that the bishop wears?", options20, "Signet"),
            new Catholic("What is the name of the oldest man in the bible?", options21, "Methuselah"),
            new Catholic("Who is the youngest of Jesus Apostles?", options22, "St. John"),
            new Catholic("Who was the replacement of Judas?", options23, "St. Matthias"),
            new Catholic("What is the longest Chapter in the bible?", options24, "Ps 119"),
            new Catholic("Where did St. Peter die?", options25, "Rome"),
            new Catholic("Who in St. John's Gospel is called the word of God?", options26, "Jesus"),
            new Catholic("Who is called the patron saint of missions even though she never left000r convevnt?", options27, "St Therese"),
            new Catholic("What Apostle watched the Stoning of Stephen?", options28, "St. Paul"),
            new Catholic("What colors are papal flags?", options29, "White and yellow"),
            new Catholic("Who won the nobel peace prize for her work in India?", options30,  "Mother Theresa"),
            new Catholic("What does Easterduty mean?", options31,  "Confession at least once a year"),
            new Catholic("Who is the saint who supposedly tamed a wild wolf?", options32, "St. Frances"),
            new Catholic("What is the name of the large colored vestment the priest wears for mass?", options33, "Chasable"),
            new Catholic("Which is the longest of the four Gospels?", options34, "Matthew"),
            new Catholic("How many days after Easter does Pentecost occur?", options35, "50 days"),
            new Catholic("According tho the Gospel, how many times did Jesus speak on his way to the cross?", options36, "7 statements"),
            new Catholic("Which saint is petitioned in order to find a lost object?", options37, "St. Anthony"),
            new Catholic("What is the study of the nature of God and religious truths called?", options38, "Theology"),
            new Catholic("What is the name of the body of laws that govern the church?", options39, "Canon Law"),
            new Catholic("Who ordained the 7 sacraments", options40,  "Jesus"),
            new Catholic("Where is the birthplace of Pope Francis?", options41,  "Argentina"),
            new Catholic("What is the Real name of Pope Benedict XVI?", options42, "Joseph Ratzinger"),
            new Catholic("How many sacramenets does the church have?", options43, "7"),
            new Catholic("Those who die for the sake of the gospel are called?", options44, "Martyr"),
            new Catholic("Which apostle was crucified upside down?", options45, "St. Peter"),
            new Catholic("Who can baptise?", options46,  "Anyone"),
            new Catholic("When the host turnes Christ, what has happened?", options47, "Transsubstanciation"),
            new Catholic("Which of them is ordained?", options48, "Deaacon"),
            new Catholic("The pope is the bishop of where?", options49, "Rome"),
            new Catholic("What language did Jesus speak?", options50, "Aramaic"),
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
            rand[i] = (int) (Math.random() * 49);
        }
        return rand;
    }

}
