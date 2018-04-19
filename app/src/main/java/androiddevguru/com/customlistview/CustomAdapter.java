package androiddevguru.com.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by John wick on 4/19/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    private Context context;
    private Integer[] countryFlag;
    private String[] countryName;

    public CustomAdapter(Context context, Integer[] countryFlag, String[] countryName) {
        super(context, 0);
        this.context = context;
        this.countryFlag = countryFlag;
        this.countryName = countryName;
    }

    @Override
    public int getCount() {
        return countryName.length;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custom_row,parent,false);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        final TextView textView = (TextView) convertView.findViewById(R.id.textView);

        imageView.setImageResource(countryFlag[position]);
        textView.setText(countryName[position]);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, countryName[position]+" is Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        return  convertView;
    }
}
