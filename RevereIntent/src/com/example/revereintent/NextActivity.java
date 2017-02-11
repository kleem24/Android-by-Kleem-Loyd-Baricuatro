package com.example.revereintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends Activity {
	
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		this.setContentView(R.layout.nextlayout);
		
		this.tv=(TextView) this.findViewById(R.id.textView1);
		
		Intent intent=new Intent();
		String txt=this.tv.getText().toString();
		intent.putExtra("myname", txt);
		this.setResult(Activity.RESULT_OK,intent);
	}

}
