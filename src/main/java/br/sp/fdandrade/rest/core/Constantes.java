package br.sp.fdandrade.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {
	
	String APP_BASE_URL = "https://jsonplaceholder.typicode.com";
	Integer APP_PORT = 443;
	String APP_BASE_PATH = "";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	long MAX_TIMEOUT = 5000l;

}
