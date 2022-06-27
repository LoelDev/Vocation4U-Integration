package com.technostart.vocation4u.repositories;

import com.technostart.vocation4u.models.Date;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DateRepository extends CrudRepository<Date, Long> {
    //public abstract ArrayList<Date> findBySpecialistId(Integer specialistId);

    public abstract ArrayList<Date> findByAvailable (String available);
}
