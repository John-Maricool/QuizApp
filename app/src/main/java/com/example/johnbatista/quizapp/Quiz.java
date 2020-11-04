package com.example.johnbatista.quizapp;

/**
 * Created by JOHN BATISTA on 5/18/2020.
 */
public class Quiz {
    private  String question;
    private String[] options;

    public static String[] options1 = {"David", "Solomon", "Samuel", "Saul"};
    public  static String[] options2 = {"Zephiniah", "Habakkuk", "Malachi", "John"};
    public  static String[] options3 = {"20", "40", "80", "50"};
    public static String[] options4 = {"Mark", "Matthew", "Luke", "John"};
    public static String[] options5 = {"Knowledge", "Understanding",  "Power", "Wisdom"};
    public static String[] options6 = {"Paul", "Isaiah", "Jesse",  "Peter"};
    public static String[] options7 = {"Ram", "Hama", "Rama",  "Ham"};
    public static String[] options8 = {"In-law", "Sister", "Mother",  "Aunt"};
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
    public static String[] options19= {"One", "Four", "Two",  "Three"};
    public static String[] options20= {"Fisherman Ring", "Cimborium Ring", "Ring",  "Signet"};
    public static String[] options21= {"Enoch", "Adam", "Methuselah",  "St. John"};
    public static String[] options22= {"St. Paul", "St. Peter", "St. Andrew",  "St. John"};
    public static String[] options23= {"St. Polycarp", "St. Matthias", "St. Stephen",  "St. John"};
    public static String[] options24= {"ps 91", "Jn 11", "Ps 118",  "Ps 119"};
    public static String[] options25= {"Jerusalem", "Galilee", "Rome",  "Patmos"};
    public static String[] options26 = {"Nazareth", "Galilee", "Capernaum", "Egypt"};
    public  static String[] options27 = {"The one who saves", "The one who heals", "The one who delivers", "Savior"};
    public  static String[] options28 = {"Doxology", "Apocrypha", "Pentateuch", "Septuagint"};
    public static String[] options29 = {"Cain", "Abraham", "Aaron", "Joshua"};
    public static String[] options30 = {"Rodents", "Locusts",  "Insects", "Honey"};
    public static String[] options31 = {"1 John", "3 John", "2 John",  "James"};
    public static String[] options32 = {"Barabbas", "St. John", "St. Andrew",  "St Peter"};
    public static String[] options33 = {"Malta", "Maltus", "Sinia",  "Patmos"};
    public static String[] options34 = {"Galilee", "Judea", "Nazareth", "Bethlehem"};
    public static String[] options35= {"36", "29", "27",  "26"};
    public static String[] options36= {"Joshua", "Dan", "Benjamin",  "Joseph"};
    public static String[] options37= {"Disciple", "Deacon", "The first Christian Martyr",  "Servant"};
    public static String[] options38= {"Ceasar", "Pilate", "Herod",  "Caiaphas"};
    public static String[] options39= {"Herod's daughter", "Herodias", "Herod",  "Soliders"};
    public static String[] options40= {"John", "Peter", "Holy Spirit",  "Matthew"};
    public static String[] options41= {"Pilate", "Joseph", "Joseph of Arimathea",  "Malchaus"};
    public  static String[] options42 = {"Peter", "Judas", "John", "Andrew"};
    public static String[] options43 = {"Matthew", "Mark", "Luke", "John"};
    public static String[] options44 = {"Mary", "Haggai",  "Sarah", "Hannah"};
    public static String[] options45 = {"God", "Curse", "Hell",  "Heaven"};
    public static String[] options46 = {"39", "66", "27",  "35"};
    public static String[] options47 = {"English", "Latin", "Hebrew",  "Greek"};
    public static String[] options48 = {"Bathsheba", "David", "Sarah", "Mary"};
    public static String[] options49= {"Sold him", "Gave him out", "Did nothing",  "Dashed him"};
    public static String[] options50= {"David", "Elisha", "Elijah",  "Samuel"};



    private String correctAnswer;


