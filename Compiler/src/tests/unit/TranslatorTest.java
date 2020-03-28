package tests.unit;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import model.Translator;

public class TranslatorTest {
	@Test
	public void testlistOfVariablesUsed0() {
		Translator tr = new Translator();
		List<String> expected = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		String val = "arg1";
		String largestVal = "arg1'''";
		expected.add("arg1'");
		expected.add("arg1''");
		expected.add("arg1'''");
		result = tr.listOfVariablesUsed(val, largestVal);
		assertTrue(result.equals(expected));
	}
	
	@Test
	public void testlistOfVariablesUsed1() {
		Translator tr = new Translator();
		List<String> expected = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		String val = "arg1";
		String largestVal = "arg1";
		result = tr.listOfVariablesUsed(val, largestVal);
		assertTrue(result.equals(expected));
	}

	@Test
	public void testlistOfVariablesUsed2() {
		Translator tr = new Translator();
		List<String> expected = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		String val = "arg1";
		String largestVal = "arg1'";
		expected.add("arg1'");
		result = tr.listOfVariablesUsed(val, largestVal);
		assertTrue(result.equals(expected));
	}
	
	@Test
	public void testlistOfVariablesUsed3() {
		Translator tr = new Translator();
		List<String> expected = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		String val = "arg1";
		String largestVal = "arg1''''";
		expected.add("arg1'");
		expected.add("arg1''");
		expected.add("arg1'''");
		expected.add("arg1''''");
		result = tr.listOfVariablesUsed(val, largestVal);
		assertTrue(result.equals(expected));
	}

	
	@Test
	public void testlargestValueMap0() {
		Translator tr = new Translator();
		Map<String, String> originalToAlloy = new HashMap<>();
		originalToAlloy.put("x", "arg1");
		originalToAlloy.put("y", "arg2");
		
		Map<String, String> alloyAssignments = new HashMap<>();
		alloyAssignments.put("arg1'","3");
		alloyAssignments.put("arg2'","13");
		
		Map<String, String> originalToLargesAlloy = new HashMap<>();
		originalToLargesAlloy.put("x", "arg1'''");
		originalToLargesAlloy.put("y", "arg2'");
				
		Map<String, String> result = tr.largestValueMap(originalToAlloy, alloyAssignments, originalToLargesAlloy);
		
		Map<String, String> expected = new HashMap<>();
		expected.put("arg1'''", "arg1'");
		
		assertTrue(result.equals(expected));
	}	
	
	@Test
	public void testlargestValueMap1() {
		Translator tr = new Translator();
		Map<String, String> originalToAlloy = new HashMap<>();
		originalToAlloy.put("x", "arg1");
		originalToAlloy.put("y", "arg2");
		
		Map<String, String> alloyAssignments = new HashMap<>();
		alloyAssignments.put("arg1'","13");
		alloyAssignments.put("arg1''","3");
		alloyAssignments.put("arg2'","13");
		
		Map<String, String> originalToLargesAlloy = new HashMap<>();
		originalToLargesAlloy.put("x", "arg1'''");
		originalToLargesAlloy.put("y", "arg2'");
				
		Map<String, String> result = tr.largestValueMap(originalToAlloy, alloyAssignments, originalToLargesAlloy);
		
		Map<String, String> expected = new HashMap<>();
		expected.put("arg1'''", "arg1''");
		
		assertTrue(result.equals(expected));
	}	
	
	@Test
	public void testlargestValueMap2() {
		Translator tr = new Translator();
		Map<String, String> originalToAlloy = new HashMap<>();
		originalToAlloy.put("x", "arg1");
		originalToAlloy.put("y", "arg2");
		
		Map<String, String> alloyAssignments = new HashMap<>();
		alloyAssignments.put("arg1'","13");
		alloyAssignments.put("arg1''","3");
		alloyAssignments.put("arg1'''","113");
		alloyAssignments.put("arg2'","13");
		
		Map<String, String> originalToLargesAlloy = new HashMap<>();
		originalToLargesAlloy.put("x", "arg1'''");
		originalToLargesAlloy.put("y", "arg2'");
				
		Map<String, String> result = tr.largestValueMap(originalToAlloy, alloyAssignments, originalToLargesAlloy);
		
		Map<String, String> expected = new HashMap<>(); // empty
		
		assertTrue(result.equals(expected));
	}
	
	@Test
	public void testlargestValueMap3() {
		Translator tr = new Translator();
		Map<String, String> originalToAlloy = new HashMap<>();
		originalToAlloy.put("x", "arg1");
		originalToAlloy.put("y", "arg2");
		
		Map<String, String> alloyAssignments = new HashMap<>();
		alloyAssignments.put("arg1'","13");
		alloyAssignments.put("arg2'","13");
		
		Map<String, String> originalToLargesAlloy = new HashMap<>();
		originalToLargesAlloy.put("x", "arg1'''");
		originalToLargesAlloy.put("y", "arg2''");
				
		Map<String, String> result = tr.largestValueMap(originalToAlloy, alloyAssignments, originalToLargesAlloy);
		
		Map<String, String> expected = new HashMap<>();
		expected.put("arg1'''", "arg1'");
		expected.put("arg2''", "arg2'");
		
		assertTrue(result.equals(expected));
	}
	
