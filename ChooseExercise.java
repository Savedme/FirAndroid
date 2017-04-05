package maruna_vasium.exerciseplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_exercise);
    }

    public void FinishSelectExercise(View view){

        Intent intent = new Intent(getApplicationContext(),MakePlan.class);
        startActivity(intent);
        finish();
    }
}
