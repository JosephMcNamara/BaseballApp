package com.example.android.baseballapp;/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.baseballapp.R;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    int balls = 0;
    int strikes = 0;
    int outs = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the balls by one.
     */
    public void addBall(View v) {
        balls = balls + 1;
        if (balls > 3) {
            return;
        }
        displayForBalls("Balls: " + balls);
    }

    /**
     * Increase the balls by one.
     */
    public void addStrike(View v) {
        strikes = strikes + 1;
        if (strikes > 3) {
            return;
        }
        displayForStrikes("Strikes: " + strikes);
    }

    /**
     * Increase the balls by one.
     */
    public void addOut(View v) {
        outs = outs + 1;
        if (outs > 3) {
            return;
        }
        displayForOuts("Outs: " + outs);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void resetCounts(View v) {
        balls = 0;
        strikes = 0;
        outs = 0;
        displayForBalls("Balls: " + balls);
        displayForStrikes("Strikes: " + strikes);
        displayForOuts("Outs: " + outs);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBalls(String score) {
        TextView scoreView = findViewById(R.id.balls);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForStrikes(String score) {
        TextView scoreView = findViewById(R.id.strikes);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForOuts(String score) {
        TextView scoreView = findViewById(R.id.outs);
        scoreView.setText(String.valueOf(score));
    }
}