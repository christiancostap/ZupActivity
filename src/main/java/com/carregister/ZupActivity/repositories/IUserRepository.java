package com.carregister.ZupActivity.repositories;

import com.carregister.ZupActivity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {}
