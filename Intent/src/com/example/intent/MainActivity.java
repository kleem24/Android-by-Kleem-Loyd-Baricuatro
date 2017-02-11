package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText txtMessage;
	Button btnOkey;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.txtMessage=(EditText) this.findViewById(R.id.editText1);
		this.btnOkey=(Button) this.findViewById(R.id.button1);
		
		
	}

	public void buttonAction(View v){
		String message=this.txtMessage.getText().toString();
		//Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		
		Intent intent=new Intent(this,NextActivity.class);
		
		intent.putExtra("myname", message);
		this.startActivity(intent);
	}

}
