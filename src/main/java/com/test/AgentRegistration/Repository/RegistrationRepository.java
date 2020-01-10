package com.test.AgentRegistration.Repository;

import com.test.AgentRegistration.Entity.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<RegistrationForm,Long> {
}
