package com.example.ubuntu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.erina1, R.drawable.erina2, R.drawable.erina3, R.drawable.erina4,
            R.drawable.erina5, R.drawable.erina6, R.drawable.erina7, R.drawable.erina8,
            R.drawable.erina9, R.drawable.erina10, R.drawable.erina11, R.drawable.erina12,
            R.drawable.erina13, R.drawable.erina14, R.drawable.erina15, R.drawable.erina16,
            R.drawable.erina17, R.drawable.erina18, R.drawable.erina19, R.drawable.erina20};
    String[] NAMES = {"Erina1", "Erina2", "Erina3", "Erina4", "Erina5", "Erina6", "Erina7",
            "Erina8", "Erina9", "Erina10", "Erina11", "Erina12", "Erina13", "Erina14", "Erina15",
    "Erina16", "Erina17", "Erina18", "Erina19", "Erina20"};

    String[] DECRIPTIONS = {"Japanese idol Mano Erina", "Japanese idol Mano Erina",
            "Japanese idol Mano Erina", "Japanese idol Mano Erina", "Japanese idol Mano Erina",
            "Japanese idol Mano Erina", "Japanese idol Mano Erina", "Japanese idol Mano Erina",
            "Japanese idol Mano Erina", "Japanese idol Mano Erina", "Japanese idol Mano Erina",
            "Japanese idol Mano Erina", "Japanese idol Mano Erina", "Japanese idol Mano Erina",
            "Japanese idol Mano Erina", "Japanese idol Mano Erina", "Japanese idol Mano Erina",
            "Japanese idol Mano Erina", "Japanese idol Mano Erina", "Japanese idol Mano Erina"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_main);
        ListView ListView = (ListView)findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        ListView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {

            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {

            return null;
        }

        @Override
        public long getItemId(int i) {

            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (view == null){

                view = View.inflate(getApplicationContext(), R.layout.customlayout, null);
            }

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DECRIPTIONS[i]);


            return view;
        }
        
    }
}
