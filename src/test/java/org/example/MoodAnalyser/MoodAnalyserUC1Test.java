package org.example.MoodAnalyser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserUC1Test {
private MoodAnalyserUC1 moodAnalyser;

    @Before
    public void setUp() throws Exception {
        moodAnalyser = new MoodAnalyserUC1();
    }

    @Test
    public void givenMessage_IAmInSadMood_ReturnSAD() {
        String mood=moodAnalyser.analyseMood("Sad");
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_IAmInAnyMood_ReturnHAPPY() {
        String mood=moodAnalyser.analyseMood("HAPPY");
        Assert.assertEquals("HAPPY",mood);
    }
}