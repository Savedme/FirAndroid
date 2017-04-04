package maruna_vasium.exerciseplanner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MakePlan extends AppCompatActivity {


    EditText input_hour;
    EditText input_min;
    Button button_FinishMakePlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_plan);

        button_FinishMakePlan = (Button) findViewById(R.id.button_FinishMakePlan);

        input_hour = (EditText)findViewById(R.id.input_hour);
        input_min = (EditText)findViewById(R.id.input_min);

        button_FinishMakePlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inPuthour = input_hour.getText().toString();
                String inPutmin = input_min.getText().toString();
            }
        });
    }
    public void choiceExercise(View view){

        Intent intent = new Intent(getApplicationContext(), ChooseExercise.class);
        startActivity(intent);
        finish();
    }

}
