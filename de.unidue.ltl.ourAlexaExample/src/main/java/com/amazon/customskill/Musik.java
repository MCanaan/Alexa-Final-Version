package com.amazon.customskill;
import java.io.IOException;



import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

//die Methode für Musik "Titel und Künstlername holen und zurückgeben"
public class Musik {
	
	public String findTrack(String track) throws IOException, JSONException {
		
		String output="";
		
		OkHttpClient client = new OkHttpClient();
		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "api_key=90eb3e790c2f6bf688740348e5a8d66c&track=" + track + "&format=json");
		Request request = new Request.Builder()
			.url("http://ws.audioscrobbler.com/2.0/?method=track.search")
			.post(body)
			.addHeader("content-type", "application/json")
			.build();

		Response response = client.newCall(request).execute();
		
		String jsonData = response.body().string();
		JSONObject jobject = new JSONObject(jsonData);
		JSONObject results = (JSONObject)jobject.get("results"); //results
		JSONObject matches = (JSONObject) results.get("trackmatches"); //results
		JSONArray jarray = matches.getJSONArray("track");
		
		String artist = "";
		String name = "";
		if(jarray.length() >= 1 ) {
			JSONObject obj = (JSONObject) jarray.get(0);
			
			 name = obj.getString("name");
			
			 artist = obj.getString("artist");
			
			
			output = name + " von " + artist;
		}
		
		return output ;
	}
	
	
	public static void main(String[] args ) throws JSONException {
		
		Musik musik = new Musik();
		try {
			musik.findTrack("dance with me");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
