package net.akhyar.indonesia;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * @author akhyar
 */
public class BaseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application.inject(this);
    }
}
