package com.apptastic.mic;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class MicTest {

    @Test
    public void testEquals() {
        Mic mic1 = new Mic("SWEDEN", "SE", "XSTO", "XSTO", "O","NASDAQ STOCKHOLM AB",
                null, "STOCKHOLM", "WWW.NASDAQOMXNORDIC.COM", "DECEMBER 2015", "ACTIVE", "JULY 2010", "");

        Mic mic2 = new Mic("SWEDEN", "SE", "XSTO", "XSTO", "O", "NASDAQ STOCKHOLM AB",
                null, "STOCKHOLM", "WWW.NASDAQOMXNORDIC.COM", "DECEMBER 2015", "ACTIVE", "JULY 2010", "");

        Mic mic3 = new Mic("SWEDEN", "SE", "XSTO", "XSTO", "S", "NASDAQ STOCKHOLM AB",
                "S3", "STOCKHOLM", "WWW.NASDAQOMXNORDIC.COM", "DECEMBER 2015", "ACTIVE", "JULY 2010", "");

        Mic mic4 = new Mic("a", "a", "a", "a", "s", "a", "a", "a", "a", "a", "a", "a", "a");
        Mic mic5 = new Mic(null, null, null, null, null,null, null, null, null, null, null, null, null);


        assertTrue(mic1.equals(mic1));
        assertTrue(mic1.equals(mic2));
        assertFalse(mic1.equals(mic3));
        assertFalse(mic3.equals(mic4));
        assertFalse(mic3.equals(mic5));
        assertFalse(mic3.equals(""));
    }


    @Test
    public void testHashCode() {
        Mic mic1 = new Mic("SWEDEN", "SE", "XSTO", "XSTO", "O","NASDAQ STOCKHOLM AB",
                null, "STOCKHOLM", "WWW.NASDAQOMXNORDIC.COM", "DECEMBER 2015", "ACTIVE", "JULY 2010", "");

        assertEquals(745030446, mic1.hashCode());
    }

}
