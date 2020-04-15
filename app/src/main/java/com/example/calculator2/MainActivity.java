package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] nameOptionList = new String[]{
            "Calculator",
            "Standard",
            "Scientific",
            "Programmer",
            "Date Calculation",
            "Converter",
            "Currency",
            "Volume",
            "Length",
            "Weight and Mass",
            "Temperature",
            "Energy",
            "Area",
            "Speed",
            "Time",
            "Power",
            "Data",
            "Pressure",
            "Angle",
            "About"
    };

    int[] avaOption = new int[]{
            R.drawable.standard,
            R.drawable.scientific,
            R.drawable.programmer,
            R.drawable.ic_date,
            R.drawable.currency,
            R.drawable.volume,
            R.drawable.length,
            R.drawable.weight,
            R.drawable.temperature,
            R.drawable.energy,
            R.drawable.area,
            R.drawable.speed,
            R.drawable.ic_time,
            R.drawable.power,
            R.drawable.data,
            R.drawable.meter,
            R.drawable.angle,
            R.drawable.about,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);
    }

    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return avaOption.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.layout_item,null);
            ImageView imageView = view.findViewById(R.id.img_view);
            TextView textView = view.findViewById(R.id.text_view);

            imageView.setImageResource(avaOption[position]);
            textView.setText(nameOptionList[position]);

            return view;
        }
    }
}
