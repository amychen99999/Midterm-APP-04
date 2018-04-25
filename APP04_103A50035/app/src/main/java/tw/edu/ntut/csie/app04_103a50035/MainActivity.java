package tw.edu.ntut.csie.app04_103a50035;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTxtResult;
    private Button mBtnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtResult = (TextView) findViewById(R.id.textStudents);
        ListView listView = (ListView)findViewById(R.id.listStudent);
        listView.setOnItemClickListener(listViewOnItemClick);
        mBtnOK = (Button) findViewById(R.id.buttonClear);
        mBtnOK.setOnClickListener(btnOKOnClick);
    }
    private AdapterView.OnItemClickListener listViewOnItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view,
                                int position, long id) {
            String res = mTxtResult.getText().toString();
            res += ((TextView) view).getText() + ",";
            // 在TextView元件中顯示使用者點選的項目名稱。
            mTxtResult.setText(res);
        }
    };

    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mTxtResult.setText("");
        }
    };
}
