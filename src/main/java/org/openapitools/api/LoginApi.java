/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.LoginPostRequest;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-27T18:23:55.118803+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
@Validated
@Tag(name = "login", description = "the login API")
public interface LoginApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /login : Send login request with username and password
     *
     * @param loginPostRequest  (required)
     * @return Successful operation (status code 200)
     *         or Bad request - username or password is empty (status code 400)
     *         or Unauthorized - Invalid username or password (status code 401)
     */
    @Operation(
        operationId = "loginPost",
        summary = "Send login request with username and password",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPostRequest.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request - username or password is empty", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPostRequest.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized - Invalid username or password", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPostRequest.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/login",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    // call the validateLogin method from the LoginPostRequest class for successful login
    default ResponseEntity<Map<String, String>> loginPost(
        @Parameter(name = "LoginPostRequest", description = "", required = true) @Valid @RequestBody LoginPostRequest loginPostRequest
    ) {
        Map<String, String> responseBody = new HashMap<>();
        // Validate login credentials
        if (loginPostRequest.validateLogin()) {
            // Successful login
            responseBody.put("status", "200");
            responseBody.put("message", "Login successful for user: " + loginPostRequest.getUsername());
            return ResponseEntity.ok(responseBody);
        } else {
            // Invalid credentials
            responseBody.put("status", "401");
            responseBody.put("message", "Invalid username or password");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseBody);
        }
    }
    

}
