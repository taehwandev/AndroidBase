package tech.thdev.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

import butterknife.BindView;
import tech.thdev.sample.presenter.MainContract;
import tech.thdev.base.view.BaseFragment;

/**
 * Created by Tae-hwan on 9/1/16.
 */

public class MainFragment extends BaseFragment<MainContract.Presenter> implements MainContract.View {

    @BindView(R.id.textView)
    TextView textView;

    @Override
    public int getLayout() {
        return R.layout.fragment_main;
    }

    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
