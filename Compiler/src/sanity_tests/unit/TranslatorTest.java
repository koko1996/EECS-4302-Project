package tests.unit;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import model.Translator;

public class TranslatorTest extends Translator {
	@Test
	public void testlistOfVariablesUsed0() {
		List<String> expected = new ArrayList<>();
		List<String> result = new ArrayList<>();

		String val = "arg1";
		String largestVal = "arg1'''";
		expected.add("arg1'");
		expected.add("arg1''");
		expected.add("arg1'''");
		result = listOfVariablesUsed(val, largestVal);
		assertTrue(result.equals(expected));
	}

	@Test
	public void testlistOfVariablesUsed1() {
		List<String> expected = new ArrayList<>();
		List<String> result = new ArrayList<>();

		String val = "arg1";
		String largestVal = "arg1";
		result = listOfVariablesUsed(val, largestVal);
		assertTrue(result.equals(expected));
	}

	@Test
	public void testlistOfVariablesUsed2() {
		List<String> expected = new ArrayList<>();
		List<String> result = new ArrayList<>();

		String val = "arg1";
		String largestVal = "arg1'";
		expected.add("arg1'");
		result = listOfVariablesUsed(val, largestVal);
		assertTrue(result.equals(expected));
	}

	@Test
	public void testlistOfVariablesUsed3() {
		List<String> expected = new ArrayList<>();
		List<String> result = new ArrayList<>();

		String val = "arg1";
		String largestVal = "arg1''''";
		expected.add("arg1'");
		expected.add("arg1''");
		expected.add("arg1'''");
		expected.add("arg1''''");
		result = listOfVariablesUsed(val, largestVal);
		assertTrue(result.equals(expected));
	}

	@Test
	public void testUpdateToLargestMapping0() {
		Map<String, String> givenMapping = new HashMap<>();
		givenMapping.put("x", "arg1");
		givenMapping.put("y", "arg2'");

		Map<String, String> newMapping = new HashMap<>();
		newMapping.put("x", "arg1''");
		newMapping.put("y", "arg2");
		

		updateToLargestMapping(givenMapping, newMapping);

		Map<String, String> expected = new HashMap<>();
		expected.put("x", "arg1''");
		expected.put("y", "arg2'");


		assertTrue(givenMapping.equals(expected));
	}

	@Test
	public void testUpdateToLargestMapping1() {
		Map<String, String> givenMapping = new HashMap<>();
		givenMapping.put("x", "arg1");
		givenMapping.put("y", "arg2''");

		Map<String, String> newMapping = new HashMap<>();
		newMapping.put("y","arg2'");


		updateToLargestMapping(givenMapping, newMapping);

		Map<String, String> expected = new HashMap<>();
		expected.put("x", "arg1");
		expected.put("y", "arg2''");

		assertTrue(givenMapping.equals(expected));
	}

	@Test
	public void testUpdateToLargestMapping2() {
		Map<String, String> givenMapping = new HashMap<>();
		givenMapping.put("x", "arg1");
		givenMapping.put("y", "arg2");

		Map<String, String> newMapping = new HashMap<>();

		updateToLargestMapping(givenMapping, newMapping);

		Map<String, String> expected = new HashMap<>();
		expected.put("x", "arg1");
		expected.put("y", "arg2");

		assertTrue(givenMapping.equals(expected));
	}

	@Test
	public void testUpdateToLargestMapping3() {
		Map<String, String> givenMapping = new HashMap<>();
	
		Map<String, String> newMapping = new HashMap<>();
		newMapping.put("x", "arg1");
		newMapping.put("y", "arg2");
		

		updateToLargestMapping(givenMapping, newMapping);

		Map<String, String> expected = new HashMap<>();
		
//		System.out.println("Result:"+givenMapping.toString());
//		System.out.println("expected:"+expected.toString());
		assertTrue(givenMapping.equals(expected));
	}
	
