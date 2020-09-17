package com.teamSquirrel.tribalsimulator;

import android.content.Context;
import android.view.SurfaceView;

public class gameView extends SurfaceView implements Runnable{

    private Thread thread;


    public gameView(Context context) {
        super(context);
    }

    @Override
    public void run() {

    }

    public void resume(){
        thread = new Thread(this);
        thread.start();
    }

    public void pause() {

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
