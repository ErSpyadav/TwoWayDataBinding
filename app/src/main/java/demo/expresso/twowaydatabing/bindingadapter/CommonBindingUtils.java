package demo.expresso.twowaydatabing.bindingadapter;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import androidx.databinding.BindingAdapter;

public class CommonBindingUtils {

    @BindingAdapter("profileImage")
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl).apply(new RequestOptions().circleCrop())
                .into(view);
    }


    @BindingAdapter("age")
    public static void setAge(TextView textView, String dob) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Calendar today = Calendar.getInstance();
            Calendar dobCal = Calendar.getInstance();
            dobCal.setTime(format.parse(dob));

            int age = today.get(Calendar.YEAR) - dobCal.get(Calendar.YEAR);
            if (today.get(Calendar.DAY_OF_YEAR) < dobCal.get(Calendar.DAY_OF_YEAR) && age > 0) {
                age--;
            }

            textView.setText(String.valueOf(age));
        } catch (Exception ignored) {
        }
    }

    @BindingAdapter("greetings")
    public static void setName(TextView view, String text) {
        view.setText("Welcome, " + text);
    }


}
