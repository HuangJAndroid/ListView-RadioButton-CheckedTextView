package com.timliu.demolistview;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_view);
	}
	
	// ListView-ImageView��ѡ
	public void imageviewClicked(View view)
	{
		Intent mIntent = new Intent(this, ListviewImageViewActivity.class);
		startActivity(mIntent);
	}
	
	// ListView-CheckedTextView��ѡ"
	public void checkedTextViewClicked(View view)
	{
		Intent mIntent = new Intent(this, LisViewCheckedTextViewActivity.class);
		startActivity(mIntent);
	}

}
