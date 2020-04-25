package demo.expresso.twowaydatabing.databinding;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import demo.expresso.twowaydatabing.R;
import demo.expresso.twowaydatabing.databinding.ActivityListernerBindBinding;

import android.view.View;

public class ListernerBindActivity extends AppCompatActivity {

    ActivityListernerBindBinding activityListernerBindBinding;
     Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listerner_bind);
        student =new Student("Sunita","sunita@gmail.com");
        activityListernerBindBinding = DataBindingUtil.setContentView(this,R.layout.activity_listerner_bind);
        activityListernerBindBinding.setStudent(student);

       // Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
