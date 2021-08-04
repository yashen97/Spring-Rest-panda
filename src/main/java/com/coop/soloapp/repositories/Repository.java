package com.coop.soloapp.repositories;

import com.coop.soloapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Employee,Long> {
}
