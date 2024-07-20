package com.apiexamplex.examplesx.repository;

import com.apiexamplex.examplesx.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}