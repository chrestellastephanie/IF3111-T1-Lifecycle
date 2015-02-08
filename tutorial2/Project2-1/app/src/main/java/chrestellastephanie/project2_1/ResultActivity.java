package chrestellastephanie.project2_1;

/**
 * Created by Chrestella Stephanie on 07/02/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;


public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String inputString = extras.getString("yourkey");
        TextView view = (TextView) findViewById(R.id.displayintentextra);
        view.setText(inputString);
    }

    @Override
    public void finish(){
        // TODO 1 create new Intent
        // Intent intent = new Intent();
        Intent i = new Intent();
        // TODO 2 read the data of the EditText field
        // with the id returnValue
        EditText editText= (EditText) findViewById(R.id.returnValue);
        // TODO 3 put the text from EditText
        // as String extra into the intent
        // use editText.getText().toString();
        String string = editText.getText().toString();
        i.putExtra("returnkey", string);

        // TODO 4 use setResult(RESULT_OK, intent);
        // to return the Intent to the application
        setResult(RESULT_OK, i);

        super.finish();
    }
}
