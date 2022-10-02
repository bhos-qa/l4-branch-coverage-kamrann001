package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClassroom {

    Classroom classroom;

    @BeforeEach
    void setUp() {classroom = new Classroom(); }

    @Test
    @DisplayName("Name should be set")
    void testSetName() {
        assertEquals("Kamran", classroom.setName("Kamran"), "Any name should work");
    }

    @Test
    @DisplayName("Age should be set")
    void testSetAge() {
        assertEquals(22, classroom.setAge(22), "Any age should work");
    }


    @Test
    @DisplayName("Email should be set")
    void testSetEmail() {
        assertEquals("test@gmail.com", classroom.setEmail("test@gmail.com"), "Email set should work for any Email");
    }

    @Test
    @DisplayName("Classroom type should be set")
    void testSetClassroomType() {
        assertEquals(classroomType.MORNING, classroom.setClassoomType(classroomType.MORNING), "Clasroom type should be set for one of the two given types");
    }

    @Test
    @DisplayName("Address should be set")
    void testSetAddress() {
        assertEquals("Sabunchu, M.Ibrahimov", classroom.setAddress("Sabunchu, M.Ibrahimov"), "Any address should work");
    }
}