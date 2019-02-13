package temple.edu;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {

    Context c;
    ArrayList<String> al;

    public ColorAdapter(Context c, ArrayList<String> al){
        this.c = c;
        this.al = al;
    }
    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int position) {
        return al.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textview;
        if(convertView instanceof TextView){
            textview = (TextView) convertView;
        }
        else{
            textview = new TextView(c);
        }
        textview.setText(String.valueOf(getItem(position)));
        textview.setBackgroundColor(Color.parseColor(getItem(position).toString()));
        return textview;
    }
}
