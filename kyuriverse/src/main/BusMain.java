package main;

import frame.FrameBase;
import frame.FrameBegin;
import frame.FrameMyPage;


public class BusMain {

	public static void main(String[] args) {
		FrameBase.getInstance(new FrameBegin());
		//FrameBase.getInstance(new FrameMyPage());

	}

}
