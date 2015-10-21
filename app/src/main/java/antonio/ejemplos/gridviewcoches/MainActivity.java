package antonio.ejemplos.gridviewcoches;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private GridView gridView;
    private AdaptadorDeCoches adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usarToolbar();

        gridView = (GridView) findViewById(R.id.grid);
        adaptador = new AdaptadorDeCoches(this);
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
    }

    private void usarToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Coche item = (Coche) parent.getItemAtPosition(position);


        if (position < 10) {

            Intent intent = new Intent(this, ActividadDetalle.class);
            intent.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());


            //Si es Lollipood aplicamos transiciones...
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                ActivityOptionsCompat activityOptions =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                this,
                                new Pair<View, String>(view.findViewById(R.id.imagen_coche),
                                        ActividadDetalle.VIEW_NAME_HEADER_IMAGE)
                        );

                ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
            } else
                startActivity(intent);


        }
        //id>11
        else {

            switch (position) {
                //item.getNombre()
                case 10:

                    Intent intent10 = new Intent(this, ActividadDetalle.class);
                    intent10.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
                    startActivity(intent10);
                    break;


                case 11:

                    Intent intent11 = new Intent(this, ActividadDetalle.class);
                    intent11.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
                    startActivity(intent11);
                    break;


                case 12:

                    Intent intent12 = new Intent(this, ActividadDetalle.class);
                    intent12.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
                    startActivity(intent12);
                    break;


                case 13:

                    Intent intent13 = new Intent(this, ActividadDetalle.class);
                    intent13.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
                    startActivity(intent13);
                    break;


                case 14:

                    Intent intent14 = new Intent(this, ActividadDetalle.class);
                    intent14.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
                    startActivity(intent14);
                    break;

            }


        }


    }
}