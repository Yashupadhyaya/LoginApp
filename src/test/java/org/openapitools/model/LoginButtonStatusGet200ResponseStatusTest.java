
// ********RoostGPT********
/*
Test generated by RoostGPT for test java-unit-test using AI Type  and AI Model

ROOST_METHOD_HASH=status_24d9688765
ROOST_METHOD_SIG_HASH=status_19a1651468

Scenario 1: Test to check if status method returns the correct object type

Details:
    TestName: testStatusMethodReturnType
    Description: This test is meant to check if the status method returns the correct object type which in this case should be an instance of LoginButtonStatusGet200Response.
  Execution:
    Arrange: Instantiate a LoginButtonStatusGet200Response object and set a status value.
    Act: Invoke the status method on the object.
    Assert: Use JUnit assertions to check if the returned object is an instance of LoginButtonStatusGet200Response.
  Validation:
    This assertion aims to verify that the status method is returning the correct object type. The expected result is an instance of LoginButtonStatusGet200Response because the method is supposed to return the current instance of the class after setting the status.

Scenario 2: Test to check if status method sets the correct status value

Details:
    TestName: testStatusMethodValueSet
    Description: This test is meant to check if the status method sets the correct status value.
  Execution:
    Arrange: Instantiate a LoginButtonStatusGet200Response object and set a status value.
    Act: Invoke the status method on the object with a specific string value.
    Assert: Use JUnit assertions to compare the status value of the object with the string value set.
  Validation:
    This assertion aims to verify that the status method sets the correct status value. The expected result is the string value that was set because the status method is supposed to set the status value to the string value passed to it.

Scenario 3: Test to check if status method handles null value

Details:
    TestName: testStatusMethodNullValue
    Description: This test is meant to check if the status method handles null value.
  Execution:
    Arrange: Instantiate a LoginButtonStatusGet200Response object.
    Act: Invoke the status method on the object with null value.
    Assert: Use JUnit assertions to check if the status value of the object is null.
  Validation:
    This assertion aims to verify that the status method can handle null values. The expected result is null because the status method is supposed to set the status value to the value passed to it, which in this case is null.
*/

// ********RoostGPT********

package org.openapitools.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

public class LoginButtonStatusGet200ResponseStatusTest {

	@Test
	@Tag("valid")
	public void testStatusMethodReturnType() {
		LoginButtonStatusGet200Response testObject = new LoginButtonStatusGet200Response();
		assertTrue(testObject.status("active") instanceof LoginButtonStatusGet200Response);
	}

	@Test
	@Tag("valid")
	public void testStatusMethodValueSet() {
		LoginButtonStatusGet200Response testObject = new LoginButtonStatusGet200Response();
		testObject.status("active");
		assertEquals("active", testObject.getStatus());
	}

	@Test
	@Tag("boundary")
	public void testStatusMethodNullValue() {
		LoginButtonStatusGet200Response testObject = new LoginButtonStatusGet200Response();
		testObject.status(null);
		assertNull(testObject.getStatus());
	}

}