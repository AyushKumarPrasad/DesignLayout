package enterprises.craftagro.kumar.ayush.testingrough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
 /*   private EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11;
    private Button submitbutton;
    private Spinner spin1, spin2, spin3 ,spin4 ,spin5 ;   */

    ListView lvPeople;
    AdapterListView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPeople= (ListView) findViewById(R.id.lvPeople);
        ObjectPeople person;
        ArrayList<ObjectPeople> arrPeople=new ArrayList<>();
        for (int i=0;i<50;i++){
            person=new ObjectPeople();
            person.setName("Name "+i);
            person.setShowName(false);
            arrPeople.add(person);
        }
        adapter=new AdapterListView(this,R.layout.item_listview,arrPeople);
        lvPeople.setAdapter(adapter);

/*        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.phone);
        e3 = (EditText) findViewById(R.id.address);
        e4 = (EditText) findViewById(R.id.editText1);
        e5 = (EditText) findViewById(R.id.editText2);
        e6 = (EditText) findViewById(R.id.editText3);
        e7 = (EditText) findViewById(R.id.editText4);
        e8 = (EditText) findViewById(R.id.editText5);
        e9 = (EditText) findViewById(R.id.editText6);
        e10 = (EditText) findViewById(R.id.editText7);
        e11 = (EditText) findViewById(R.id.editText8);

        submitbutton = (Button) findViewById(R.id.submit);

        spin1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.Vegetables, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter1);

        spin2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Vegetables, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter2);

        spin3 = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.Vegetables, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(adapter3);

        spin4 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.Vegetables, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin4.setAdapter(adapter4);

        spin5 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.Vegetables, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin5.setAdapter(adapter5);

        e5.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                e6.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                e5.setVisibility(View.INVISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        submitbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                boolean error = false;

                String st = spin1.getSelectedItem().toString();
                int pos = spin1.getSelectedItemPosition();
                if(pos!=0)
                {
                    //   pol_type = spin1.getSelectedItem().toString();
                }
                else
                    {
                    Toast.makeText(MainActivity.this,
                            "Subscription", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!st.equals("Subscription"))
                {
                    //   pol_type = spin1.getSelectedItem().toString();
                }
                else
                    {
                    Toast.makeText(MainActivity.this,
                            "Subscription", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                if(e4.getText().toString().isEmpty())
                {
                    error = true;
                    e4.setError("Quantity 1");
                }

                if(e8.getText().toString().isEmpty())
                {
                    error = true;
                    e8.setError("Repetition 1");
                }



                String st1 = spin2.getSelectedItem().toString();
                int pos1 = spin2.getSelectedItemPosition();
                if(pos1!=0)
                {

                }
                else
                    {
                    Toast.makeText(MainActivity.this,
                            "Vegetable 1", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!st1.equals("Vegetable 1"))
                {

                }
                else
                    {
                    Toast.makeText(MainActivity.this,
                            "Vegetable 1", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                if(e4.isSelected() && e8.isSelected())
                {
                    e5.setVisibility(View.INVISIBLE);
                    e9.setVisibility(View.INVISIBLE);
                }

                if (!error)
                {
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
                }

                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");
                e6.setText("");
                e7.setText("");
                e8.setText("");
                e9.setText("");
                e10.setText("");
                e11.setText("");
            }
        });  */

    }
}
