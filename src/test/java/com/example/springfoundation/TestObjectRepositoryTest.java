package com.example.springfoundation;

import com.example.springfoundation.entity.TestObject;
import com.example.springfoundation.repo.TestObjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestObjectRepositoryTest {

    @Autowired
    private TestObjectRepository testObjectRepository;

    @Test
    void checkJpaSave() {
        // given
        TestObject testObject = new TestObject();
        testObject.setTestValue("TEST is it");

        // when
        TestObject savedTestObject = testObjectRepository.save(testObject);

        // then
        assertNotNull(savedTestObject.getId());
    }
}
