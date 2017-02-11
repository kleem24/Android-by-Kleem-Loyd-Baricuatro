package com.example.revereintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView tv;
	Button btnGet;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.tv=(TextView) this.findViewById(R.id.textView1);
		this.btnGet=(Button) this.findViewById(R.id.button1);
		
	}
	
	public void getData(View v){
		Intent intent=new Intent(this,NextActivity.class);
		this.startActivityForResult(intent, 6);
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(resultCode==Activity.RESULT_OK){
			if(requestCode==6){
				Bundle b=data.getExtras();
				String message=b.getString("myname");
				this.tv.setText(message);
				
			}
			
		}
	}
}
