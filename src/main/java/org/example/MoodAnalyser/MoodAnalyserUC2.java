//Handling mood is user provides invalid mood

package org.example.MoodAnalyser;

public class MoodAnalyserUC2 {
    //variables
    private String message;

    //no arg constructor
    public MoodAnalyserUC2(){}

    //constructor with parameter
    public MoodAnalyserUC2(String message) {
        this.message = message;
    }

    //method for accessing parameters
    public String analyseMood(String message) {
        this.message=message;
        return analyseMood();
    }

    //analyseMood return SAD or HAPPY
    public String analyseMood() {
        try {
            if (message.contains("Smile"))
                return "Sad";
            else return "Happy";
        } catch (NullPointerException e){
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyserUC2 moodAnalyser = new MoodAnalyserUC2();
        moodAnalyser.analyseMood();
    }
}
