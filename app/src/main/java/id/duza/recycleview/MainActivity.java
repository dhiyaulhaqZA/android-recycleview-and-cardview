package id.duza.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.duza.recycleview.adapter.SimpleAdapter;
import id.duza.recycleview.model.Notes;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Notes> notesList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycleView = (RecyclerView) findViewById(R.id.recycleView);
        mRecycleView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecycleView.setLayoutManager(mLayoutManager);

        for (int i = 0; i < 10; i++) {
            notesList.add(new Notes("Ngerjain Tugas Jaringan",
                    "Ngerjain jurnal tugas yang ada di drive", "22 Sep 2016", "09:30 AM"));
        }
        adapter = new SimpleAdapter(notesList);

        mRecycleView.setAdapter(adapter);

    }
}
