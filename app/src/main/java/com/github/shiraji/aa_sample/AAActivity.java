package com.github.shiraji.aa_sample;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.aaactivity_layout)
public class AAActivity extends AppCompatActivity {
    @ViewById(R.id.textView)
    TextView mTextView;

    @Background(delay = 2000)
    void doInBackgroundAfterTwoSeconds() {
        logTextView();
    }

    @UiThread(delay = 1000)
    void doInUiThread() {
        mTextView.setText(R.string.changed);
    }

    @AfterViews
    void afterInject() {
        logTextView();

        doInBackgroundAfterTwoSeconds();
        doInUiThread();
    }

    private void logTextView() {
        Log.i("AAActivity", "TextView: " + mTextView.getText());
    }
}
