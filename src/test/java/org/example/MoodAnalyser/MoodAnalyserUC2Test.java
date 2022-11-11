package org.example.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserUC2Test {

        //Given Null Mood Should Return Happy
    @Test
    public void givenMessage_ProvidesInvalidMood_ReturnHappy() {
        MoodAnalyserUC2 moodAnalyser = new MoodAnalyserUC2();
      String result = moodAnalyser.analyseMood();
        Assert.assertFalse(Boolean.parseBoolean(result));
        System.out.println(result);
    }
}