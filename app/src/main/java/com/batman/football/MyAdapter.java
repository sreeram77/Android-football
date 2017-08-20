package com.batman.football;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by batman on 2/8/17.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
  private final Activity activity;
  private TeamCallback teamCallback;
  private List<Team> teams;

  public MyAdapter(Activity activity, List<Team> teams) {
    this.activity = activity;
    this.teams = teams;
  }

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    LayoutInflater inflater =
        (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    return new TeamView (inflater.inflate(R.layout.card, parent, false), activity);
  }

  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    ((TeamView) holder).setNumber(position + 1);
  }

  public List<String> getNames() {
    List<String> names = new ArrayList<>();
    return names;
  }

  @Override
  public int getItemCount() {
    return teams.size();
  }
}

