package training.sati.com.training01.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import training.sati.com.training01.R;
import training.sati.com.training01.dao.Contacts;

/**
 * Created by Dilip Kumar on 2016-10-08.
 */
public class ContactAdapter extends BaseAdapter {
    List<Contacts> li;
    ListView list;
    List<Contacts> liSearchResults;
    private Context context;

    public ContactAdapter(Context context,List<Contacts> li){
        this.context = context;
        this.li = li;
        liSearchResults = new ArrayList<Contacts>();
        liSearchResults.addAll(li); // search
    }

    @Override
    public int getCount() {
        if(li == null)
            return 0;
        else
            return li.size();
    }

    @Override
    public Object getItem(int position) {
        return li.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void setItemList(List<Contacts> li) { this.li = li; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Contacts contacts = li.get(position);

        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.layout_5_lv_item, parent,false);
        }

        TextView tvName = (TextView)convertView.findViewById(R.id.tv_layout_5_lv_item_name);
        TextView tvNumber = (TextView)convertView.findViewById(R.id.tv_layout_5_lv_item_number);

        tvName.setText(contacts.getName());
        tvNumber.setText(contacts.getNumber());
        return convertView;
    }

    private static class ViewHolder {
        protected TextView itemName;
    }

    public void filter(String charText) {

        charText = charText.toLowerCase(Locale.getDefault());

        li.clear();
        if (charText.length() == 0) {
            li.addAll(liSearchResults);

        } else {
            for (Contacts contact : liSearchResults) {
                if (charText.length() != 0 && contact.getName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    li.add(contact);
                }
//                else if (charText.length() != 0 && contact.getName().toLowerCase(Locale.getDefault()).contains(charText)) {
//                    li.add(contact);
//                }
            }
        }
        notifyDataSetChanged();
    }

}
