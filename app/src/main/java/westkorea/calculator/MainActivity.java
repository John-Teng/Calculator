package westkorea.calculator;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//Additional imports
import android.view.View; // Whenever you use widgets
import android.widget.Button; //Using buttons
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {



    public String sign = "";
    public Double tempDouble1, tempDouble2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED); //lock screen orientation
        //declares button objects 0-9 and .
        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        Button buttonDecimal = (Button)findViewById(R.id.buttonDecimal);

        //declares button arithmetic objects
        Button buttonP = (Button)findViewById(R.id.buttonP);
        Button buttonD = (Button)findViewById(R.id.buttonD);
        Button buttonM = (Button)findViewById(R.id.buttonM);
        Button buttonX = (Button)findViewById(R.id.buttonX);
        //Clear and equal and delete button objects
        Button buttonC = (Button)findViewById(R.id.buttonC);
        Button buttonE = (Button)findViewById(R.id.buttonE);
        Button buttonDEL = (Button)findViewById(R.id.buttonDEL);

        //Button 0 Event Handler
        button0.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("0");
                    }
                }

        );
        //Button 1 Event Handler
        button1.setOnClickListener(
                //Button 1 interface
                new Button.OnClickListener()
                {
                    //Button 1 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("1");
                    }
                }

        );
        //Button 2 Event Handler
        button2.setOnClickListener(
                //Button 2 interface
                new Button.OnClickListener()
                {
                    //Button 2 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("2");
                    }
                }

        );
        //Button 3 Event Handler
        button3.setOnClickListener(
                //Button 3 interface
                new Button.OnClickListener()
                {
                    //Button 3 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("3");
                    }
                }

        );
        //Button 4 Event Handler
        button4.setOnClickListener(
                //Button 4 interface
                new Button.OnClickListener()
                {
                    //Button 4 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("4");
                    }
                }

        );
        //Button 5 Event Handler
        button5.setOnClickListener(
                //Button 5 interface
                new Button.OnClickListener()
                {
                    //Button 5 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("5");
                    }
                }

        );
        //Button 6 Event Handler
        button6.setOnClickListener(
                //Button 6 interface
                new Button.OnClickListener()
                {
                    //Button 6 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("6");
                    }
                }

        );
        //Button 7 Event Handler
        button7.setOnClickListener(
                //Button 7 interface
                new Button.OnClickListener()
                {
                    //Button 7 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("7");
                    }
                }

        );
        //Button 8 Event Handler
        button8.setOnClickListener(
                //Button 8 interface
                new Button.OnClickListener()
                {
                    //Button 8 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("8");
                    }
                }

        );
        //Button 9 Event Handler
        button9.setOnClickListener(
                //Button 9 interface
                new Button.OnClickListener()
                {
                    //Button 9 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("9");
                    }
                }

        );
        //ButtonDecimal Event Handler
        buttonDecimal.setOnClickListener(
                //Button Decimal interface
                new Button.OnClickListener()
                {
                    //Button 9 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView) findViewById(R.id.editText);

                        String str = output.getText().toString();

                        if (str.indexOf('.') == -1)//if there currently is no decimal point already
                        {
                            output.append(".");
                        }
                    }
                }
        );


        //Button C Event Handler
        buttonC.setOnClickListener(
                //Button C interface
                new Button.OnClickListener()
                {
                    //Button C callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.setText("");
                    }
                }

        );
        //Button P (plus) Event Handler
        buttonP.setOnClickListener(
                //Button P interface
                new Button.OnClickListener()
                {
                    //Button P callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        String str = output.getText().toString();

                        if (str.length()>0) {
                            if (str.equals("."))

                                tempDouble1 = 0.0;
                            else
                                tempDouble1 = Double.parseDouble(output.getText().toString());

                            output.setText("");
                            sign = "+";
                        }
                    }
                }

        );
        //Button D (divide) Event Handler
        buttonD.setOnClickListener(
                //Button D interface
                new Button.OnClickListener()
                {
                    //Button D callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        String str = output.getText().toString();
                        if (str.length()>0) {
                            if (str.equals("."))

                                tempDouble1 = 0.0;
                            else
                                tempDouble1 = Double.parseDouble(output.getText().toString());

                            output.setText("");
                            sign = "/";
                        }
                    }
                }

        );
        //Button M (minus) Event Handler
        buttonM.setOnClickListener(
                //Button M interface
                new Button.OnClickListener()
                {
                    //Button M callback method
                    public void onClick (View v)
                    {

                        TextView output = (TextView)findViewById(R.id.editText);
                        String str = output.getText().toString();
                        if (str.length()>0) {
                            if (str.equals("."))
                                tempDouble1 = 0.0;
                            else
                                tempDouble1 = Double.parseDouble(output.getText().toString());

                            output.setText("");
                            sign = "-";
                        }
                    }

                }

        );
        //Button X (multiply) Event Handler
        buttonX.setOnClickListener(
                //Button M interface
                new Button.OnClickListener()
                {
                    //Button M callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        String str = output.getText().toString();
                        if (str.length()>0) {
                            if (str.equals("."))

                                tempDouble1 = 0.0;
                            else
                                tempDouble1 = Double.parseDouble(output.getText().toString());

                            output.setText("");
                            sign = "X";
                        }
                    }
                }

        );
        //ButtonE (equals) Event Handler
        buttonE.setOnClickListener (
                new Button.OnClickListener()
                {
                    public void onClick (View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        DecimalFormat round = new DecimalFormat("#.######");
                        round.setRoundingMode(RoundingMode.CEILING);
                        String str = output.getText().toString();
                        if (str.length() > 0) { //helps prevent NULL errors when there is no string in the display
                            if (str.equals("."))

                                tempDouble2 = 0.0;
                            else
                                tempDouble2 = Double.parseDouble(output.getText().toString());

                            if (sign == "+")
                            {
                                output.setText(round.format(tempDouble1 + tempDouble2));
                            }
                            else if (sign == "-")
                            {
                                output.setText(round.format(tempDouble1 - tempDouble2));
                            }
                            else if (sign == "X")
                            {
                                output.setText(round.format(tempDouble1 * tempDouble2));
                            }
                            else if (sign == "/")
                            {

                                if (tempDouble2 == 0)
                                {
                                    output.setText("");
                                    Context appContext = getApplicationContext();
                                    Toast message = Toast.makeText(appContext,"Cannot divide by zero", Toast.LENGTH_SHORT);
                                    message.show();
                                }
                                else
                                {
                                    output.setText(round.format(tempDouble1 / tempDouble2));
                                }
                            }
                            sign = ""; //reset the sign
                        }
                    }
                }
        );
        //Button DEL Event Handler
        buttonDEL.setOnClickListener(
                //Button DEL interface
                new Button.OnClickListener()
                {
                    //Button 6 callback method
                    public void onClick (View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        String str = output.getText().toString();
                        if (str.length()>0)
                        {
                            if (str.length()>1) {//checks to see if the second last character is a decimal point
                                char decimal = str.charAt(str.length() - 2);

                                if (decimal == '.') {   //if it is decimal point, delete the last decimal digit along with the point
                                    output.setText(str.substring(0, str.length() - 2));
                                }
                                else                    //otherwise just delete 1 digit at a time
                                {
                                    output.setText(str.substring(0, str.length() - 1));
                                }
                            }
                            else
                            {
                                output.setText(str.substring(0, str.length() - 1));
                            }
                        }

                    }
                }

        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