	@Test
	public void testLargestValueMap0() {
		Map<String, String> originalToAlloy = new HashMap<>();
		originalToAlloy.put("x", "arg1");
		originalToAlloy.put("y", "arg2'");

		Map<String, String> originalToLargesAlloy = new HashMap<>();
		originalToLargesAlloy.put("x", "arg1'''");
		originalToLargesAlloy.put("y", "arg2'");

		Map<String, String> result = largestValueMap( originalToAlloy, originalToLargesAlloy);

		Map<String, String> expected = new HashMap<>();
		expected.put("arg1'''", "arg1");

		assertTrue(result.equals(expected));
	}

	@Test
	public void testLargestValueMap1() {
		Map<String, String> originalToAlloy = new HashMap<>();
		originalToAlloy.put("x", "arg1");
		originalToAlloy.put("y", "arg2");

		Map<String, String> originalToLargesAlloy = new HashMap<>();
		originalToLargesAlloy.put("x", "arg1'''");
		originalToLargesAlloy.put("y", "arg2'");

		Map<String, String> result = largestValueMap( originalToAlloy, originalToLargesAlloy);

		Map<String, String> expected = new HashMap<>();
		expected.put("arg1'''", "arg1");
		expected.put("arg2'", "arg2");

		assertTrue(result.equals(expected));
	}

	@Test
	public void testLargestValueMap2() {
		Map<String, String> originalToAlloy = new HashMap<>();
		originalToAlloy.put("x", "arg1'''");
		originalToAlloy.put("y", "arg2");

		Map<String, String> originalToLargesAlloy = new HashMap<>();
		originalToLargesAlloy.put("x", "arg1'''");
		originalToLargesAlloy.put("y", "arg2'");

		Map<String, String> result = largestValueMap( originalToAlloy, originalToLargesAlloy);

		Map<String, String> expected = new HashMap<>();
		expected.put("arg2'", "arg2");


		assertTrue(result.equals(expected));
	}

	

	@Test
	public void testUpdateToString0() {
		List<String> origOutput = new ArrayList<>();
		origOutput.add("x");
		origOutput.add("+");
		origOutput.add("y");
		origOutput.add("-");
		origOutput.add("5");
		
		Map<String, String> updates = new HashMap<>();
		updates.put("x", "arg1'");
		updates.put("y", "arg2''");

		Map<String, String> otherUpdates = new HashMap<>();
		Map<String,String> resultMaxUsed = new HashMap<>();


		String result = updateToString(origOutput, updates, otherUpdates, resultMaxUsed);
		String expected = "arg1'+arg2''-5"; 

		assertTrue(result.equals(expected));
	}
	
	@Test
	public void testUpdateToString1() {
		List<String> origOutput = new ArrayList<>();
		origOutput.add("x");
		origOutput.add("+");
		origOutput.add("y");
		origOutput.add("-");
		origOutput.add("5");
		
		Map<String, String> updates = new HashMap<>();
		updates.put("x", "arg1'");
		updates.put("y", "arg2''");
		Map<String, String> tmpUpdates = new HashMap<>(updates);

		Map<String, String> otherUpdates = new HashMap<>();;
		otherUpdates.put("x", "arg1'''");
		otherUpdates.put("y", "arg2''");
		Map<String, String> tmpOtherUpdates = new HashMap<>(otherUpdates);
		
		Map<String,String> resultMaxUsed = new HashMap<>();
		resultMaxUsed.put("x", "arg1");
		resultMaxUsed.put("y", "arg2'''''");
		Map<String, String> tmpResultMaxUsed = new HashMap<>(resultMaxUsed);

		String result = updateToString(origOutput, updates, otherUpdates, resultMaxUsed);
		String expected = "arg1'+arg2''-5"; 

		assertTrue(result.equals(expected));
		// Check that they were not changed
		assertTrue(updates.equals(tmpUpdates));
		assertTrue(otherUpdates.equals(tmpOtherUpdates));
		assertTrue(resultMaxUsed.equals(tmpResultMaxUsed));
	}
	
}
