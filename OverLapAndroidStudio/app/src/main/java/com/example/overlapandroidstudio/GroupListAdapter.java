package com.example.overlapandroidstudio;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GroupListAdapter extends BaseAdapter {

    Context context;
    protected ArrayList<Group> Groups;




    public GroupListAdapter(Context context, ArrayList<Group> groups)
    {
        this.context = context;
        this.Groups= groups;

    }

    @Override
    public int getCount() {
        return Groups.size();
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
            convertView = inflater.inflate(R.layout.group_list_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.gruName);
            viewHolder.txtDesc = (TextView) convertView.findViewById(R.id.gruDesc);
            viewHolder.txtNum = (TextView) convertView.findViewById(R.id.gruNum);
            viewHolder.txtAct = (TextView) convertView.findViewById(R.id.gruAct);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.txtName.setText(Groups.get(position).getGroupName());
        viewHolder.txtDesc.setText("description: " + Groups.get(position).getGroupDescription());
        viewHolder.txtNum.setText("Number of members " + Groups.get(position).getMembers().size());
        viewHolder.txtAct.setText("Active group?: " + Groups.get(position).isActivity());


        return convertView;
    }

    private static class ViewHolder {

        TextView txtName;
        TextView txtDesc;
        TextView txtNum;
        TextView txtAct;

    }
}