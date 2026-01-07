package com.example.backend_app.reposiory;

import com.example.backend_app.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepo  extends JpaRepository<User, Long> {

}
