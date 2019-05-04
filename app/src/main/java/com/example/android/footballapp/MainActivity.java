package com.example.android.footballapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /***
     * initializing the points of both teams
     */

    public int vikings_points = 0;
    public int patriots_points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * adding 6 points for both team for a touchdown
     */
    public void touchdownVikings(View v) {
        vikings_points = vikings_points + 6;
        displayForVikings(vikings_points);
    }

    public void touchdownPatriots(View v) {
        patriots_points = patriots_points + 6;
        displayForPatriots(patriots_points);
    }

    /**
     * adding 3 points for both team for Field goal
     */
    public void field_goal_Vk(View v) {
        vikings_points = vikings_points + 3;
        displayForVikings(vikings_points);
    }

    public void field_goal_PT(View v) {
        patriots_points = patriots_points + 3;
        displayForPatriots(patriots_points);
    }

    /**
     * adding 1 points for both team for extra point
     */
    public void extra_point_VK(View v) {
        vikings_points = vikings_points + 1;
        displayForVikings(vikings_points);
    }

    public void extra_point_PT(View v) {
        patriots_points = patriots_points + 1;
        displayForPatriots(patriots_points);
    }

    /**
     * adding 2 points for both team for defensive point
     */
    public void defensive_point_VK(View v) {
        vikings_points = vikings_points + 2;
        displayForVikings(vikings_points);
    }

    public void defensive_point_PT(View v) {
        patriots_points = patriots_points + 2;
        displayForPatriots(patriots_points);
    }

    /**
     * reset both team goal to 0
     */
    public void reset_point(View V) {
        patriots_points = 0;
        vikings_points = 0;
        displayForVikings(vikings_points);
        displayForPatriots(patriots_points);
    }

    /**
     * Displays the given score for the Vikings.
     */
    public void displayForVikings(int score) {
        TextView scoreView = (TextView) findViewById(R.id.vikings_Score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for the Patriots.
     */
    public void displayForPatriots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.patriots_score);
        scoreView.setText(String.valueOf(score));
    }
}