    public Quiz(String question, String[] options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public static final Quiz[] quiz = {
            new Quiz("Who was the first king of Israel? ", options1, "Saul"),
            new Quiz("Who was the last prophet of the old testament? ", options2, "Malachi"),
            new Quiz("How many days and nights did Jesus fast?", options3, "40"),
            new Quiz("Which new Testament book has Jesus's Sermon on the mount? ", options4, "Matthew"),
            new Quiz("What did king Solomon ask God to give him?", options5,  "Wisdom"),
            new Quiz("Who is the father of David?", options6,  "Jesse"),
            new Quiz("Who is the first person to see his fathers nakedness?", options7, "Ham"),
            new Quiz("How was Ruth Related to Naomi?", options8, "In-law"),
            new Quiz("Who is the father of Seth?", options9, "Adam"),
            new Quiz("Who was the father of Abraham?", options10, "Terah"),
            new Quiz("Who wrote the book of hebrew?", options11, "Unknown"),
            new Quiz("Who fed people with bread and fish?", options12, "Jesus"),
            new Quiz("Who is the strongest man in the bible?", options13, "Samson"),
            new Quiz("Who betrayed Jesus?", options14, "Judas"),
            new Quiz("The first to be born in the world?", options15, "Cain"),
            new Quiz("Who is the mother of Mary (mother of Jesus)?", options16, "Anna"),
            new Quiz("How many wives did Solomon (son of david) have?", options17, "700"),
            new Quiz("Who was the first woman to wear earring in the bible?", options18, "Rebecca"),
            new Quiz("How many days and nights did Jonah stay in the belly of the big fish?", options19, "Three"),
            new Quiz("What is the name of the ring that the bishop wears?", options20, "Signet"),
            new Quiz("What is the name of the oldest man in the bible?", options21, "Methuselah"),
            new Quiz("Who is the youngest of Jesus Apostles?", options22, "St. John"),
            new Quiz("Who was the replacement of Judas?", options23, "St. Matthias"),
            new Quiz("What is the longest Chapter in the bible", options24, "Ps 119"),
            new Quiz("Where did St. Peter die", options25, "Rome"),
            new Quiz("Where did Jesus grow up after returning to Egypt?", options26, "Nazareth"),
            new Quiz("What is the meaning of Jehova Rapha?", options27, "The one who heals"),
            new Quiz("Whats the name given to first five books of the old testament?", options28, "Pentateuch"),
            new Quiz("Who was the next leader of Isreal after Moses?", options29, "Joshua"),
            new Quiz("What type of insect did John the Baptist eat in the desert?", options30, "Locusts"),
            new Quiz("What is the shortest book in the New Testament?", options31, "2 John"),
            new Quiz("Who is the author of the Book of Revelation?", options32, "St. John"),
            new Quiz("Paul was shipwrecked on what island?", options33, "Malta"),
            new Quiz("In what city was Jesus born?", options34, "Bethlehem"),
            new Quiz("How many books are in the New Testament?", options35, "27"),
            new Quiz("What tribe is Paul from?", options36, "Benjamin"),
            new Quiz("Who is Stephen in Acts of the Apostles?", options37, "The first Christian Martyr"),
            new Quiz("Who is the high priest of Jerusalem who put Jesus on trial?", options38, "Caiaphas"),
            new Quiz("Who murders John the Baptist?", options39, "Herod"),
            new Quiz("Who baptizes Jesus?", options40, "John"),
            new Quiz("Who takes Jesus’s body off the cross?", options41, "Joseph of Arimathea"),
            new Quiz("Who is the first apostle to deny Jesus?", options42, "Peter"),
            new Quiz("Which Gospel is written by a doctor?", options43, "Luke"),
            new Quiz("Who was the mother of Samuel?", options44, "Hannah"),
            new Quiz("What is the last word in the Old Testament?", options45, "Curse"),
            new Quiz("How many books are there in the Old Testament?", options46, "39"),
            new Quiz("In what language was the Old Testament written?", options47, "Hebrew"),
            new Quiz("Who is the mother of Solomon?", options48, "Bathsheba"),
            new Quiz("What did Joseph’s brothers do to Joseph?", options49, "Sold him"),
            new Quiz("Which prophet secretly annointed David as king?", options50, "Samuel"),




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
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {


                if ((i != j) && (rand[i] == rand[j])) {
                    rand[i] = (int) (Math.random() * 49);
                }
            }
        }
        return rand;
    }
}

