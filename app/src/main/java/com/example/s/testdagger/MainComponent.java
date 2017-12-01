package com.example.s.testdagger;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = ActivityModule.class)
@Singleton
public interface MainComponent {
	
	DialogsController dialogsController();
	
	Activity activity();
	
	Navigator navigator();
	
	RandomModel randomModel();
	
	ToastMaker toastMaker();
	
	void inject(ComponentHolder usage);
}
