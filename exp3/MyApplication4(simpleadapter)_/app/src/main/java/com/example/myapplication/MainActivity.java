package com.example.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.widget.Toast;
public class MainActivity extends Activity {

    private String[] names = new String[]{"Lion", "Tiger", "Monkey", "Dog", "Cat", "Elephant"};

    private int[] imageIds = new int[]{R.drawable.lion,

            R.drawable.tiger, R.drawable.monkey, R.drawable.dog, R.drawable.cat, R.drawable.elephant};

    private ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Map<String, Object>> listems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listem = new HashMap<String, Object>();
            listem.put("header", imageIds[i]);
            listem.put("name", names[i]);
            listems.add(listem);
        }
        SimpleAdapter simplead = new SimpleAdapter(this, listems,
                R.layout.simple, new String[]{"name", "header"},
                new int[]{R.id.name,R.id.header});

        mylist = (ListView) findViewById(R.id.mylist);
        mylist.setAdapter(simplead);

        mylist.setAdapter(simplead);

        // 为ListView的列表项的单击事件绑定事件监听器



        mylist.setOnItemClickListener((parent, view, position, id) -> {

            Toast.makeText(MainActivity.this,names[position],Toast.LENGTH_SHORT).show();

        });
    }
}
