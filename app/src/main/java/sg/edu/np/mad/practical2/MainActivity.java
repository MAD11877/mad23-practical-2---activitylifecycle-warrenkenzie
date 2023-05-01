package sg.edu.np.mad.practical2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MainActivity extends AppCompatActivity {
List<User> userList = new ArrayList<User>();
    final String TAG = "Main activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG,"OnCreate");
        User user = new User(21,false);
        userList.add(user);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "on Start!!");
        Log.v(TAG, String.valueOf(userList.get(0).followed));
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Do something when ToggleButton is checked
                    userList.get(0).followed = true;
                } else {
                    // Do something when ToggleButton is unchecked
                    userList.get(0).followed = false;
                }
            }
        });
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG, "on Pause!!");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG, "on Stop!!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG, "Destroy!!");
    }
}