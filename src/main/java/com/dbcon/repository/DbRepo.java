package com.dbcon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbcon.entity.DbEntity;

public interface DbRepo extends JpaRepository<DbEntity, Long> {

}
