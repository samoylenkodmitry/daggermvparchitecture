package com.example.s.testdagger;

import org.junit.Assert;
import org.junit.Test;

public class PresenterTest {
	
	
	@Test
	public void test_behavior_on_attach() throws Exception {
		testWin();
		testLoose();
		testToast();
	}
	
	private void testToast() {
		//prepare
		PresenterDeps deps = new PresenterDeps();
		final String[] t = new String[1];
		deps.mToastMaker = new ToastMaker(null){
			
			@Override
			public void t(final String text) {
				t[0]=text;
			}
		};
		deps.mRandomModel = new RandomModel(){
			
			@Override
			public int getRandomNumberFromModel() {
				return 1;
			}
		};
		
		Presenter presenter = new Presenter(deps);
		final boolean[]win = new boolean[1];
		final PresentableView view = new PresentableView() {
			
			@Override
			public void showYouWin() {
				win[0]=true;
			}
			
			@Override
			public void showYouLoose() {
				
				win[0]=false;
			}
		};
		
		//action
		//...
		presenter.attach(view);
		
		
		//assert
		Assert.assertEquals("toast must be invoked",t[0], "hello my friend!");
	}
	private void testLoose() {
		//prepare
		PresenterDeps deps = new PresenterDeps();
		deps.mToastMaker = new ToastMaker(null){
			
			@Override
			public void t(final String text) {
			}
		};
		deps.mRandomModel = new RandomModel(){
			
			@Override
			public int getRandomNumberFromModel() {
				return 1;
			}
		};
		
		Presenter presenter = new Presenter(deps);
		final boolean[]win = new boolean[1];
		final PresentableView view = new PresentableView() {
			
			@Override
			public void showYouWin() {
				win[0]=true;
			}
			
			@Override
			public void showYouLoose() {
				
				win[0]=false;
			}
		};
		
		//action
		//...
		presenter.attach(view);
		
		
		//assert
		Assert.assertEquals("must be win",win[0], false);
	}
	
	private void testWin() {
		//prepare
		PresenterDeps deps = new PresenterDeps();
		deps.mToastMaker = new ToastMaker(null){
			
			@Override
			public void t(final String text) {
			}
		};
		deps.mRandomModel = new RandomModel(){
			
			@Override
			public int getRandomNumberFromModel() {
				return 0;
			}
		};
		
		Presenter presenter = new Presenter(deps);
		final boolean[]win = new boolean[1];
		final PresentableView view = new PresentableView() {
			
			@Override
			public void showYouWin() {
				win[0]=true;
			}
			
			@Override
			public void showYouLoose() {
				
				win[0]=false;
			}
		};
		
		//action
		//...
		presenter.attach(view);
		
		
		//assert
		Assert.assertEquals("must be win",win[0], true);
	}
	
	
}