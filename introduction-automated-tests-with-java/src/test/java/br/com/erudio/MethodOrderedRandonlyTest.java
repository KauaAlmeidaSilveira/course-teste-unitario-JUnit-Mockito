package br.com.erudio;

import org.junit.jupiter.api.*;

@Order(1)
@TestMethodOrder(MethodOrderer.Random.class)
class MethodOrderedRandonlyTest {

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("testeA")
    @Test
    void testeA() {
        // Given - Arrange
        // When - Act
        // Then - Assert
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("testeB")
    @Test
    void testeB() {
        // Given - Arrange
        // When - Act
        // Then - Assert
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("testeC")
    @Test
    void testeC() {
        // Given - Arrange
        // When - Act
        // Then - Assert
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("testeD")
    @Test
    void testeD() {
        // Given - Arrange
        // When - Act
        // Then - Assert
    }

}
