package com.cgl.userservice.config;

import com.cgl.userservice.data.entities.User;
import com.cgl.userservice.data.enums.Role;
import com.cgl.userservice.data.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DataInitializerTest {
    @Mock
    private UserRepository userRepository;
    @Mock
    private PasswordEncoder passwordEncoder;
    @InjectMocks
    private DataInitializer dataInitializer;
    @Value("${application.default.user.password}")
    private String defaultPassword;
    @Test
    void initializeData() {
//        String password = defaultPassword;
//       assertEquals("tima04", password);

    }
}