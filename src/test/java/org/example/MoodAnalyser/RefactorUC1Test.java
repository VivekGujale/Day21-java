package org.example.MoodAnalyser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RefactorUC1Test {

    private RefactorUC1 moodAnalyser;
    @Before
    public void setUp() throws Exception {
        moodAnalyser = new RefactorUC1();
    }

    @Test
    public void givenMessage_IAmInSadMood_ConstructorReturnSAD() {
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("I am in Sad Mood",mood);
    }

    @Test
    public void givenMessage_IAmInHappyMood_ConstructorReturnHAPPY() {
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assert.assertEquals("I am in Happy Mood",mood);
    }

}