package estudos.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView list_item;
    private String[] itens = {
       "Maceio","Marechal","Paulo Jacinto"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_item = findViewById(R.id.list_listViewId);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );
        list_item.setAdapter(adapter);

        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position = i;
                String valorClicado = list_item.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),valorClicado ,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
