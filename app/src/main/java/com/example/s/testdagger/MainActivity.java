package com.example.s.testdagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	private ActivityViewController mViewController;
	
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final View view = getLayoutInflater().inflate(R.layout.activity_main, null, false);
		setContentView(view);
		
		ComponentHolder.INSTANCE.initDagger(this);
		
		mViewController = new ActivityViewController(view);
		mViewController.onCreate();
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		mViewController.start();
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		mViewController.stop();
	}
	
}
