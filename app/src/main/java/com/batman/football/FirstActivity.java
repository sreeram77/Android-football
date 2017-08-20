package com.batman.football;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by batman on 3/8/17.
 */

public class FirstActivity extends AppCompatActivity {

  private TextView teamPlus;
  private TextView teamMinus;
  private TextView teamCounter;
  private TextView groupPlus;
  private TextView groupMinus;
  private TextView groupCounter;
  private int teamCount;
  private int groupCount;
  private Button okButton;
  private static String noOfTeams = "NoOfTeams";
  private static String noOfGroups = "NoOfGroups";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first);
    teamPlus = (TextView) findViewById(R.id.plus);
    groupPlus = (TextView) findViewById(R.id.group_plus);
    groupMinus = (TextView) findViewById(R.id.group_minus);
    groupCounter = (TextView) findViewById(R.id.group_count);
    okButton = (Button) findViewById(R.id.ok);
    teamMinus = (TextView) findViewById(R.id.minus);
    teamCounter = (TextView) findViewById(R.id.team_count);
    teamCounter.setText("2");
    teamCount = 2;
    groupCounter.setText("0");
    groupCount = 0;
    teamPlus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if(teamCount < 20) {
          teamCount++;
          teamCounter.setText(String.valueOf(teamCount));
        }
      }
    });
    teamMinus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if(teamCount > 2) {
          if(teamCount == groupCount) {
            groupCount--;
            groupCounter.setText(String.valueOf(groupCount));
          }
          teamCount--;
          teamCounter.setText(String.valueOf(teamCount));
        }
      }
    });
    groupPlus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if(groupCount < teamCount) {
          groupCount++;
          groupCounter.setText(String.valueOf(groupCount));
        }
      }
    });
    groupMinus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if(groupCount > 0) {
          groupCount--;
          groupCounter.setText(String.valueOf(groupCount));
        }
      }
    });
    okButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(FirstActivity.this, MainActivity.class);
        intent.putExtra(noOfTeams, teamCount);
        intent.putExtra(noOfGroups, groupCount);
        startActivity(intent);
      }
    });
  }
}