	@Test
	public void testlargestValueMap4() {
		Translator tr = new Translator();
		Map<String, String> originalToAlloy = new HashMap<>();
		originalToAlloy.put("x", "arg1");
		originalToAlloy.put("y", "arg2");
		
		Map<String, String> alloyAssignments = new HashMap<>();
		alloyAssignments.put("arg1'","13");
		alloyAssignments.put("arg1''","3");
		alloyAssignments.put("arg2'","13");
		
		Map<String, String> originalToLargesAlloy = new HashMap<>();
		originalToLargesAlloy.put("x", "arg1'''");
		originalToLargesAlloy.put("y", "arg2''");
				
		Map<String, String> result = tr.largestValueMap(originalToAlloy, alloyAssignments, originalToLargesAlloy);
		
		Map<String, String> expected = new HashMap<>();
		expected.put("arg1'''", "arg1''");
		expected.put("arg2''", "arg2'");
		
		assertTrue(result.equals(expected));
	}
	
	
	@Test
	public void updateMapping0(){
		Translator tr = new Translator();
		Map<String, String> givenMapping = new HashMap<>();
		givenMapping.put("x", "arg1");
		givenMapping.put("y", "arg2");
		
		Map<String, String> newMapping = new HashMap<>();
		newMapping.put("arg1'","3");
		newMapping.put("arg1''","5");
		newMapping.put("arg2'","13");
		newMapping.put("arg2''","1");
		newMapping.put("arg2'''","31");
		
		tr.updateToLargestMapping(givenMapping, newMapping);
		
		Map<String, String> expected = new HashMap<>();
		expected.put("x", "arg1''");
		expected.put("y", "arg2'''");
		
//		System.out.println("Result:"+givenMapping.toString());
//		System.out.println("expected:"+expected.toString());
		assertTrue(givenMapping.equals(expected));
	}

	
	@Test
	public void updateMapping1(){
		Translator tr = new Translator();
		Map<String, String> givenMapping = new HashMap<>();
		givenMapping.put("x", "arg1");
		givenMapping.put("y", "arg2");
		
		Map<String, String> newMapping = new HashMap<>();
		newMapping.put("arg2'","13");
		newMapping.put("arg2''","1");
		newMapping.put("arg2'''","31");
		
		tr.updateToLargestMapping(givenMapping, newMapping);
		
		Map<String, String> expected = new HashMap<>();
		expected.put("x", "arg1");
		expected.put("y", "arg2'''");

		assertTrue(givenMapping.equals(expected));
	}
	
	@Test
	public void updateMapping2(){
		Translator tr = new Translator();
		Map<String, String> givenMapping = new HashMap<>();
		givenMapping.put("x", "arg1");
		givenMapping.put("y", "arg2");
		
		Map<String, String> newMapping = new HashMap<>();
		
		tr.updateToLargestMapping(givenMapping, newMapping);
		
		Map<String, String> expected = new HashMap<>();
		expected.put("x", "arg1");
		expected.put("y", "arg2");

		assertTrue(givenMapping.equals(expected));
	}
	
	@Test
	public void updateMapping3(){
		Translator tr = new Translator();
		Map<String, String> givenMapping = new HashMap<>();
		givenMapping.put("x", "arg1");
		givenMapping.put("y", "arg2");
		
		Map<String, String> newMapping = new HashMap<>();
		newMapping.put("arg1'","2");
		newMapping.put("arg2'","13");
		newMapping.put("arg2''","1");
		newMapping.put("arg2'''","31");
		
		tr.updateToLargestMapping(givenMapping, newMapping);
		
		Map<String, String> expected = new HashMap<>();
		expected.put("x", "arg1'");
		expected.put("y", "arg2'''");

		assertTrue(givenMapping.equals(expected));
	}
	
	@Test
	public void updateMapping4(){
		Translator tr = new Translator();
		Map<String, String> givenMapping = new HashMap<>();
		givenMapping.put("x", "arg1");
		
		Map<String, String> newMapping = new HashMap<>();
		newMapping.put("arg1'","2");
		newMapping.put("arg1''","3");
		newMapping.put("arg2'","13");
		newMapping.put("arg2''","1");
		newMapping.put("arg2'''","31");
		
		tr.updateToLargestMapping(givenMapping, newMapping);
		
		Map<String, String> expected = new HashMap<>();
		expected.put("x", "arg1''");

		assertTrue(givenMapping.equals(expected));
	}

	@Test
	public void updateMapping5(){
		Translator tr = new Translator();
		Map<String, String> givenMapping = new HashMap<>();
		
		Map<String, String> newMapping = new HashMap<>();
		newMapping.put("arg1'","2");
		newMapping.put("arg1''","3");
		newMapping.put("arg2'","13");
		newMapping.put("arg2''","1");
		newMapping.put("arg2'''","31");
		
		tr.updateToLargestMapping(givenMapping, newMapping);
		
		Map<String, String> expected = new HashMap<>();

		assertTrue(givenMapping.equals(expected));
	}
	
}


