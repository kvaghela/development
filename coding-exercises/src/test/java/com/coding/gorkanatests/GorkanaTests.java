package com.coding.gorkanatests;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GorkanaTests {

    @Test
    public void fizzBuzzTest() {
        System.out.println(new FizzBuzz().toString(20));
    }

    @Test
    public void stringsTest() {
        String result = Strings.concatenate(Arrays.asList("potato", "carrot", "giraffe"));

        //Check why this works += for strings creates a new string
        Assert.assertEquals("potato carrot giraffe ", result);
    }

    @Test
    public void personTest() {
        //LOOK AND UNDERSTAND WHY PERSON.JAVA IS NOT IMMUTABLE!
    }




}
