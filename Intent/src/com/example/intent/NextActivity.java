package com.example.intent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends Activity {
	
	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		this.setContentView(R.layout.nextview);
		
		this.tv=(TextView) this.findViewById(R.id.textView1);
		
		Bundle b=this.getIntent().getExtras();
			String message=b.getString("myname");
			
			this.tv.setText(message);
		
	}

}
