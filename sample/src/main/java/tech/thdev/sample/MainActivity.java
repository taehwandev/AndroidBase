package tech.thdev.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;

import tech.thdev.base.util.ActivityUtilKt;
import tech.thdev.base.view.BaseActivity;
import tech.thdev.sample.presenter.MainPresenter;

/**
 * Created by Tae-hwan on 9/1/16.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = new MainFragment();
        ActivityUtilKt.replaceContentFragment(this, R.id.frame_layout, mainFragment);

        new MainPresenter().attachView(mainFragment);
    }
}
