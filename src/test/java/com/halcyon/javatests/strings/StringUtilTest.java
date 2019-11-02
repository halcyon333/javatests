package com.halcyon.javatests.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void string_is_not_empty(){
        boolean result = StringUtil.isEmpty("sdfs");

        assertFalse(result);
    }

    @Test
    public void string_is_empty(){
        boolean result = StringUtil.isEmpty("");

        assertTrue(result);
    }

    @Test
    public void string_null_is_empty(){

        boolean result = StringUtil.isEmpty(null);

        assertTrue(result);
    }

    @Test
    public void string_whitespace_is_empty(){
        boolean result = StringUtil.isEmpty("      ");

        assertTrue(result);
    }


}