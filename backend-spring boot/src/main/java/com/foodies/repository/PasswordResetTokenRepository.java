package com.foodies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodies.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
