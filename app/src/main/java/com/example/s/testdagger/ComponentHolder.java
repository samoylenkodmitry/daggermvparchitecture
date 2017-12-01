package com.example.s.testdagger;

import android.app.Activity;

public enum ComponentHolder {
	INSTANCE;
	
	public MainComponent mMainComponent;
	
	public void initDagger(Activity activity) {
		mMainComponent = DaggerMainComponent.builder()
			.activityModule(new ActivityModule(activity))
			.build();
	}
}
