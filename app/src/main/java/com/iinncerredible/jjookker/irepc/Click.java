package com.iinncerredible.jjookker.irepc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.Group;

public class Click {

    private ImageView udga;
    private TextView hsad;
    private Group hhsaq;
    private MainActivity mainActivity;

    public Click(ImageView imageView, TextView textView, Group group, MainActivity mainActivity) {
        this.udga = imageView;
        this.hsad = textView;
        this.hhsaq = group;
        this.mainActivity = mainActivity;
    }

    public void click(){
        udga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 30; i++) {
                            int max = 800;
                            int min = 600;
                            max -= min;
                            int z = (int) (Math.random() * ++max) + min;
                            hsad.post(new Runnable() {
                                @Override
                                public void run() {
                                    hsad.setText("" + z);
                                    SetImg.setImg(hhsaq,mainActivity);
                                }

                            });

                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();


            }
        });

    }
}
