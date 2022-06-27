package com.technostart.vocation4u.repositories;

import com.technostart.vocation4u.models.Specialist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialistRepository extends CrudRepository <Specialist, Long> {
}
