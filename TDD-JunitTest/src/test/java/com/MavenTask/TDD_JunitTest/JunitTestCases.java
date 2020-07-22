package com.MavenTask.TDD_JunitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	/*
	 * Test 1 => "ABCD" => "BCD"
	 * Test 2 => "AACD" => "CD"
	 * Test 3 => "BBAA" => "BBAA"
	 * Test 4 => "AABAA" => "BAA"
	 * 
	 */
public class JunitTestCases 
{
	StringEliminates stringEliminates;
	@BeforeEach
	void setUp() {
		stringEliminates = new StringEliminates();
	} 
   @Test
   void testCase() {
	   assertEquals("CD",stringEliminates.remove("AACD"));
   }
   @Test
   void testCase2() {
	   assertEquals("BCD",stringEliminates.remove("ABCD"));
   }
   @Test
   void testCase3() {
	   assertEquals("BBAA",stringEliminates.remove("BBAA"));
   }
   @Test
   void testCase4() {
	   assertEquals("BAA",stringEliminates.remove("AABAA"));
   }
   @Test
   void testCase5() {
	   assertEquals("CCHA",stringEliminates.remove("ACCHA"));
   }
   @Test
   void testCase6() {
	   assertEquals("BCD",stringEliminates.remove("BACD"));
   }
}
