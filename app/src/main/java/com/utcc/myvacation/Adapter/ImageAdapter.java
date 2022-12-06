package com.utcc.myvacation.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.utcc.myvacation.R;

public class ImageAdapter extends BaseAdapter {
    public Integer[] mThumbIds = new Integer[8];
    private Context context;

    public ImageAdapter(Context context) {
        this.context = context;
        initMThumbIds();
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return mThumbIds;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(mThumbIds[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(300, 300));
        return imageView;
    }

    public void initMThumbIds() {
        mThumbIds[0] = R.drawable.pic1;
        mThumbIds[1] = R.drawable.pic2;
        mThumbIds[2] = R.drawable.pic3;
        mThumbIds[3] = R.drawable.pic4;
        mThumbIds[4] = R.drawable.pic5;
        mThumbIds[5] = R.drawable.pic6;
        mThumbIds[6] = R.drawable.pic7;
        mThumbIds[7] = R.drawable.pic8;
    }
}
