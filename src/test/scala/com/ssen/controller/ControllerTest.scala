package com.ssen.controller

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.is
import org.junit.jupiter.api.Test

@QuarkusTest
class ControllerTest{

    @Test
    def testHelloEndpoint(): Unit = {
        given()
          .`when`().get("/api/v1/")
          .`then`().statusCode(200)
          .body(`is`("Hello"))
    }
}