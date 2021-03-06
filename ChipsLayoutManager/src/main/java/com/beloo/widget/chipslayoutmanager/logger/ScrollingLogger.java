package com.beloo.widget.chipslayoutmanager.logger;

import android.util.Log;

import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

public class ScrollingLogger implements IScrollingLogger {
    @Override
    public void logChildCount(int childCount) {
        Log.d("scroll", "child count = " + childCount);
    }

    @Override
    public void logUpScrollingNormalizationDistance(int distance) {
        Log.d("scrollUp", "distance = " + distance);
    }

    @Override
    public void logAnchorView(AnchorViewState anchorViewState) {

    }
}
