package at.kappw.vietnamesevocab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void startTest(View view) {
        Intent intent = new Intent(this, Train.class);
        startActivity(intent);
    }
}
