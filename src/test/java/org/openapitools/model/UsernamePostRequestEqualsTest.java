

// ********RoostGPT********
/*
Test generated by RoostGPT for test java-unit-test using AI Type  and AI Model 

ROOST_METHOD_HASH=equals_b681aea965
ROOST_METHOD_SIG_HASH=equals_ded257778a

"""
Scenario 1: Testing equals method with the same object
Details:
  TestName: equalsSameObject
  Description: This test aims to check the equals method when the same object is passed as a parameter.
Execution:
  Arrange: Create a UsernamePostRequest object and set a text value.
  Act: Invoke the equals method passing the same object as a parameter.
  Assert: The equals method should return true.
Validation:
  The assertion verifies that the equals method correctly identifies that two references to the same object are indeed equal. It confirms the correctness of the equals method's identity comparison.

Scenario 2: Testing equals method with null
Details:
  TestName: equalsNullObject
  Description: This test aims to check the equals method when null is passed as a parameter.
Execution:
  Arrange: Create a UsernamePostRequest object and set a text value.
  Act: Invoke the equals method passing null as a parameter.
  Assert: The equals method should return false.
Validation:
  The assertion verifies that the equals method correctly identifies that an object is not equal to null. It confirms the correctness of the equals method's null check.

Scenario 3: Testing equals method with an object of a different class
Details:
  TestName: equalsDifferentClassObject
  Description: This test aims to check the equals method when an object of a different class is passed as a parameter.
Execution:
  Arrange: Create a UsernamePostRequest object and set a text value. Also, create an object of a different class.
  Act: Invoke the equals method passing the different class object as a parameter.
  Assert: The equals method should return false.
Validation:
  The assertion verifies that the equals method correctly identifies that objects of different classes are not equal. It confirms the correctness of the equals method's class comparison.

Scenario 4: Testing equals method with an object having different text value
Details:
  TestName: equalsDifferentTextValue
  Description: This test aims to check the equals method when an object with a different text value is passed as a parameter.
Execution:
  Arrange: Create two UsernamePostRequest objects with different text values.
  Act: Invoke the equals method on one object, passing the other object as a parameter.
  Assert: The equals method should return false.
Validation:
  The assertion verifies that the equals method correctly identifies that two objects with different text values are not equal. It confirms the correctness of the equals method's text comparison.

Scenario 5: Testing equals method with an object having the same text value
Details:
  TestName: equalsSameTextValue
  Description: This test aims to check the equals method when an object with the same text value is passed as a parameter.
Execution:
  Arrange: Create two UsernamePostRequest objects with the same text value.
  Act: Invoke the equals method on one object, passing the other object as a parameter.
  Assert: The equals method should return true.
Validation:
  The assertion verifies that the equals method correctly identifies that two objects with the same text values are equal. It confirms the correctness of the equals method's text comparison.
"""
*/

// ********RoostGPT********

package org.openapitools.model;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.openapitools.model.UsernamePostRequest;
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

public class UsernamePostRequestEqualsTest {
    @Test
    @Tag("valid")
    public void equalsSameObject() {
        UsernamePostRequest usernamePostRequest = new UsernamePostRequest();
        usernamePostRequest.setText("test");
        assertTrue(usernamePostRequest.equals(usernamePostRequest));
    }
    @Test
    @Tag("invalid")
    public void equalsNullObject() {
        UsernamePostRequest usernamePostRequest = new UsernamePostRequest();
        usernamePostRequest.setText("test");
        assertFalse(usernamePostRequest.equals(null));
    }
    @Test
    @Tag("invalid")
    public void equalsDifferentClassObject() {
        UsernamePostRequest usernamePostRequest = new UsernamePostRequest();
        usernamePostRequest.setText("test");
        Object differentClassObject = new Object();
        assertFalse(usernamePostRequest.equals(differentClassObject));
    }
    @Test
    @Tag("invalid")
    public void equalsDifferentTextValue() {
        UsernamePostRequest usernamePostRequest1 = new UsernamePostRequest();
        usernamePostRequest1.setText("test1");
        UsernamePostRequest usernamePostRequest2 = new UsernamePostRequest();
        usernamePostRequest2.setText("test2");
        assertFalse(usernamePostRequest1.equals(usernamePostRequest2));
    }
    @Test
    @Tag("valid")
    public void equalsSameTextValue() {
        UsernamePostRequest usernamePostRequest1 = new UsernamePostRequest();
        usernamePostRequest1.setText("test");
        UsernamePostRequest usernamePostRequest2 = new UsernamePostRequest();
        usernamePostRequest2.setText("test");
        assertTrue(usernamePostRequest1.equals(usernamePostRequest2));
    }
}