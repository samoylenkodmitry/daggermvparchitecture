package com.example.s.testdagger;

import dagger.Component;

@ActivityViewControllerScope
@Component(dependencies = MainComponent.class)
public interface PresenterForActivityComponent {
	
	void inject(ActivityViewController usage);
}
