package com.batman.football;

import android.net.Uri;

/**
 * Created by batman on 2/8/17.
 */

public class Team {

  private int number;
  private String name;
  private Uri uri;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Uri getUri() {
    return uri;
  }

  public void setUri(Uri uri) {
    this.uri = uri;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
