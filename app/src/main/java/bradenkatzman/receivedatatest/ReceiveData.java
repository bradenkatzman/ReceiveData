package bradenkatzman.receivedatatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ReceiveData extends AppCompatActivity {

    private String dataType = "text/plain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //make sure that an intent has been sent
        if (getIntent().getExtras() != null) {
            Intent intent = getIntent();
            String action = intent.getAction();
            String type = intent.getType();

            //make sure the data has been sent correctly
            if (Intent.ACTION_SEND.equals(action) && type == null) {
                if (dataType.equals(type)) {
                    
                }
            }

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_receive_data);
        }
        else {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_receive_data);
            Toast.makeText(this, "Data was not sent", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_receive_data, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
