package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import java.lang.String;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0,scoreB=0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFreeThrowA(View v) {
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    public void display2PointsA(View v) {
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void display3PointsA(View v) {
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void displayFreeThrowB(View v) {
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void display2PointsB(View v) {
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void display3PointsB(View v) {
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void reset(View v) {
        scoreA=0;scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
