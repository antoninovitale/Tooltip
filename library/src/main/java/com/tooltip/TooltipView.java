package com.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.StyleRes;
import android.support.v4.widget.TextViewCompat;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Viнt@rь on 26.05.2016
 */
class TooltipView extends FrameLayout {
    private TextView mTextView;

    public TooltipView(Context context) {
        this(context, null);
    }

    public TooltipView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TooltipView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mTextView = new TextView(context, attrs, defStyleAttr);
        addView(mTextView);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void setBackground(Drawable background) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            super.setBackground(background);
        } else {
            super.setBackgroundDrawable(background);
        }
    }

    public void setText(String text) {
        mTextView.setText(text);
    }

    public void setTextSize(float size) {
        mTextView.setTextSize(size);
    }

    public void setTextColor(ColorStateList colors) {
        if (colors != null) {
            mTextView.setTextColor(colors);
        }
    }

    public void setTextGravity(int gravity) {
        mTextView.setGravity(gravity);
    }

    public void setTextAppearance(@StyleRes int resId) {
        TextViewCompat.setTextAppearance(mTextView, resId);
    }

    public void setTypeface(Typeface typeface, int resId) {
        mTextView.setTypeface(typeface, resId);
    }
}
