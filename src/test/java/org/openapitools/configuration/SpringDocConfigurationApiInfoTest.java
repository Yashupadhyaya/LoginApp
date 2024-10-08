
// ********RoostGPT********
/*
Test generated by RoostGPT for test java-unit-test using AI Type  and AI Model

ROOST_METHOD_HASH=apiInfo_94713fc36a
ROOST_METHOD_SIG_HASH=apiInfo_c2ad780628

"""
Scenario 1: Test to verify if the apiInfo() method returns an OpenAPI object with correct 'Info' details

Details:
  TestName: testApiInfoReturnsCorrectOpenAPIObject
  Description: This test is meant to check if the apiInfo() method is returning an OpenAPI object with correct 'Info' details like title, description and version.
Execution:
  Arrange: No arrangement is required as no input parameters are needed for the method.
  Act: Invoke the apiInfo() method.
  Assert: Use JUnit assertions to compare the actual result against the expected OpenAPI object.
Validation:
  The assertion aims to verify that the returned OpenAPI object has the correct 'Info' details like title, description and version. This is important as it ensures that the API documentation is generated correctly.

Scenario 2: Test to verify if the apiInfo() method returns a new OpenAPI object for every invocation

Details:
  TestName: testApiInfoReturnsNewObjectForEachInvocation
  Description: This test is meant to check if the apiInfo() method returns a new OpenAPI object for every invocation.
Execution:
  Arrange: No arrangement is required as no input parameters are needed for the method.
  Act: Invoke the apiInfo() method twice.
  Assert: Use JUnit assertions to compare the two returned OpenAPI objects using '!=' operator.
Validation:
  The assertion aims to verify that the apiInfo() method returns a new OpenAPI object for every invocation. This is important as it ensures that the method is stateless and does not return the same object for multiple invocations.

Scenario 3: Test to verify if the apiInfo() method returns an OpenAPI object with non-null 'Info' details

Details:
  TestName: testApiInfoReturnsNonNullInfoDetails
  Description: This test is meant to check if the apiInfo() method is returning an OpenAPI object with non-null 'Info' details.
Execution:
  Arrange: No arrangement is required as no input parameters are needed for the method.
  Act: Invoke the apiInfo() method.
  Assert: Use JUnit assertions to check if the 'Info' details of the returned OpenAPI object are non-null.
Validation:
  The assertion aims to verify that the returned OpenAPI object has non-null 'Info' details. This is important as it ensures that the API documentation is complete and does not have any missing information.
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

	SpringDocConfiguration springDocConfiguration = new SpringDocConfiguration();

	@Test
	@Tag("valid")
	public void testApiInfoReturnsCorrectOpenAPIObject() {
		OpenAPI expectedOpenApi = new OpenAPI().info(new Info().title("Login API")
			.description("The API specification for Login functionality based on given Gherkin scenarios")
			.version("1.0.0"));
		OpenAPI resultOpenApi = springDocConfiguration.apiInfo();
		assertEquals(expectedOpenApi.getInfo().getTitle(), resultOpenApi.getInfo().getTitle());
		assertEquals(expectedOpenApi.getInfo().getDescription(), resultOpenApi.getInfo().getDescription());
		assertEquals(expectedOpenApi.getInfo().getVersion(), resultOpenApi.getInfo().getVersion());
	}

	@Test
	@Tag("valid")
	public void testApiInfoReturnsNewObjectForEachInvocation() {
		OpenAPI resultOpenApi1 = springDocConfiguration.apiInfo();
		OpenAPI resultOpenApi2 = springDocConfiguration.apiInfo();
		assertNotSame(resultOpenApi1, resultOpenApi2);
	}

	@Test
	@Tag("valid")
	public void testApiInfoReturnsNonNullInfoDetails() {
		OpenAPI resultOpenApi = springDocConfiguration.apiInfo();
		assertNotNull(resultOpenApi.getInfo().getTitle());
		assertNotNull(resultOpenApi.getInfo().getDescription());
		assertNotNull(resultOpenApi.getInfo().getVersion());
	}

}