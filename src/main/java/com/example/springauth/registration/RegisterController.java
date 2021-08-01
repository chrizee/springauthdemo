package com.example.springauth.registration;

import ch.qos.logback.core.Context;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/register")
@AllArgsConstructor
public class RegisterController {

    private final RegistrationService registrationService;

    @PostMapping
    public String Register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirmToken(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}
