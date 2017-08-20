package com.batman.football;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private RecyclerView recyclerView;
  private MyAdapter adapter;
  private RecyclerView.LayoutManager layoutManager;
  private TeamCallback teamCallback;
  private Button button;

  private static String noOfTeams = "NoOfTeams";
  private static String noOfGroups = "NoOfGroups";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    layoutManager = new LinearLayoutManager(this);
    button = (Button) findViewById(R.id.ok);
    recyclerView.setLayoutManager(layoutManager);
    Intent intent = getIntent();
    final int teamCount = intent.getIntExtra(noOfTeams, 2);
    int groupCount = intent.getIntExtra(noOfGroups, 0);
    List<Team> teams = new ArrayList<>();
    for (int i = 0; i < teamCount; i++) {
      Team team = new Team();
      team.setNumber(i + 1);
      teams.add(team);
    }
    adapter = new MyAdapter(this, teams);
    recyclerView.setAdapter(adapter);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        for(int i = 0; i < teamCount; i++) {
          adapter.getNames();
        }
      }
    });
  }
}
