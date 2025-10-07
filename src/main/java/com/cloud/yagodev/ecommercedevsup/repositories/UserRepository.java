package com.cloud.yagodev.ecommercedevsup.repositories;

import com.cloud.yagodev.ecommercedevsup.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
