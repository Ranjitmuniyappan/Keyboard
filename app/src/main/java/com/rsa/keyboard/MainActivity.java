package com.rsa.keyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {

    TextView txt_message;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;
    String text_message="";
    int count=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button10=(Button)findViewById(R.id.button10);
        button11=(Button)findViewById(R.id.button11);
        button12=(Button)findViewById(R.id.button12);
        txt_message=(TextView)findViewById(R.id.txt_message);




        txt_message.setText("");

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb= new StringBuffer(text_message);
                sb.deleteCharAt(sb.length()-1);
                text_message= String.valueOf(sb);
                txt_message.setText(text_message);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { ".", ",", "!"};


            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1200) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { "A", "B", "C"};

            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1200) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { "D", "E", "F"};

            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1200) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { "G", "H", "I"};

            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1200) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { "J", "K", "L"};

            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1500) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { "M", "N", "O"};

            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1200) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { "P", "Q", "R", "S"};

            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1200) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { "T", "U", "V"};

            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1200) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { "W", "X", "Y", "Z"};

            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1200) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {

            private long lastClick = -1;
            private int count;
            private String[] value = { "*", "#","₹"};

            @Override
            public void onClick(View v) {
                long now = System.currentTimeMillis();
                if (now - lastClick <1200) {
                    count++;
                    if (count >= value.length) {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                if (now - lastClick <1200) {
                    StringBuffer sb= new StringBuffer(text_message);
                    sb.deleteCharAt(sb.length()-1);
                    text_message= String.valueOf(sb);
                }
                text_message=text_message+value[count];
                txt_message.setText(text_message);
                lastClick = System.currentTimeMillis();
            }
        });


        button11.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                text_message=text_message+" ";
                txt_message.setText(text_message);
            }
        });

    }
}

