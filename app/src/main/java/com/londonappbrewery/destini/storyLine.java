package com.londonappbrewery.destini;

public class storyLine {
    private int mStory;
    private int mAns1;
    private int mAns2;

    public storyLine(int story, int ans1, int ans2){
        mStory = story;
        mAns1 = ans1;
        mAns2 = ans2;
    }
    public int getStory() {
        return mStory;
    }

    public void setStory(int story) {
        this.mStory = story;
    }

    public int getAns1() {
        return mAns1;
    }

    public void setAns1(int ans1) {
        this.mAns1 = ans1;
    }

    public int getAns2() {
        return mAns2;
    }

    public void setAns2(int ans2) {
        this.mAns2 = ans2;
    }



}
