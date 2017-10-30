package wen.xiao.com.mvvm.viewControl;

import android.databinding.ObservableField;
import android.text.TextUtils;
import android.view.View;

import wen.xiao.com.mvvm.viewModel.User;
import wen.xiao.com.mvvm.viewModel.useben;

/**
 * Created by Administrator on 2017/10/30.
 */

public class ActivityCtrl {
    public ObservableField<String> bank  = new ObservableField<>();
    public ObservableField<String> et  = new ObservableField<>();
    private User user;
    public ActivityCtrl(){
        bank.set("默认值");
        user=new User();
    }

    public  void but_onclick(final View view){
        if (TextUtils.isEmpty(et.get())){
            bank.set("数据为null");
        }else
        bank.set(et.get());

    }
    public  void but_onclick_two(final View view){
        useben useben=new useben("第二种设置","第二种设置");
        user.setFirstName(useben.getFirstName());
        user.setLastName(useben.getLastName());
    }

    public User getUser(){
        return  user;
    }
}
