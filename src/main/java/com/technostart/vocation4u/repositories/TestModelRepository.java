package com.technostart.vocation4u.repositories;

import com.technostart.vocation4u.models.TestModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestModelRepository extends CrudRepository<TestModel, Long> {
}
