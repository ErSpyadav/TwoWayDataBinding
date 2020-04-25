package demo.expresso.twowaydatabing.bindingadapter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import demo.expresso.twowaydatabing.R;
import demo.expresso.twowaydatabing.databinding.ActivityAdapterBinding;

public class BindingAdapterActivity extends AppCompatActivity {

    ActivityAdapterBinding activityAdapterBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_adapter);

        DataHolder holder =new DataHolder("Sarayu","Kariwadih","https://homepages.cae.wisc.edu/~ece533/images/cat.png","15-02-1992");
        activityAdapterBinding = DataBindingUtil.setContentView(this,R.layout.activity_adapter);
        activityAdapterBinding.setHolder(holder);

    }
}
