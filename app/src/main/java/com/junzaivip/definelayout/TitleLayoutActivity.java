package com.junzaivip.definelayout;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by shihuijun on 2017-2-21.
 * 欢迎关注微信公众号: 史慧君
 */

public class TitleLayoutActivity extends LinearLayout {

    public TitleLayoutActivity(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);

        Button titleBack = (Button)findViewById(R.id.title_back);
        Button titleEdit = (Button) findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });

        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Edit Button",
                        Toast.LENGTH_SHORT).show();
                //Toast.LENGTH_SHORT 表示显示2秒
            }
        });

    }
}
