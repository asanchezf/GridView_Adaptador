package antonio.ejemplos.gridviewcoches;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import com.bumptech.glide.Glide;


import android.R.layout;
import android.R.drawable;

/**
 * Actividad que muestra la imagen del item extendida
 */
public class ActividadDetalle extends AppCompatActivity {

    public static final String EXTRA_PARAM_ID = "com.herprogramacion.coches2015.extra.ID";
    public static final String VIEW_NAME_HEADER_IMAGE = "imagen_compartida";
    private Coche itemDetallado;
    private ImageView imagenExtendida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_detalle);

        usarToolbar();

        // Obtener el coche con el identificador establecido en la actividad principal
        itemDetallado = Coche.getItem(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));


        imagenExtendida = (ImageView) findViewById(R.id.imagen_extendida);


        //if (itemDetallado.getNombre() == "Real Madrid F.C.") {
        if (itemDetallado.getIdDrawable() == (R.drawable.realmadrid)) {
            //itemDetallado.getIdDrawable()=(R.drawable.pozilga);
            //imagenExtendida.getDrawable();
            imagenExtendida.setImageResource(R.drawable.pozilga);

        }
        //else if(itemDetallado.getNombre() == "Sevilla F.C."){
        else if (itemDetallado.getIdDrawable() == (R.drawable.sevilla)) {
            imagenExtendida.setImageResource(R.drawable.camposevilla);


        } else if (itemDetallado.getIdDrawable() == (R.drawable.atletico)) {
            imagenExtendida.setImageResource(R.drawable.campoatletico);
        }

        //else if (itemDetallado.getNombre() == "Valencia F.C."){

        else if (itemDetallado.getIdDrawable() == (R.drawable.valencia)) {
            imagenExtendida.setImageResource(R.drawable.mestalla);
        } else {

            cargarImagenExtendida();
        }

    }

    private void cargarImagenExtendida() {
        Glide.with(imagenExtendida.getContext())
                .load(itemDetallado.getIdDrawable())
                .into(imagenExtendida);
    }


    private void usarToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}