package com.example.s.testdagger;

import android.app.Activity;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ToastMaker {
	
	private final Activity mActivity;
	
	@Inject
	ToastMaker(Activity activity) {
		mActivity = activity;
	}
	
	public void t(String text) {
		Toast.makeText(mActivity, text, Toast.LENGTH_SHORT).show();
	}
}
