//Ability to analyse mood is happy or sad

package org.example.MoodAnalyser;

public class MoodAnalyserUC1 {
    public String analyseMood(String message) {
            if (message.contains("Sad"))
                System.out.println("SAD");
            else System.out.println("HAPPY");
        return message;
    }

        public static void main(String[] args) {
            MoodAnalyserUC1 moodAnalyser = new MoodAnalyserUC1();
            moodAnalyser.analyseMood("Sad");
        }
    }
