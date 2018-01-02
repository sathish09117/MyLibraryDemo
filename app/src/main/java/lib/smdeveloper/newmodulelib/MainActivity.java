package lib.smdeveloper.newmodulelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lib.smdeveloper.mylibrarydemo.MyLibraryDemo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLibraryDemo.d("sm143");
    }
}
