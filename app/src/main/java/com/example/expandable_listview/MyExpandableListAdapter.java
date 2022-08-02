package com.example.expandable_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyExpandableListAdapter extends BaseExpandableListAdapter {
    private Context context;

    public MyExpandableListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return 3;
    }

    @Override
    public int getChildrenCount(int i) {
        return 3;
    }

    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public Object getChild(int i, int i1) {
        return null;
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.listview_groupview, null);
        }

        switch (i)
        {
            case 0:{
                ((TextView)view.findViewById(R.id.question)).setText("Group 1");
            }break;
            case 1:{
                ((TextView)view.findViewById(R.id.question)).setText("Group 2");
            }break;
            case 2:{
                ((TextView)view.findViewById(R.id.question)).setText("Group 3");
        }break;
        }

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.listview_groupview_childview, null);

        switch (i)
        {
            case 0:
            {
                switch (i1)
                {
                    case 0:
                    {
                        ((TextView)view.findViewById(R.id.answer)).setText("Group 1 child 1");
                    }break;
                    case 1:
                    {
                        ((TextView)view.findViewById(R.id.answer)).setText("Group 1 child 2");
                    }break;
                    case 2:
                    {
                        ((TextView)view.findViewById(R.id.answer)).setText("Group 1 child 3");
                    }break;
                }
            }break;
            case 1:
            {
                switch (i1)
                {
                    case 0:
                    {
                        ((TextView)view.findViewById(R.id.answer)).setText("Group 2 child 1");
                    }break;
                    case 1:
                    {
                        ((TextView)view.findViewById(R.id.answer)).setText("Group 2 child 2");
                    }break;
                    case 2:
                    {
                        ((TextView)view.findViewById(R.id.answer)).setText("Group 2 child 3");
                    }break;
                }
            }break;
            case 2:
            {
                switch (i1)
                {
                    case 0:
                    {
                        ((TextView)view.findViewById(R.id.answer)).setText("Group 3 child 1");
                    }break;
                    case 1:
                    {
                        ((TextView)view.findViewById(R.id.answer)).setText("Group 3 child 2");
                    }break;
                    case 2:
                    {
                        ((TextView)view.findViewById(R.id.answer)).setText("Group 3 child 3");
                    }break;
                }
            }break;
        }


        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
