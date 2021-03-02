package me.sumitkawatra.dummyapi.advance;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.util.StringUtils;

public class ParameterTest {
	
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void stringTest(String candidate) {
	    Assertions.assertTrue(StringUtils.hasText(candidate));
	}
	
	@ParameterizedTest
	@NullSource
	@EmptySource
	void stringTestNullOrEmpty(String candidate) {
	    Assertions.assertFalse(StringUtils.hasText(candidate));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	void stringTestNullOrEmpty2(String candidate) {
	    Assertions.assertFalse(StringUtils.hasText(candidate));
	}
	
	
	@ParameterizedTest
	@MethodSource("cars")
	void objectTests(Car car) {
	    Assertions.assertTrue(StringUtils.hasText(car.getName()));
	}
	
	
	static Stream<Car> cars() {
		return Stream.of(new Car("Maruti"), new Car("tata"));
	}
	
	static class Car {
		public Car(String name) {
			this.setName(name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private String name;
	}

}
