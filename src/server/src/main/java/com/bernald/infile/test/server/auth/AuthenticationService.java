package com.bernald.infile.test.server.auth;

import com.bernald.infile.test.server.dto.UsuarioDto;
import com.bernald.infile.test.server.entity.Usuario;
import com.bernald.infile.test.server.repositories.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
            UserRepository userRepository,
            AuthenticationManager authenticationManager,
            PasswordEncoder passwordEncoder
    ) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario signup(UsuarioDto input) {
        Usuario user = new Usuario()
                .setUsuario(input.getUsuario())
                .setPass(passwordEncoder.encode(input.getPass()));

        return userRepository.save(user);
    }

    public Usuario authenticate(UsuarioDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getUsuario(),
                        input.getPass()
                )
        );

        return userRepository.findByUsuario(input.getUsuario())
                .orElseThrow();
    }
}
