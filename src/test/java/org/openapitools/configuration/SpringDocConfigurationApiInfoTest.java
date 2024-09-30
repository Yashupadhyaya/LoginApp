
// ********RoostGPT********
/*
Test generated by RoostGPT for test java-unit-test using AI Type  and AI Model

ROOST_METHOD_HASH=apiInfo_94713fc36a
ROOST_METHOD_SIG_HASH=apiInfo_c2ad780628

"""
Scenario 1: Test to verify if the apiInfo() method returns an OpenAPI object with correct 'Info' details

Details:
  TestName: testApiInfoReturnsCorrectOpenAPIObject
  Description: This test is meant to check if the apiInfo() method returns an OpenAPI object with the correct 'Info' details. The test will verify the title, description, and version of the API as set in the apiInfo() method.
Execution:
  Arrange: No arrangement is needed as the apiInfo() method does not take any parameters.
  Act: Invoke the apiInfo() method.
  Assert: Use JUnit assertions to compare actual results against expected outcomes. The expected title is "Login API", the expected description is "The API specification for Login functionality based on given Gherkin scenarios", and the expected version is "1.0.0".
Validation:
  The assertion aims to verify that the returned OpenAPI object contains the correct 'Info' details. The expected result is based on the hardcoded values set in the apiInfo() method. This test is significant because it ensures the correct API information is being set and returned, which is crucial for API documentation and usage.

Scenario 2: Test to verify if the apiInfo() method returns a non-null OpenAPI object

Details:
  TestName: testApiInfoReturnsNonNullObject
  Description: This test is meant to check if the apiInfo() method returns a non-null OpenAPI object. This is to ensure that the method does not return a null value, which could lead to NullPointerExceptions in other parts of the code that use this method.
Execution:
  Arrange: No arrangement is needed as the apiInfo() method does not take any parameters.
  Act: Invoke the apiInfo() method.
  Assert: Use JUnit assertions to assert that the returned OpenAPI object is not null.
Validation:
  The assertion aims to verify that the returned OpenAPI object is not null. The significance of this test is to ensure that the method is robust and does not cause potential NullPointerExceptions in other parts of the code.

Scenario 3: Test to verify if the apiInfo() method returns a new OpenAPI object each time it is invoked

Details:
  TestName: testApiInfoReturnsNewObjectEachTime
  Description: This test is meant to check if the apiInfo() method returns a new OpenAPI object each time it is invoked. This is to ensure that the method does not return a shared object, which could lead to unexpected behavior if the object is modified elsewhere.
Execution:
  Arrange: No arrangement is needed as the apiInfo() method does not take any parameters.
  Act: Invoke the apiInfo() method twice.
  Assert: Use JUnit assertions to assert that the two returned OpenAPI objects are not the same instance.
Validation:
  The assertion aims to verify that the apiInfo() method returns a new OpenAPI object each time it is invoked. The significance of this test is to ensure that the method returns a fresh object each time, preventing potential issues caused by shared objects.
"""
*/

// ********RoostGPT********

package org.openapitools.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

public class SpringDocConfigurationApiInfoTest {

	@Test
	@Tag("valid")
	public void testApiInfoReturnsCorrectOpenAPIObject() {
		SpringDocConfiguration config = new SpringDocConfiguration();
		OpenAPI api = config.apiInfo();
		Info info = api.getInfo();
		assertEquals("Login API", info.getTitle());
		assertEquals("The API specification for Login functionality based on given Gherkin scenarios",
				info.getDescription());
		assertEquals("1.0.0", info.getVersion());
	}

	@Test
	@Tag("valid")
	public void testApiInfoReturnsNonNullObject() {
		SpringDocConfiguration config = new SpringDocConfiguration();
		OpenAPI api = config.apiInfo();
		assertNotNull(api);
	}

	@Test
	@Tag("valid")
	public void testApiInfoReturnsNewObjectEachTime() {
		SpringDocConfiguration config = new SpringDocConfiguration();
		OpenAPI api1 = config.apiInfo();
		OpenAPI api2 = config.apiInfo();
		assertNotSame(api1, api2);
	}

}