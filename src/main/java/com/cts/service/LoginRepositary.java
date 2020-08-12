package com.cts.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.modal.Login;

public interface LoginRepositary extends JpaRepository<Login,Long>{

}
