package enterprises.craftagro.kumar.ayush.testingrough;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Latitude on 02/10/2016.
 */

public class AdapterListView extends ArrayAdapter<ObjectPeople> {

    Context mContext;

    LayoutInflater inflater;

    ArrayList<ObjectPeople> arrayPeople;

    public AdapterListView(Context context, int resource, ArrayList<ObjectPeople> arraypeople) {

        super(context, resource);

        this.mContext = context;
        this.arrayPeople = arraypeople;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override

    public View getView(final int position, View convertView, ViewGroup parent) {

        final ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview, null);
            holder = new ViewHolder();
            holder.tvPosition = (TextView) convertView.findViewById(R.id.tvPosition);
            holder.edName = (EditText) convertView.findViewById(R.id.edName);
            holder.cbShowName = (CheckBox) convertView.findViewById(R.id.cbShowName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ObjectPeople person = arrayPeople.get(position);
        holder.tvPosition.setText("Item " + position);
        holder.cbShowName.setChecked(person.isShowName());

        if (person.isShowName()) {
            holder.edName.setVisibility(View.VISIBLE);
        } else {
            holder.edName.setVisibility(View.INVISIBLE);
        }
        //Using setOnclickListener not setOnCheckedChangeListener
        holder.cbShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.cbShowName.isChecked()) {
                    arrayPeople.get(position).setShowName(true);
                    holder.edName.setVisibility(View.VISIBLE);
                } else {
                    arrayPeople.get(position).setShowName(false);
                    holder.edName.setVisibility(View.INVISIBLE);
                    arrayPeople.get(position).setName("");

                }
            }
        });

//Fill EditText with the value you have in data source
        holder.edName.setText(person.getName());
        holder.edName.setId(position);

//we need to update adapter once we finish with editing
        holder.edName.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {

                if (!hasFocus) {
                    final int position = v.getId();
                    final EditText Caption = (EditText) v;
                    arrayPeople.get(position).setName(Caption.getText().toString());
                }

            }

        });

        return convertView;

    }

    @Override

    public int getCount() {

        return arrayPeople.size();

    }

    static class ViewHolder {
        TextView tvPosition;
        EditText edName;
        CheckBox cbShowName;
    }

}
