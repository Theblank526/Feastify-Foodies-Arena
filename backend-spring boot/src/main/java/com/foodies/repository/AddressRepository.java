package com.foodies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodies.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
