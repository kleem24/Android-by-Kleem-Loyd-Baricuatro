package com.example.listview3;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class ListView3MainActivity extends Activity {
	
	ListView lv;
	ArrayList<Student> list=new ArrayList<Student>();
	MyAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view3_main);
		
		lv=(ListView) this.findViewById(R.id.ListView1);
		list.add(new Student(R.drawable.img1,"Alpha, Bravo","BSIT"));
		list.add(new Student(R.drawable.img2,"Charlie, Hotel","BSOA"));
		list.add(new Student(R.drawable.img3,"Mike, India","BSCREAM"));
		list.add(new Student(R.drawable.img4,"November, Kilo","BSHRM"));
		list.add(new Student(R.drawable.img5,"Oscar, Quebec","BSE"));
		list.add(new Student(R.drawable.img6,"Zulu, Uniform","AB"));
		list.add(new Student(R.drawable.img7,"Delta, Tango","BSA"));
		list.add(new Student(R.drawable.img8,"Juliet, Sierra","BSBA"));

		adapter=new MyAdapter(this,list);
		this.lv.setAdapter(adapter);
		
	}

}
