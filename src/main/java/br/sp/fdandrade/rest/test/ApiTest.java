package br.sp.fdandrade.rest.test;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.junit.Test;

import br.sp.fdandrade.rest.core.BaseTest;

public class ApiTest extends BaseTest {

	@Test
	public void deveChamaApiEValidarOConteudoPesquisado() {

		given()
		.when()
			.get("/todos/1")
		.then()
			.statusCode(200)
			.body("id", Matchers.is(1))
			.body("title", Matchers.is("delectus aut autem"))
			.body("completed", Matchers.is(false))
		;

	}
	
	

}
