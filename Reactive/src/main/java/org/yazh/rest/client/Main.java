package org.yazh.rest.client;

import java.io.IOException;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Retrofit retrofit = new Retrofit.Builder()
	    .baseUrl("http://localhost:4567")
	    .addConverterFactory(GsonConverterFactory.create())
	    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
	    .build();
		HelloService service = retrofit.create(HelloService.class);
		Name name = new Name();
		name.setFName("Kittu");
		name.setLName("Damodaran");
//		Call<Name> sayName = service.sayName(name);
//		name = sayName.execute().body();
//		System.out.println(name);
		Observable<Name> sayRxName = service.sayRxName(name);
		sayRxName.subscribe(System.out::println);
		sayRxName.subscribe((nameResult) -> { System.out.println("First Name:" + nameResult.getFName());
		System.out.println("Last Name:" + nameResult.getLName());});
		
		
	

	}

}
