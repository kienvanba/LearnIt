package com.example.kienvanba.pewpow.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import static com.example.kienvanba.pewpow.utils.LogUtils.makeLogTag;

/**
 * Created by kienvanba on 2/14/17.
 */

public class BaseRecyclerAdapter extends RecyclerView.Adapter {

    private static final String TAG = makeLogTag(BaseRecyclerAdapter.class);

    protected Context mContext;
    protected List<IRecyclerItem> mItems;
    protected OnItemClickListener mListener;

    public BaseRecyclerAdapter(Context context, List<IRecyclerItem> items){
        this.mContext = context;
        this.mItems = items;
    }

    @Override
    public int getItemViewType(int position) {
        if(mItems.size()>0){
            return mItems.get(position).getItemViewType();
        }
        return -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems!=null?mItems.size():0;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mListener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}
