package demo.expresso.twowaydatabing.databinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import demo.expresso.twowaydatabing.R;

public class OneWayBindingActivity extends AppCompatActivity {

    ActivityOnewaybindingBinding activityOnewaybindingBinding;
    BtnHandler btnHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Student student =new Student("Sarayu","sarayu264@gmail.com");
        btnHandler =new BtnHandler(this);
        activityOnewaybindingBinding = DataBindingUtil.setContentView(this,R.layout.activity_onewaybinding);
        activityOnewaybindingBinding.setStudent(student);
        activityOnewaybindingBinding.setBtnHandler(btnHandler);

    }


}
