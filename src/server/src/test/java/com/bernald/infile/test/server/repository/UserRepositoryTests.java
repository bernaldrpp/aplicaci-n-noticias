package com.bernald.infile.test.server.repository;

import com.bernald.infile.test.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;
}
