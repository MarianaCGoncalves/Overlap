package com.example.overlapandroidstudio;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TagListAdapter extends BaseAdapter {

    Context context;
    protected ArrayList<Tag> Tags;


    public TagListAdapter(Context context, ArrayList<Tag> tags)
    {
        this.context = context;
        this.Tags = tags;
    }

    @Override
    public int getCount() {
        return Tags.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {

        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.tag_list_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.itemName);
            //viewHolder.txtVersion = (TextView) convertView.findViewById(R.id.itemState);
            //viewHolder.icon = (ImageView) convertView.findViewById(R.id.itemIcon);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.txtName.setText(Tags.get(position).getTagName());
        //viewHolder.txtVersion.setText(""+numbers[position]);
        //viewHolder.icon.setImageResource(images[position]);

        return convertView;
    }

    private static class ViewHolder {

        TextView txtName;
        TextView txtVersion;
        //ImageView icon;

    }
}

