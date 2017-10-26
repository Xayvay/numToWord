package com.example.numToWord;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
	
    NTWConverter converter = new NTWConverter();


	@Test
    public void testWhatsTheHighestPlace(){
    	
    	assertEquals("Thousand",converter.calculatePlace(1000));
    	
    }
	
	@Test
	public void testWhatsTheOnesPlace(){
		
		assertEquals("Eight",converter.calculateOnesPlace(8));
	}
	
	@Test
	public void testPlaceName(){
		assertEquals("Six Thousand Three Hundred Seventeen", converter.numberToWord(6317));
		
	}
}
