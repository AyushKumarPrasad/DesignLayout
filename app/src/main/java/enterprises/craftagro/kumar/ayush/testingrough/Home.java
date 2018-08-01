package enterprises.craftagro.kumar.ayush.testingrough;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import enterprises.craftagro.kumar.ayush.testingrough.R;

public class Home extends AppCompatActivity
{
    private EditText editText;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setTitle("dev2qa.com - Enable / Disable Button By EditText Text Length.");

        // Get EditText component.
        editText = (EditText)findViewById(R.id.enable_disable_button_edit_text);

        // Get button component.
        button = (Button)findViewById(R.id.enable_disable_button);

        // Use TextWatcher to change button state by EditText text length.
        editText.addTextChangedListener(new TextWatcher() {

            // Before EditText text change.
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            // This method is invoked after user input text in EditText.
            @Override
            public void afterTextChanged(Editable editable) {
                processButtonByTextLength();
            }
        });


        // Listen to EditText key event to change button state and text accordingly.
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                // Get key action, up or down.
                int action = keyEvent.getAction();

                // Only process key up action, otherwise this listener will be triggered twice because of key down action.
                if(action == KeyEvent.ACTION_UP)
                {
                    processButtonByTextLength();
                }
                return false;
            }
        });

    }

    // Enable or disable and change button text by EditText text length.
    private void processButtonByTextLength()
    {
        String inputText = editText.getText().toString();
        if(inputText.length() > 10)
        {
            button.setText("I Am Enabled.");
            button.setEnabled(true);
        }else
        {
            button.setText("I Am Disabled.");
            button.setEnabled(false);
        }
    }
}