package com.example.overlapandroidstudio;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NotifListAdapter extends BaseAdapter {

    Context context;
    private final String [] notifdates;
    private final String [] notiftexts;


    public NotifListAdapter(Context context, String [] notifdates, String [] notiftexts)
    {
        this.context = context;
        this.notifdates = notifdates;
        this.notiftexts = notiftexts;
    }

    @Override
    public int getCount() {
        return notifdates.length;
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
            convertView = inflater.inflate(R.layout.notification_list_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.notificationdate);
            viewHolder.txtVersion = (TextView) convertView.findViewById(R.id.notificationbody);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.txtName.setText(notifdates[position]);
        viewHolder.txtVersion.setText(notiftexts[position]);

        return convertView;
    }

    private static class ViewHolder {
        TextView txtName;
        TextView txtVersion;
    }
}

