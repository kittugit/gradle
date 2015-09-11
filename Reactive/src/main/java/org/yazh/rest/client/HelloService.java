package org.yazh.rest.client;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;
import rx.Observable;

public interface HelloService {
//	
//	@GET("/hello/")
//	  String sayHello();
	
//	@POST("/hello")
//	Call<Name> sayName(@Body Name name);
	
	@POST("/hello")
	Observable<Name> sayRxName(@Body Name name);

}
