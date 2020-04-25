package demo.expresso.twowaydatabing.twowaybinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class Contact extends BaseObservable {
    public String id;
    public String name;
    public String password;
    public boolean isChecked;

//    public Contact(String name, String password) {
//        this.name = name;
//        this.password = password;
//    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public boolean isChecked() {
        return isChecked;
    }

}
