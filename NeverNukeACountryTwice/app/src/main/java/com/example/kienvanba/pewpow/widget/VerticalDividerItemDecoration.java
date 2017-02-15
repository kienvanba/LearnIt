package com.example.kienvanba.pewpow.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.kienvanba.pewpow.R;

/**
 * Created by kenji on 11/24/16.
 */

public class VerticalDividerItemDecoration extends RecyclerView.ItemDecoration {
    int resId = R.drawable.recyclerview_divider;

    private Drawable divider;
    private boolean isShow = true;

    public VerticalDividerItemDecoration(Context context, int resId){
        divider = ContextCompat.getDrawable(context, resId);
    }

    public VerticalDividerItemDecoration(Context context, boolean visibility) {
        divider = ContextCompat.getDrawable(context, resId);
        this.isShow = visibility;
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        if(isShow){
            int left = parent.getPaddingLeft();
            int right = parent.getWidth() - parent.getPaddingRight();

            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount-1; i++) {
                View child = parent.getChildAt(i);

                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

                int top = child.getBottom() + params.bottomMargin;
                int bottom = top + divider.getIntrinsicHeight();

                divider.setBounds(left, top, right, bottom);
                divider.draw(c);
            }
        }
    }
}
