package com.batman.football;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by batman on 20/8/17.
 */

public class TeamView extends RecyclerView.ViewHolder implements TeamCallback {
  private ImageView imageView;
  private EditText editText;

  public TeamView(View itemView, final Activity activity) {
    super(itemView);
    imageView = (ImageView) itemView.findViewById(R.id.image);
    editText = (EditText) itemView.findViewById(R.id.info_text);
    imageView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(activity, R.string.app_name, Toast.LENGTH_SHORT).show();
      }
    });
  }

  @Override
  public String getNames() {
    return null;
  }
}
