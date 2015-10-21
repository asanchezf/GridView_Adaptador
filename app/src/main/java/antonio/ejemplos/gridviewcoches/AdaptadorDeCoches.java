package antonio.ejemplos.gridviewcoches;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;



/**
 * {@link BaseAdapter} para poblar coches en un grid view
 * Se ha utilizado la libreria glide para optimizar la app
 */

public class AdaptadorDeCoches extends BaseAdapter {
    private Context context;

    public AdaptadorDeCoches(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Coche.ITEMS.length;
    }

    @Override
    public Coche getItem(int position) {
        return Coche.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenCoche = (ImageView) view.findViewById(R.id.imagen_coche);
        TextView nombreCoche = (TextView) view.findViewById(R.id.nombre_coche);

        final Coche item = getItem(position);


        //Optimización con la librería glide
        Glide.with(imagenCoche.getContext())
                .load(item.getIdDrawable())
                .into(imagenCoche);

        nombreCoche.setText(item.getNombre());

        return view;
    }

}