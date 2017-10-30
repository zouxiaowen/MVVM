package wen.xiao.com.mvvm;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wen.xiao.com.mvvm.databinding.ActivityMainBinding;
import wen.xiao.com.mvvm.viewControl.ActivityCtrl;
import wen.xiao.com.mvvm.viewModel.useben;

public class ActivityAct extends AppCompatActivity {
    private ActivityCtrl activityCtrl;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityCtrl=new ActivityCtrl();
        binding.setActivityCtrl(activityCtrl);
    }
}
