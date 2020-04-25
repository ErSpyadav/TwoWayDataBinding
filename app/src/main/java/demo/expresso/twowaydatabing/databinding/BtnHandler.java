package demo.expresso.twowaydatabing.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class BtnHandler {
Context context;
    public BtnHandler(Context context) {
        this.context=context;
    }

    public void onBtnClick(View view){
        Toast.makeText(context,"Btn is clicke",Toast.LENGTH_LONG).show();
    }

    public void onCancelClick(View view){
        Toast.makeText(context,"Cancelled Btn is clicked",Toast.LENGTH_LONG).show();
    }
}
