package br.com.erudio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.erudio.model.Person;
import br.com.erudio.service.IPersonService;
import br.com.erudio.service.PersonService;

public class PersonServiceTest {

    Person person;
    IPersonService service;
    
    @BeforeEach
    void setup() {
        person = new Person(
                "Keith",
                "Moon",
                "Wembley - UK",
                "Male",
                "kmoon@erudio.com.br"
            );
         service = new PersonService();
    }
    
    @DisplayName("When Create a Person with Success Should Return a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject() {
        
        // Given / Arrange
        IPersonService service = new PersonService();
        
        // When / Act
        Person actual = service.createPerson(person);
        
        // Then / Assert
        assertNotNull(actual, () -> "The createPerson() should not have returned null!");
    }
    
    @DisplayName("When Create a Person with Success Should Contains FirstName in Returned Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsFirstNameInReturnedPersonObject() {
        
        // Given / Arrange
        IPersonService service = new PersonService();
        
        // When / Act
        Person actual = service.createPerson(person);
        
        // Then / Assert
        assertEquals(
                person.getFirstName(),
                actual.getFirstName(),
                () -> "The Person FistName is Incorrect!");
    }

    @DisplayName("When Create a Person with Success Should Contains All Attributes in Returned Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsAllAttributesInReturnedPersonObject() {

        // Given / Arrange
        IPersonService service = new PersonService();

        // When / Act
        Person actual = service.createPerson(person);

        // Then / Assert
        assertNotNull(
                person.getId(),
                () -> "The Person ID should not be null!");
        assertEquals(
                person.getFirstName(),
                actual.getFirstName(),
                () -> "The Person FistName is Incorrect!");
        assertEquals(
                person.getLastName(),
                actual.getLastName(),
                () -> "The Person LastName is Incorrect!");
        assertEquals(
                person.getAddress(),
                actual.getAddress(),
                () -> "The Person Address is Incorrect!");
        assertEquals(
                person.getGender(),
                actual.getGender(),
                () -> "The Person Gender is Incorrect!");
        assertEquals(
                person.getEmail(),
                actual.getEmail(),
                () -> "The Person Email is Incorrect!");
    }

    @DisplayName("When Create a Person with null email Should throw exception")
    @Test
    void testCreatePerson_WithNullEmail_ShouldThrowIllegalArgumentException() {
        // Given / Arrange
        person.setEmail(null);

        // When / Act
        // Then - Assert
        var msgException = assertThrows(
                IllegalArgumentException.class,
                () -> service.createPerson(person),
                () -> "Empty e-Mail should have cause an IllegalArgumentException").getMessage();

        assertEquals(
                "The person email is null or blank!",
                msgException,
                () -> "Exception error message is incorrect");
    }
}