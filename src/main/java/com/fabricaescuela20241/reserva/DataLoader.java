package com.fabricaescuela20241.reserva;

import com.fabricaescuela20241.reserva.User.Role;
import com.fabricaescuela20241.reserva.User.User;
import com.fabricaescuela20241.reserva.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.findByUsername("admin").isEmpty()) {
            User admin = User.builder()
                    .username("admin")
                    .password(passwordEncoder.encode("adminpassword"))
                    .firstname("Admin")
                    .lastname("User")
                    .country("Country")
                    .role(Role.ROLE_ADMIN)
                    .build();
            userRepository.save(admin);
        }

        if (userRepository.findByUsername("user").isEmpty()) {
            User user = User.builder()
                    .username("user")
                    .password(passwordEncoder.encode("userpassword"))
                    .firstname("Normal")
                    .lastname("User")
                    .country("Country")
                    .role(Role.ROLE_USER)
                    .build();
            userRepository.save(user);
        }
    }
}
