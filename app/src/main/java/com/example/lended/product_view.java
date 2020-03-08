package com.example.lended;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class product_view extends AppCompatActivity {
    private ImageView prodImg;
    private TextView ItemName;
    private TextView PostingTime;
    private Button MakeOffer;
    private Button message;
    private TextView textView5;
    private TextView textView6;
    private TextView Brand;
    private TextView Description;
    private TextView Availability;
    private TextView RentalDuration;
    private CalendarView calendarView;
    private Button Borrow;
    private TextView Price;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_view);

        prodImg = (ImageView)findViewById(R.id.prodImg);
        ItemName = (TextView)findViewById(R.id.ItemName);
        PostingTime = (TextView)findViewById(R.id.Postingtime);
        MakeOffer = (Button)findViewById(R.id.MakeOffer);
        message = (Button)findViewById(R.id.message);
        textView5 = (TextView)findViewById(R.id.textView5);
        textView6 = (TextView)findViewById(R.id.textView6);
        Brand = (TextView)findViewById(R.id.Brand);
        Description = (TextView)findViewById(R.id.Description);
        Availability = (TextView)findViewById(R.id.Availability);
        RentalDuration = (TextView)findViewById(R.id.RentalDuration);
        calendarView = (CalendarView)findViewById(R.id.calendarView);
        Borrow = (Button)findViewById(R.id.Borrow);
        Price = *

        //GET INFO FROM DATABASE
        ItemName.setText("Tester Item");
        PostingTime.setText("Posted 5 hours ago");

        //LoginButton.setOnClickListener(new View.OnClickListener(
        MakeOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
