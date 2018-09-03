package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mbuttonTop;
    Button mbuttonBottom;
    TextView mstoryTextView;
    int indexOfStory;

    private storyLine[] storyText = new storyLine[]{
            new storyLine(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new storyLine(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new storyLine(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mbuttonTop = findViewById(R.id.buttonTop);
        mbuttonBottom = findViewById(R.id.buttonBottom);
        mstoryTextView = findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory1();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory2();
            }
        });

    }

    private void updateStory1(){

        if(indexOfStory == -1){
            finish();
        }

        if(indexOfStory == 3 || indexOfStory == 5){
            indexOfStory = -1;
            mstoryTextView.setText(R.string.T6_End);
            mbuttonTop.setText("Close App");
            mbuttonBottom.setText("Go back to the Start");
        }
        if(indexOfStory == 4){
            indexOfStory = 5;
            mstoryTextView.setText(storyText[2].getStory());
            mbuttonTop.setText(storyText[2].getAns1());
            mbuttonBottom.setText(storyText[2].getAns2());
        }
        if(indexOfStory ==0) {
            indexOfStory = 3;
            mstoryTextView.setText(storyText[2].getStory());
            mbuttonTop.setText(storyText[2].getAns1());
            mbuttonBottom.setText(storyText[2].getAns2());
        }
    }

    private void updateStory2(){

        if(indexOfStory == 0 ){
            indexOfStory = 4;
            mstoryTextView.setText(storyText[1].getStory());
            mbuttonTop.setText(storyText[1].getAns1());
            mbuttonBottom.setText(storyText[1].getAns2());
        }
        else if(indexOfStory == -1){
            mstoryTextView.setText(storyText[0].getStory());
            mbuttonTop.setText(storyText[0].getAns1());
            mbuttonBottom.setText(storyText[0].getAns2());
            indexOfStory = 0;
        }
        else if(indexOfStory == 3 || indexOfStory == 5){
            indexOfStory = -1;
            mstoryTextView.setText(R.string.T5_End);
            mbuttonTop.setText("Close App");
            mbuttonBottom.setText("Go back to the Start");
        }
        else if(indexOfStory == 4){
            indexOfStory = -1;
            mstoryTextView.setText(R.string.T4_End);
            mbuttonTop.setText("Close App");
            mbuttonBottom.setText("Go back to the Start");
        }
    }
}
