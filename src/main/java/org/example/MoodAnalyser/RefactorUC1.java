package org.example.MoodAnalyser;

public class RefactorUC1 {
    //variables
    private String message;

    //no arg constructor
    public RefactorUC1(){}

    //constructor with parameter
    public RefactorUC1(String message) {
        this.message = message;
    }

    //method for accessing parameters
    public String analyseMood(String message) {
        this.message=message;
        return analyseMood();
    }

    //analyseMood return SAD or HAPPY
    public String analyseMood() {
            if (message.contains("I am in Sad Mood"))
                System.out.println("SAD");
            else System.out.println("HAPPY");
        return message;
    }

    public static void main(String[] args) {
        RefactorUC1 moodAnalyser = new RefactorUC1();
        moodAnalyser.analyseMood();
    }
}
