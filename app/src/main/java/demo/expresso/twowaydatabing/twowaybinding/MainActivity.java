package demo.expresso.twowaydatabing.twowaybinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import demo.expresso.twowaydatabing.R;
import demo.expresso.twowaydatabing.databinding.ActivityMainBinding;
import demo.expresso.twowaydatabing.twowaybinding.Contact;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contact contact=new Contact();
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setContact(contact);

        System.out.println("CheckBox is checked:"+contact.isChecked);
    }
}
