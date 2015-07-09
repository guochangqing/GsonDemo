package com.mktech.json;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Gson gson = new Gson();

		/**
		 * 将给定的 JSON 字符串转换成指定的类型对象
		 */
		String json = "{\"name\":\"Tom\",\"age\":90}";
		Person person = gson.fromJson(json, Person.class);
		Log.i("GSON", "name--->>>"+person.getName());
		Log.e("GSON", person.toString());

		/**
		 * 将给定的目标对象转换成 JSON 格式的字符串
		 */
		String json_Person = gson.toJson(person);
		Log.e("GSON", json_Person);

		/**
		 * 将给定的集合对象转换成 JSON 格式的字符串
		 */
		ArrayList<Person> persons = new ArrayList<Person>();
		Collections.addAll(persons, new Person("tom", 10),
				new Person("jon", 20));
		String json_list = gson.toJson(persons);
		Log.e("GSON", json_list);

		/**
		 * 将给定的 JSON 格式字符串转换为带泛型的集合对象
		 */
		List<Person> retList = gson.fromJson(json_list,
				new TypeToken<List<Person>>() {
				}.getType());
		for (Person p : retList) {
			Log.e("GSON", p.toString());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
