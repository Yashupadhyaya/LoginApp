
// ********RoostGPT********
/*
Test generated by RoostGPT for test java-test-retrigger using AI Type  and AI Model

ROOST_METHOD_HASH=jsonNullableModule_a5474cf4ef
ROOST_METHOD_SIG_HASH=jsonNullableModule_ad3904021e

"""
 Scenario 1: Verify the jsonNullableModule method returns an instance of JsonNullableModule

 Details:
   TestName: testJsonNullableModuleReturnInstance
   Description: This test is meant to check that the jsonNullableModule method returns an instance of JsonNullableModule.
 Execution:
   Arrange: No arrangement is necessary as no parameters are passed to the method.
   Act: Invoke the jsonNullableModule method.
   Assert: Use JUnit assertions to compare the actual result's class type against the expected class type (JsonNullableModule).
 Validation:
   The assertion aims to verify that the returned object is an instance of JsonNullableModule. The expected result is JsonNullableModule, as it is the class being instantiated in the method. This test is significant as it ensures the method is functioning as expected and returns the correct object type.

 Scenario 2: Verify the jsonNullableModule method does not return null

 Details:
   TestName: testJsonNullableModuleReturnNotNull
   Description: This test is meant to check that the jsonNullableModule method does not return a null value.
 Execution:
   Arrange: No arrangement is necessary as no parameters are passed to the method.
   Act: Invoke the jsonNullableModule method.
   Assert: Use JUnit assertions to check that the returned object is not null.
 Validation:
   The assertion aims to verify that the returned object is not null. The expected result is a non-null value, as the method is supposed to instantiate a new JsonNullableModule object. This test is significant as it ensures the method is functioning as expected and does not return null.

 Scenario 3: Verify the jsonNullableModule method returns a new instance each time it's invoked

 Details:
   TestName: testJsonNullableModuleReturnNewInstance
   Description: This test is meant to check that the jsonNullableModule method returns a new instance of JsonNullableModule each time it's invoked.
 Execution:
   Arrange: No arrangement is necessary as no parameters are passed to the method.
   Act: Invoke the jsonNullableModule method twice.
   Assert: Use JUnit assertions to check that the two returned objects are not the same instance.
 Validation:
   The assertion aims to verify that the method returns a new instance each time it's called. The expected result is two different instances, as the method is supposed to instantiate a new JsonNullableModule object each time it's invoked. This test is significant as it ensures the method is not returning a singleton or reused instance.
"""
*/

// ********RoostGPT********

package org.openapitools;

import com.fasterxml.jackson.databind.Module;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.api.*;

public class OpenApiGeneratorApplicationJsonNullableModuleTest {

	private OpenApiGeneratorApplication generatorApplication = new OpenApiGeneratorApplication();

	@Test
	@Tag("valid")
	public void testJsonNullableModuleReturnInstance() {
		Module module = generatorApplication.jsonNullableModule();
		assertEquals(JsonNullableModule.class, module.getClass());
	}

	@Test
	@Tag("valid")
	public void testJsonNullableModuleReturnNotNull() {
		Module module = generatorApplication.jsonNullableModule();
		assertNotNull(module);
	}

	@Test
	@Tag("valid")
	public void testJsonNullableModuleReturnNewInstance() {
		Module module1 = generatorApplication.jsonNullableModule();
		Module module2 = generatorApplication.jsonNullableModule();
		assertNotSame(module1, module2);
	}

}