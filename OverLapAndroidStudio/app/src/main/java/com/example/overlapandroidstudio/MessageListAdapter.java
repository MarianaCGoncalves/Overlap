package com.example.overlapandroidstudio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageListAdapter  extends BaseAdapter {
    Context context;
    protected ArrayList<Message> Messages;


    public MessageListAdapter(Context context, ArrayList<Message> messages)
    {
        this.context = context;
        this.Messages = messages;
    }

    @Override
    public int getCount() {
        return Messages.size();
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

        MessageListAdapter.ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new MessageListAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.message_list_item, parent, false);
            viewHolder.message_poster = (TextView) convertView.findViewById(R.id._poster);
            viewHolder.message_date = (TextView) convertView.findViewById(R.id._date);
            viewHolder.message_body = (TextView) convertView.findViewById(R.id._body);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MessageListAdapter.ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.message_poster.setText(Messages.get(position).getMessageUserId());
        viewHolder.message_date.setText(""+Messages.get(position).getMessageDate());
        viewHolder.message_body.setText(Messages.get(position).getMessageText());

        return convertView;
    }

    private static class ViewHolder {

        TextView message_poster;
        TextView message_date;
        TextView message_body;

    }
}
