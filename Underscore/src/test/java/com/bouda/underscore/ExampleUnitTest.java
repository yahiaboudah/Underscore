package com.bouda.underscore;

import static com.bouda.underscore.UnderScore._;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

import java.util.HashMap;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void isMap() throws UnderscoreException {
        HashMap<String, Boolean> map = _(
                "hello", true,
                "hey", false,
                "too", true
        );
    }

}