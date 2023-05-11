package ohm.softa.a08.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ohm.softa.a08.model.Meal;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class OpenMensaAPIService {
	private static OpenMensaAPIService instance;
	private static OpenMensaAPI mensaAPIinstance;

	private OpenMensaAPIService(){


	}
	public OpenMensaAPIService getInstance(){
		if(instance == null){
			instance = new OpenMensaAPIService();
		}
		return instance;
	}

	public OpenMensaAPI getApi(){
		if(mensaAPIinstance == null){

			HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
			loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

			OkHttpClient client = new OkHttpClient.Builder()
				.addInterceptor(loggingInterceptor)
				.build();

			Retrofit retrofit = new Retrofit.Builder()
				.addConverterFactory(GsonConverterFactory.create())
				.baseUrl("https://openmensa.org/api/v2/")
				.client(client)
				.build();

			mensaAPIinstance=  retrofit.create(OpenMensaAPI.class);
		}
		return mensaAPIinstance;

	}
}
