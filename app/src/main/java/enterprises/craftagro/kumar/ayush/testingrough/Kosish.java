package enterprises.craftagro.kumar.ayush.testingrough;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kosish extends AppCompatActivity
{
    CheckBox check1, check2, check3, check4, check5, check6, check7, check8, check9;
    Button button;
    EditText clientname, clientphone, clientaddress,
            e1, e2,e3, e4, e5, e6, e7, e8, e9, e10,
            e11, e12, e13, e14, e15, e16, e17, e18 ;
    TextView t1, t2;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosish);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayoutayush);

        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText9);

        e3 = (EditText) findViewById(R.id.editText2);
        e4 = (EditText) findViewById(R.id.editText10);

        e5 = (EditText) findViewById(R.id.editText3);
        e6 = (EditText) findViewById(R.id.editText11);

        e7 = (EditText) findViewById(R.id.editText4);
        e8 = (EditText) findViewById(R.id.editText12);

        e9 = (EditText) findViewById(R.id.editText5);
        e10 = (EditText) findViewById(R.id.editText13);

        e11 = (EditText) findViewById(R.id.editText6);
        e12 = (EditText) findViewById(R.id.editText14);

        e13 = (EditText) findViewById(R.id.editText7);
        e14 = (EditText) findViewById(R.id.editText15);

        e15 = (EditText) findViewById(R.id.editText8);
        e16 = (EditText) findViewById(R.id.editText16);

        e17 = (EditText) findViewById(R.id.editText17);
        e18 = (EditText) findViewById(R.id.editText18);

        clientaddress = (EditText) findViewById(R.id.address);
        clientphone = (EditText) findViewById(R.id.phone);
        clientname = (EditText) findViewById(R.id.name);

        t1 = (TextView) findViewById(R.id.textView88);
        t2 = (TextView) findViewById(R.id.textView99);

        e1.setVisibility(View.INVISIBLE);
        e2.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
        e4.setVisibility(View.INVISIBLE);
        e5.setVisibility(View.INVISIBLE);
        e6.setVisibility(View.INVISIBLE);
        e7.setVisibility(View.INVISIBLE);
        e8.setVisibility(View.INVISIBLE);
        e9.setVisibility(View.INVISIBLE);
        e10.setVisibility(View.INVISIBLE);
        e11.setVisibility(View.INVISIBLE);
        e12.setVisibility(View.INVISIBLE);
        e13.setVisibility(View.INVISIBLE);
        e14.setVisibility(View.INVISIBLE);
        e15.setVisibility(View.INVISIBLE);
        e16.setVisibility(View.INVISIBLE);
        e17.setVisibility(View.INVISIBLE);
        e18.setVisibility(View.INVISIBLE);

        t1.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);

  //      String phone = clientphone.getText().toString();

        check1 = (CheckBox) findViewById(R.id.check1);
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check1.isChecked()) {
                    e1.setVisibility(View.VISIBLE);
                    e2.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                } else {
                    e1.setVisibility(View.INVISIBLE);
                    e2.setVisibility(View.INVISIBLE);
             //       t1.setVisibility(View.INVISIBLE);
             //       t2.setVisibility(View.INVISIBLE);
                    e1.setText("");
                    e2.setText("");
                }
            }
        });
        check2 = (CheckBox) findViewById(R.id.check2);
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check2.isChecked()) {
                    e3.setVisibility(View.VISIBLE);
                    e4.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                } else {
                    e3.setVisibility(View.INVISIBLE);
                    e4.setVisibility(View.INVISIBLE);
                 //   t1.setVisibility(View.INVISIBLE);
                //    t2.setVisibility(View.INVISIBLE);
                    e3.setText("");
                    e4.setText("");
                }
            }
        });
        check3 = (CheckBox) findViewById(R.id.check3);
        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check3.isChecked()) {
                    e5.setVisibility(View.VISIBLE);
                    e6.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                } else {
                    e5.setVisibility(View.INVISIBLE);
                    e6.setVisibility(View.INVISIBLE);
                    //   t1.setVisibility(View.INVISIBLE);
                    //    t2.setVisibility(View.INVISIBLE);
                    e5.setText("");
                    e6.setText("");
                }
            }
        });
        check4 = (CheckBox) findViewById(R.id.check4);
        check4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check4.isChecked()) {
                    e7.setVisibility(View.VISIBLE);
                    e8.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                } else {
                    e7.setVisibility(View.INVISIBLE);
                    e8.setVisibility(View.INVISIBLE);
                    //   t1.setVisibility(View.INVISIBLE);
                    //    t2.setVisibility(View.INVISIBLE);
                    e7.setText("");
                    e8.setText("");
                }
            }
        });
        check5 = (CheckBox) findViewById(R.id.check5);
        check5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check5.isChecked()) {
                    e9.setVisibility(View.VISIBLE);
                    e10.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                } else {
                    e9.setVisibility(View.INVISIBLE);
                    e10.setVisibility(View.INVISIBLE);
                    //   t1.setVisibility(View.INVISIBLE);
                    //    t2.setVisibility(View.INVISIBLE);
                    e9.setText("");
                    e10.setText("");
                }
            }
        });
        check6 = (CheckBox) findViewById(R.id.check6);
        check6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check6.isChecked()) {
                    e11.setVisibility(View.VISIBLE);
                    e12.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                } else {
                    e11.setVisibility(View.INVISIBLE);
                    e12.setVisibility(View.INVISIBLE);
                    //   t1.setVisibility(View.INVISIBLE);
                    //    t2.setVisibility(View.INVISIBLE);
                    e11.setText("");
                    e12.setText("");
                }
            }
        });
        check7 = (CheckBox) findViewById(R.id.check7);
        check7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check7.isChecked()) {
                    e13.setVisibility(View.VISIBLE);
                    e14.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                } else {
                    e13.setVisibility(View.INVISIBLE);
                    e14.setVisibility(View.INVISIBLE);
                    //   t1.setVisibility(View.INVISIBLE);
                    //    t2.setVisibility(View.INVISIBLE);
                    e13.setText("");
                    e14.setText("");
                }
            }
        });
        check8 = (CheckBox) findViewById(R.id.check8);
        check8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check8.isChecked()) {
                    e15.setVisibility(View.VISIBLE);
                    e16.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                } else {
                    e15.setVisibility(View.INVISIBLE);
                    e16.setVisibility(View.INVISIBLE);
                    //   t1.setVisibility(View.INVISIBLE);
                    //    t2.setVisibility(View.INVISIBLE);
                    e15.setText("");
                    e16.setText("");
                }
            }
        });
        check9 = (CheckBox) findViewById(R.id.check9);
        check9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check9.isChecked()) {
                    e17.setVisibility(View.VISIBLE);
                    e18.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                } else {
                    e17.setVisibility(View.INVISIBLE);
                    e18.setVisibility(View.INVISIBLE);
                    //   t1.setVisibility(View.INVISIBLE);
                    //    t2.setVisibility(View.INVISIBLE);
                    e17.setText("");
                    e18.setText("");
                }
            }
        });
        button = (Button) findViewById(R.id.submitnews);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String name = clientname.getText().toString();
                String phone = clientphone.getText().toString();
                String address = clientaddress.getText().toString().toLowerCase();
                String pattern = "^[789]\\d{9}$";

                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(getApplicationContext(), "Enter Name",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(getApplicationContext(), "Enter Phone Number",
                            Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    if (phone.matches(pattern)) {

                    } else {
                        Toast.makeText(getApplicationContext(), "Enter Valid Number",
                                Toast.LENGTH_SHORT).show();
                        return;
                    }
                }

                if (TextUtils.isEmpty(address)) {
                    Toast.makeText(getApplicationContext(), "Select Address",
                            Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    if (address.contains("kharghar")) {
                        //Show it is inside box 1
                    } else {
                        Toast.makeText(getApplicationContext(), "Only Kharghar Residents",
                                Toast.LENGTH_SHORT).show();
                        return;
                    }
                }

                if (check1.isChecked()) {
                    String bakchoy1 = e1.getText().toString();
                    String bakchoy2 = e2.getText().toString();

                    if (TextUtils.isEmpty(bakchoy1) && TextUtils.isEmpty(bakchoy2)) {
                        Toast.makeText(getApplicationContext(), "Enter Details of BAK CHOY",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(bakchoy1)) {
                        Toast.makeText(getApplicationContext(), "Enter Quantity for BAK CHOY ",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(bakchoy2)) {
                        Toast.makeText(getApplicationContext(), "Enter Repetition for BAK CHOY",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                }

                if (check2.isChecked()) {
                    String spinach1 = e3.getText().toString();
                    String spinach2 = e4.getText().toString();

                    if (TextUtils.isEmpty(spinach1) && TextUtils.isEmpty(spinach2)) {
                        Toast.makeText(getApplicationContext(), "Enter Details of SPINACH",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(spinach1)) {
                        Toast.makeText(getApplicationContext(), "Enter Quantity for SPINACH",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(spinach2)) {
                        Toast.makeText(getApplicationContext(), "Enter Repetition for SPINACH",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                }
                if (check3.isChecked()) {
                    String lettuce_lollo_rosso1 = e5.getText().toString();
                    String lettuce_lollo_rosso2 = e6.getText().toString();

                    if (TextUtils.isEmpty(lettuce_lollo_rosso1) && TextUtils.isEmpty(lettuce_lollo_rosso2)) {
                        Toast.makeText(getApplicationContext(), "Enter Details of LETTUCE LOLLO ROSSO",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(lettuce_lollo_rosso1)) {
                        Toast.makeText(getApplicationContext(), "Enter Quantity for LETTUCE LOLLO ROSSO",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(lettuce_lollo_rosso2)) {
                        Toast.makeText(getApplicationContext(), "Enter Repetition for LETTUCE LOLLO ROSSO",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                }

                if (check4.isChecked()) {
                    String lettuce_marvel_of_four_seasons1 = e7.getText().toString();
                    String lettuce_marvel_of_four_seasons2 = e8.getText().toString();

                    if (TextUtils.isEmpty(lettuce_marvel_of_four_seasons1) && TextUtils.isEmpty(lettuce_marvel_of_four_seasons2)) {
                        Toast.makeText(getApplicationContext(), "Enter Details of LETTUCE MARVEL OF FOUR " +
                                        "SEEASONS",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(lettuce_marvel_of_four_seasons1)) {
                        Toast.makeText(getApplicationContext(), "Enter Quantity for LETTUCE MARVEL OF FOUR " +
                                        "SEEASONS",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(lettuce_marvel_of_four_seasons2)) {
                        Toast.makeText(getApplicationContext(), "Enter Repetition for LETTUCE MARVEL OF FOUR " +
                                        "SEEASONS",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                }

                if (check5.isChecked()) {
                    String kale1 = e9.getText().toString();
                    String kale2 = e10.getText().toString();

                    if (TextUtils.isEmpty(kale1) && TextUtils.isEmpty(kale2)) {
                        Toast.makeText(getApplicationContext(), "Enter Details of KALE",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(kale1)) {
                        Toast.makeText(getApplicationContext(), "Enter Quantity for KALE",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(kale2)) {
                        Toast.makeText(getApplicationContext(), "Enter Repetition for KALE",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                }

                if (check6.isChecked()) {
                    String mustard_green1 = e11.getText().toString();
                    String mustard_green2 = e12.getText().toString();

                    if (TextUtils.isEmpty(mustard_green1) && TextUtils.isEmpty(mustard_green2)) {
                        Toast.makeText(getApplicationContext(), "Enter Details of MUSTARD GREEN",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(mustard_green1)) {
                        Toast.makeText(getApplicationContext(), "Enter Quantity for MUSTARD GREEN",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(mustard_green2)) {
                        Toast.makeText(getApplicationContext(), "Enter Repetition for MUSTARD GREEN",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                }

                if (check7.isChecked()) {
                    String beet_green1 = e13.getText().toString();
                    String beet_green2 = e14.getText().toString();

                    if (TextUtils.isEmpty(beet_green1) && TextUtils.isEmpty(beet_green2)) {
                        Toast.makeText(getApplicationContext(), "Enter Details of BEET GREEN",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(beet_green1)) {
                        Toast.makeText(getApplicationContext(), "Enter Quantity for BEET GREEN",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(beet_green2)) {
                        Toast.makeText(getApplicationContext(), "Enter Repetition for BEET GREEN",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                }

                if (check8.isChecked()) {
                    String swiss_Chard1 = e15.getText().toString();
                    String swiss_Chard2 = e16.getText().toString();

                    if (TextUtils.isEmpty(swiss_Chard1) && TextUtils.isEmpty(swiss_Chard2)) {
                        Toast.makeText(getApplicationContext(), "Enter Details of SWISS CHARD",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(swiss_Chard1)) {
                        Toast.makeText(getApplicationContext(), "Enter Quantity for SWISS CHARD",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(swiss_Chard2)) {
                        Toast.makeText(getApplicationContext(), "Enter Repetition for SWISS CHARD",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                }

                if (check9.isChecked()) {
                    String chienese_cabbage1 = e17.getText().toString();
                    String chienese_cabbage2 = e18.getText().toString();

                    if (TextUtils.isEmpty(chienese_cabbage1) && TextUtils.isEmpty(chienese_cabbage2)) {
                        Toast.makeText(getApplicationContext(), "Enter Details of CHIENESE CABBAGE",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(chienese_cabbage1)) {
                        Toast.makeText(getApplicationContext(), "Enter Quantity for CHIENESE CABBAGE",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {

                    }
                    if (TextUtils.isEmpty(chienese_cabbage2)) {
                        Toast.makeText(getApplicationContext(), "Enter Repetition for CHIENESE CABBAGE",
                                Toast.LENGTH_SHORT).show();
                        return;
                    }
                    else
                        {

                    }
                }
                else {
                    if (       TextUtils.isEmpty(e1.getText().toString())
                     //       || TextUtils.isEmpty(e3.getText().toString())
                     //       || TextUtils.isEmpty(e5.getText().toString())
                     //       || TextUtils.isEmpty(e7.getText().toString())
                     //       || TextUtils.isEmpty(e9.getText().toString())
                     //       || TextUtils.isEmpty(e11.getText().toString())
                     //       || TextUtils.isEmpty(e13.getText().toString())
                     //       || TextUtils.isEmpty(e15.getText().toString())
                     //       || TextUtils.isEmpty(e17.getText().toString())

                     )
                    {
                        Toast.makeText(getApplicationContext(), "Select first Vegetable",
                                Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                Snackbar snackbar = Snackbar.make(relativeLayout, "Select Vegetables", Snackbar.LENGTH_SHORT);
                snackbar.show();

                clientname.setText("");
                clientphone.setText("");
                clientaddress.setText("");

                Intent intent = new Intent(Kosish.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
