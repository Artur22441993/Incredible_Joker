package com.iinncerredible.jjookker.irepc;

import android.view.View;

import androidx.constraintlayout.widget.Group;

import java.util.Random;

public class SetImg {

    public static  void setImg(Group group , MainActivity mainActivity){
        int viewGroup = 0;
        int groupView [] = group.getReferencedIds();
        for (int i = 0; i<groupView.length; i++) {
            viewGroup = groupView[i];
            View view = mainActivity.findViewById(viewGroup);
            Random random = new Random();
            int a =  random.nextInt(4);
            if (a == 0){
                view.setBackgroundResource(R.drawable.ic_slot_1);
            }
            if (a == 1){
                view.setBackgroundResource(R.drawable.ic_slot_2);
            }
            if (a == 2){
                view.setBackgroundResource(R.drawable.ic_slot_3);
            }
            if (a == 3) {
                view.setBackgroundResource(R.drawable.ic_slot_4);
            }
        }
    }
}
