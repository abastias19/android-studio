import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends Activity {

    private ListView myListView;
    ArrayAdapter<String> myAdapter;
    EditText inputSearch;
    ArrayList<HashMap<String, String>> productList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (ListView) findViewById(R.id.editlist_view);
        inputSearch = (EditText) findViewById(R.id.itemSearch);
        myAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, razas);
        myListView.setAdapter(myAdapter);
        inputSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                MainActivity.this.myAdapter.getFilter().filter(cs);
            }
            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
            }
        });
    }
}
