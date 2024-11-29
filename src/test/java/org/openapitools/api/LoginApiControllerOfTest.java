

package org.openapitools.api;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openapitools.model.Job;
import org.junit.jupiter.api.*;
import org.openapitools.model.LoginPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

public class LoginApiControllerOfTest {
    @Test
    @Tag("valid")
    public void testJobCreationWithValidInputs() {
        // Arrange
        String jobName = "Test Job";
        int processingTime = 10;
        int deadline = 20;
        // Act
        Job actualJob = LoginApiController.of(jobName, processingTime, deadline);
        // Assert
        Assertions.assertNotNull(actualJob);
        Assertions.assertEquals(jobName, actualJob.jobName);
        Assertions.assertEquals(processingTime, actualJob.processingTime);
        Assertions.assertEquals(deadline, actualJob.deadline);
    }
    @Test
    @Tag("invalid")
    public void testJobCreationWithNullInputs() {
        // Arrange
        String jobName = null;
        int processingTime = 10;
        int deadline = 20;
        // Act and Assert
        Assertions.assertThrows(NullPointerException.class, () -> LoginApiController.of(jobName, processingTime, deadline));
    }
    @Test
    @Tag("invalid")
    public void testJobCreationWithNegativeInputs() {
        // Arrange
        String jobName = "Test Job";
        int processingTime = -10;
        int deadline = -20;
        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> LoginApiController.of(jobName, processingTime, deadline));
    }
}