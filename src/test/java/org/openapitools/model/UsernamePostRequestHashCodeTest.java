
// ********RoostGPT********
/*
Test generated by RoostGPT for test java-unit-test using AI Type  and AI Model

ROOST_METHOD_HASH=hashCode_b3a540107a
ROOST_METHOD_SIG_HASH=hashCode_44411a81c8

"""
Scenario 1: Test hashCode with same text
Details:
  TestName: testHashCodeWithSameText
  Description: This test is meant to check the hashCode method when the same text is used. It tests the functionality that two UsernamePostRequest objects with the same text should return the same hash code.
Execution:
  Arrange: Create two UsernamePostRequest objects with the same text.
  Act: Invoke the hashCode method on both objects.
  Assert: Use JUnit assertions to compare the hash codes from both objects.
Validation:
  The assertion aims to verify that the hash codes from both objects are the same as they have the same text. This is significant in ensuring the proper functioning of the hashCode method for objects with the same state.

Scenario 2: Test hashCode with different text
Details:
  TestName: testHashCodeWithDifferentText
  Description: This test is meant to check the hashCode method when different text is used. It tests the functionality that two UsernamePostRequest objects with different text should return different hash codes.
Execution:
  Arrange: Create two UsernamePostRequest objects with different text.
  Act: Invoke the hashCode method on both objects.
  Assert: Use JUnit assertions to compare the hash codes from both objects.
Validation:
  The assertion aims to verify that the hash codes from both objects are different as they have different text. This is significant in ensuring the proper functioning of the hashCode method for objects with different states.

Scenario 3: Test hashCode with null text
Details:
  TestName: testHashCodeWithNullText
  Description: This test is meant to check the hashCode method when the text is null. It tests the functionality that a UsernamePostRequest object with null text should not throw a NullPointerException.
Execution:
  Arrange: Create a UsernamePostRequest object with null text.
  Act: Invoke the hashCode method on the object.
  Assert: Use JUnit assertions to ensure that no exception is thrown.
Validation:
  The assertion aims to verify that the hashCode method handles null text without throwing an exception. This is significant in ensuring the robustness of the hashCode method in handling null values.
"""
*/

// ********RoostGPT********

package org.openapitools.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
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

public class UsernamePostRequestHashCodeTest {

	@Test
	@Tag("valid")
	public void testHashCodeWithSameText() {
		UsernamePostRequest usernamePostRequest1 = new UsernamePostRequest();
		UsernamePostRequest usernamePostRequest2 = new UsernamePostRequest();
		usernamePostRequest1.setText("SameText");
		usernamePostRequest2.setText("SameText");
		int hashCode1 = usernamePostRequest1.hashCode();
		int hashCode2 = usernamePostRequest2.hashCode();
		assertEquals(hashCode1, hashCode2, "Hash codes should be equal for objects with same text");
	}

	@Test
	@Tag("valid")
	public void testHashCodeWithDifferentText() {
		UsernamePostRequest usernamePostRequest1 = new UsernamePostRequest();
		UsernamePostRequest usernamePostRequest2 = new UsernamePostRequest();
		usernamePostRequest1.setText("Text1");
		usernamePostRequest2.setText("Text2");
		int hashCode1 = usernamePostRequest1.hashCode();
		int hashCode2 = usernamePostRequest2.hashCode();
		assertNotEquals(hashCode1, hashCode2, "Hash codes should not be equal for objects with different text");
	}

	@Test
	@Tag("boundary")
	public void testHashCodeWithNullText() {
		UsernamePostRequest usernamePostRequest = new UsernamePostRequest();
		usernamePostRequest.setText(null);
		assertDoesNotThrow(usernamePostRequest::hashCode,
				"hashCode method should not throw exception when text is null");
	}

}