package com.bernald.infile.test.server.rest;


import com.bernald.infile.test.server.auth.AuthenticationService;
import com.bernald.infile.test.server.config.JwtService;
import com.bernald.infile.test.server.dto.UsuarioDto;
import com.bernald.infile.test.server.entity.LoginResponse;
import com.bernald.infile.test.server.entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final JwtService jwtService;

    private final AuthenticationService authenticationService;

    public AuthenticationController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Usuario> register(@RequestBody UsuarioDto registerUserDto) {
        Usuario registeredUser = authenticationService.signup(registerUserDto);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody UsuarioDto loginUserDto) {
        Usuario authenticatedUser = authenticationService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse()
                .setToken(jwtToken)
                .setExpiresIn(jwtService.getExpirationTime())
                .setId(authenticatedUser.getId());

        return ResponseEntity.ok(loginResponse);
    }
}