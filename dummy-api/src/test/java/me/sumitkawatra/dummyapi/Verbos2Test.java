package me.sumitkawatra.dummyapi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

public class Verbos2Test {
	
	@Test
	@Tags(value = {
			@Tag(value = "journey-1")
	})
	@DisplayName("Blah Blah")
	public void testInfoExample(TestInfo testInfo) {
		System.out.println(testInfo);
	}
	
	@Tags(value = {
			@Tag(value = "journey-1")
	})
	@DisplayName("You will have test Info here")
	@RepeatedTest(5)
	@Execution(ExecutionMode.SAME_THREAD)
	public void testInfoExample2(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println(testInfo);
		System.out.println(repetitionInfo);
	}
	
	

}
