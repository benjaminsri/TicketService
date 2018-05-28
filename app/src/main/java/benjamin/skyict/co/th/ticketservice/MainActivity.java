package benjamin.skyict.co.th.ticketservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import benjamin.skyict.co.th.ticketservice.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment
        if (savedInstanceState == null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMainFranment, new MainFragment())
                    .commit();

        }


    }   // Main Method

}   // Class
