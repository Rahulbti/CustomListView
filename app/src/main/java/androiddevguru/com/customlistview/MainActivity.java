package androiddevguru.com.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Integer[] flagimages = {R.mipmap.argentina, R.mipmap.australia, R.mipmap.bangladesh, R.mipmap.belgium, R.mipmap.brazil,
    R.mipmap.canada, R.mipmap.china, R.mipmap.denmark, R.mipmap.egypt, R.mipmap.france,R.mipmap.germany,R.mipmap.greece,R.mipmap.hungary,
    R.mipmap.india,R.mipmap.italy,R.mipmap.japan};

    private String[] countryName = {"Argentina","Australia","Bangladesh","Belgium","Brazil","Canada","Denmark","Egypt","France","Germany",
    "Greece","Hungary","India","Italy","Japan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.listView);
        final CustomAdapter adapter = new CustomAdapter(MainActivity.this, flagimages,countryName);
        listView.setAdapter(adapter);

    }
}
