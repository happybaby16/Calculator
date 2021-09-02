package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button num1,num2,num3,num4,num5,num6,num7,num8, num9, num0, plus, minus, multiply,share,clear, res;
    private TextView first_num, second_num, text_view_res;
    private boolean first_num_null;
    private String move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.button_1);
        num2 = findViewById(R.id.button_2);
        num3 = findViewById(R.id.button_3);
        num4 = findViewById(R.id.button_4);
        num5 = findViewById(R.id.button_5);
        num6 = findViewById(R.id.button_6);
        num7 = findViewById(R.id.button_7);
        num8 = findViewById(R.id.button_8);
        num9 = findViewById(R.id.button_9);
        num0 = findViewById(R.id.button_0);
        plus = findViewById(R.id.button_plus);
        minus = findViewById(R.id.button_minus);
        multiply = findViewById(R.id.button_multiply);
        share = findViewById(R.id.button_share);
        clear = findViewById(R.id.button_clear);
        res = findViewById(R.id.button_res);
        first_num = findViewById(R.id.first_num);
        second_num= findViewById(R.id.second_num);
        text_view_res=findViewById(R.id.text_view_res);
        first_num_null = true;





        num1.setOnClickListener(this::ClickNumButton);
        num2.setOnClickListener(this::ClickNumButton);
        num3.setOnClickListener(this::ClickNumButton);
        num4.setOnClickListener(this::ClickNumButton);
        num5.setOnClickListener(this::ClickNumButton);
        num6.setOnClickListener(this::ClickNumButton);
        num7.setOnClickListener(this::ClickNumButton);
        num8.setOnClickListener(this::ClickNumButton);
        num9.setOnClickListener(this::ClickNumButton);
        num0.setOnClickListener(this::ClickNumButton);

        plus.setOnClickListener(this::SelectMove);
        minus.setOnClickListener(this::SelectMove);
        share.setOnClickListener(this::SelectMove);
        multiply.setOnClickListener(this::SelectMove);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (move)
                {
                    case "plus":
                        text_view_res.setText(String.valueOf(Integer.parseInt(first_num.getText().toString())+Integer.parseInt(second_num.getText().toString())));
                        break;
                    case "minus":
                        text_view_res.setText(String.valueOf(Integer.parseInt(first_num.getText().toString())-Integer.parseInt(second_num.getText().toString())));
                        break;
                    case "share":
                        text_view_res.setText(String.valueOf(Double.parseDouble(first_num.getText().toString())/Double.parseDouble(second_num.getText().toString())));
                        break;
                    case "multiply":
                        text_view_res.setText(String.valueOf(Integer.parseInt(first_num.getText().toString())*Integer.parseInt(second_num.getText().toString())));
                        break;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText("");
                second_num.setText("");
                move = null;
                first_num_null=true;
                text_view_res.setText("");
            }
        });

    }


    public void ClickNumButton(View v)
    {
        switch (v.getId())
        {
            case R.id.button_1:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"1");
                }
                else
                {
                    second_num.setText(second_num.getText()+"1");
                }
                break;

            case R.id.button_2:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"2");
                }
                else
                {
                    second_num.setText(second_num.getText()+"2");
                }
                break;
            case R.id.button_3:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"3");
                }
                else
                {
                    second_num.setText(second_num.getText()+"3");
                }
                break;
            case R.id.button_4:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"4");
                }
                else
                {
                    second_num.setText(second_num.getText()+"4");
                }
                break;
            case R.id.button_5:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"5");
                }
                else
                {
                    second_num.setText(second_num.getText()+"5");
                }
                break;
            case R.id.button_6:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"6");
                }
                else
                {
                    second_num.setText(second_num.getText()+"6");
                }
                break;
            case R.id.button_7:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"7");
                }
                else
                {
                    second_num.setText(second_num.getText()+"7");
                }
                break;
            case R.id.button_8:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"8");
                }
                else
                {
                    second_num.setText(second_num.getText()+"8");
                }
                break;
            case R.id.button_9:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"9");
                }
                else
                {
                    second_num.setText(second_num.getText()+"9");
                }
                break;
            case R.id.button_0:
                if(first_num_null==true)
                {
                    first_num.setText(first_num.getText()+"0");
                }
                else
                {
                    second_num.setText(second_num.getText()+"0");
                }
                break;
        }

    }


    public void SelectMove(View v)
    {
        first_num_null = false;
        switch (v.getId())
        {
            case R.id.button_plus:
                move = "plus";
                break;
            case R.id.button_minus:
                move = "minus";
                break;
            case R.id.button_multiply:
                move = "multiply";
                break;
            case R.id.button_share:
                move = "share";
                break;

        }
    }





}


