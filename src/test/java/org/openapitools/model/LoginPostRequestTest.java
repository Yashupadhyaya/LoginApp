package org.openapitools.model;

import org.junit.jupiter.api;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util;
import javax.annotation.Generated;

public class LoginPostRequestTest {

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */public void testValidUsernameAndPassword() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "validUser";
		loginRequest.password = "Valid123";
		boolean result = loginRequest.validateLogin();
		assertTrue(result, "Expected true for valid username and password");
	}

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */@Tag("invalid")
	public void testUsernameLengthLessThanSix() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "user";
		loginRequest.password = "Valid123";
		boolean result = loginRequest.validateLogin();
		assertFalse(result, "Expected false for username length less than 6");
	}

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */@Tag("invalid")
	public void testPasswordLengthLessThanSix() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "validUser";
		loginRequest.password = "Valid";
		boolean result = loginRequest.validateLogin();
		assertFalse(result, "Expected false for password length less than 6");
	}

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */@Tag("invalid")
	public void testPasswordWithoutLetters() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "validUser";
		loginRequest.password = "123456";
		boolean result = loginRequest.validateLogin();
		assertFalse(result, "Expected false for password without letters");
	}

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */@Tag("invalid")
	public void testPasswordWithoutDigits() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "validUser";
		loginRequest.password = "ValidPassword";
		boolean result = loginRequest.validateLogin();
		assertFalse(result, "Expected false for password without digits");
	}

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */@Tag("invalid")
	public void testBothUsernameAndPasswordLessThanSix() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "user";
		loginRequest.password = "Valid";
		boolean result = loginRequest.validateLogin();
		assertFalse(result, "Expected false for both username and password less than 6");
	}

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */@Tag("invalid")
	public void testEmptyUsername() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "";
		loginRequest.password = "Valid123";
		boolean result = loginRequest.validateLogin();
		assertFalse(result, "Expected false for empty username");
	}

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */@Tag("invalid")
	public void testEmptyPassword() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "validUser";
		loginRequest.password = "";
		boolean result = loginRequest.validateLogin();
		assertFalse(result, "Expected false for empty password");
	}

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */@Tag("invalid")
	public void testBothUsernameAndPasswordEmpty() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "";
		loginRequest.password = "";
		boolean result = loginRequest.validateLogin();
		assertFalse(result, "Expected false for both username and password empty");
	}

	/*
	 * ROOST_METHOD_HASH=validateLogin_3d7d711c2c
	 * ROOST_METHOD_SIG_HASH=validateLogin_9b1f104de3
	 *
	 */@Tag("valid")
	public void testUsernameWithSpecialCharacters() {
		LoginPostRequest loginRequest = new LoginPostRequest();
		loginRequest.username = "valid_User#123";
		loginRequest.password = "Valid123";
		boolean result = loginRequest.validateLogin();
		assertTrue(result, "Expected true for username with special characters");
	}

}