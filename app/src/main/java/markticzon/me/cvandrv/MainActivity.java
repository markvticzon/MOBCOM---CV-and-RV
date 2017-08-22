package markticzon.me.cvandrv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   /* TextView tvName;
    TextView tvAge;
    ImageView imgPhoto; */

   private List<Animal> animals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  setContentView(R.layout.cardview);

      /*  tvName = (TextView) findViewById(R.id.lblName);
        tvAge = (TextView) findViewById(R.id.lblAge);
        imgPhoto = (ImageView) findViewById(R.id.imgPhoto);

        tvName.setText("Brother Bear");
        tvAge.setText("23");
        imgPhoto.setImageResource(R.drawable.bear); */
        initializeData();
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        AnimalAdapter adapter = new AnimalAdapter(animals);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

    }

    private void initializeData(){
        animals = new ArrayList<>();
        animals.add(new Animal("Brother Bear", 23, R.drawable.bear));
        animals.add(new Animal("Grumpy Cat", 25, R.drawable.cat));
        animals.add(new Animal("Happy Dog", 35, R.drawable.dog));
    }
}
