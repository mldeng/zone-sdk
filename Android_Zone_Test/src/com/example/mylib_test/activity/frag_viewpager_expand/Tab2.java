package com.example.mylib_test.activity.frag_viewpager_expand;

import com.example.mylib_test.R;

import and.abstractclass.Fragment_Lazy;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab2 extends Fragment_Lazy {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.tab2, null);
	}

	@Override
	protected void onVisible() {
		System.err.println("¿É¼ûÁË");
	}
	@Override
	protected void onInvisible() {
		System.err.println("²»£¡");
	}
}