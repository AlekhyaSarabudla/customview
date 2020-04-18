package com.example.cse225;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.AppCompatButton;

public class aa extends AppCompatButton {

    private static final String TAG = aa.class.getSimpleName();

    private Context context;
    private int iconSize;
    private Drawable icon;
    aa button=findViewById(R.id.custom_button);


    public aa(Context context) {
        super(context);
    }


    public aa(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public aa(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private void init(Context context){
        this.context = context;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


    public void setIconSize(@Px int iconSize) {
        if (iconSize < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }

        if (this.iconSize != iconSize) {
            this.iconSize = iconSize;

        }
    }

    public int getIconSize() {
        return iconSize;
    }

    public void setIcon(@Nullable Drawable icon) {
        if (this.icon != icon) {
            this.icon = icon;

        }

    }

    public Drawable getIcon() {
        return icon;
    }


}
