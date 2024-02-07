package com.example.springfoundation.repo;

import com.example.springfoundation.entity.TestObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestObjectRepository extends JpaRepository<TestObject, Integer> {
}
