package com.batman.football;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private RecyclerView recyclerView;
  private RecyclerView.Adapter adapter;
  private RecyclerView.LayoutManager layoutManager;
  private TeamCallback teamCallback;

  private static String noOfTeams = "NoOfTeams";
  private static String noOfGroups = "NoOfGroups";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    Intent intent = getIntent();
    int teamCount = intent.getIntExtra(noOfTeams, 2);
    int groupCount = intent.getIntExtra(noOfGroups, 0);
    List<Team> teams = new ArrayList<>();
    for (int i = 0; i < teamCount; i++) {
      Team team = new Team();
      team.setNumber(i + 1);
      teams.add(team);
    }
    adapter = new MyAdapter(this, teams);
    recyclerView.setAdapter(adapter);
  }
}
