package com.example.demo.test

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayNameGeneration
import org.junit.jupiter.api.DisplayNameGenerator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource


@DisplayNameGeneration(DisplayNameGenerator.Standard::class)
class TestInstanceTest {

  @Test
  fun test_case0() {
    println("TestCase0")
  }

  @Test
  fun test_case1() {
    println("TestCase1")
  }


  fun provideTestObject(): List<TestObject> {
    return listOf(TestObject(5, 10))
  }
}

data class TestObject(
    val value1: Int,
    val value2: Int
)