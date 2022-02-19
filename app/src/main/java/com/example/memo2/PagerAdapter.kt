package com.example.memo2

import android.view.LayoutInflater
import android.widget.ImageView
import androidx.annotation.NonNull

public class PagerAdapter() {
    private var context mContext;
    private ArrayList <Integer> imageList;

    public ViewPagerAdapter (Context context,ArrayList<Integer> imageList)
    {
        this.mContext = context;
        this.imageList = imageList;
    }

    @NonNull

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater =(LayoutInflater) mContext . getSystemService (Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater. inflate (R.layout.pagerview_layout, null);

        ImageView imageView = view. findViewById (R.id.imageView);
        imageView.setImageResource(imageList.get(position));

        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view == (View) o);
    }
}