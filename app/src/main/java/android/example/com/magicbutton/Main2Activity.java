package android.example.com.magicbutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private Button bPriority, bAll, bSpam;

    private ListView lvPriority, lvAll, lvSpam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bPriority = (Button) findViewById(R.id.bPriority);
        bAll = (Button) findViewById(R.id.bAll);
        bSpam = (Button) findViewById(R.id.bSpam);

        lvPriority = (ListView) findViewById(R.id.lvPriority);
        lvAll = (ListView) findViewById(R.id.lvAll);
        lvSpam = (ListView) findViewById(R.id.lvSpam);

        lvPriority.setVisibility(View.GONE);
        lvAll.setVisibility(View.GONE);
        lvSpam.setVisibility(View.GONE);

        bPriority.setBackgroundColor(Color.parseColor("#FFFFFF"));
        bAll.setBackgroundColor(Color.parseColor("#FFFFFF"));
        bSpam.setBackgroundColor(Color.parseColor("#FFFFFF"));

        ////////////////////////////////////////////////////////////////////////

        String[] sPriority = new String[] {
                "Priority 0",
                "Priority 1", "Priority 2", "Priority 3", "Priority 4", "Priority 5"
        };

        final List<String> pList = new ArrayList<String>(Arrays.asList(sPriority));

        final ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, pList);

        lvPriority.setAdapter(arrayAdapter1);

        ////////////////////////

        String[] sAll = new String[] {
                "All 0",
                "All 1", "All 2", "All 3", "All 4", "All 5"
        };

        final List<String> aList = new ArrayList<String>(Arrays.asList(sAll));

        final ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, aList);

        lvAll.setAdapter(arrayAdapter2);

        ////////////////////////

        String[] sSpam = new String[] {
                "Spam 0",
                "Spam 1", "Spam 2", "Spam 3", "Spam 4", "Spam 5"
        };

        final List<String> sList = new ArrayList<String>(Arrays.asList(sSpam));

        final ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, sList);

        lvSpam.setAdapter(arrayAdapter3);

        ////////////////////////////////////////////////////////////////////////

        bPriority.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lvPriority.setVisibility(View.VISIBLE);
                lvAll.setVisibility(View.GONE);
                lvSpam.setVisibility(View.GONE);

                bPriority.setTextColor(Color.parseColor("#243e8c"));
                bPriority.setBackgroundColor(Color.parseColor("#FFFFFF"));
                bAll.setBackgroundColor(Color.parseColor("#243e8c"));
                bSpam.setBackgroundColor(Color.parseColor("#243e8c"));
                bAll.setTextColor(Color.parseColor("#FFFFFF"));
                bSpam.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });

        bAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lvAll.setVisibility(View.VISIBLE);
                lvPriority.setVisibility(View.GONE);
                lvSpam.setVisibility(View.GONE);

                bAll.setTextColor(Color.parseColor("#243e8c"));
                bAll.setBackgroundColor(Color.parseColor("#FFFFFF"));
                bPriority.setBackgroundColor(Color.parseColor("#243e8c"));
                bSpam.setBackgroundColor(Color.parseColor("#243e8c"));
                bPriority.setTextColor(Color.parseColor("#FFFFFF"));
                bSpam.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });

        bSpam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lvSpam.setVisibility(View.VISIBLE);
                lvPriority.setVisibility(View.GONE);
                lvAll.setVisibility(View.GONE);

                bSpam.setTextColor(Color.parseColor("#243e8c"));
                bSpam.setBackgroundColor(Color.parseColor("#FFFFFF"));
                bPriority.setBackgroundColor(Color.parseColor("#243e8c"));
                bAll.setBackgroundColor(Color.parseColor("#243e8c"));
                bAll.setTextColor(Color.parseColor("#FFFFFF"));
                bPriority.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
    }
}
