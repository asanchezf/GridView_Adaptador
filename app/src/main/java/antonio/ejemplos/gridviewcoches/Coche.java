package antonio.ejemplos.gridviewcoches;

/**
 * Clase que representa la existencia de un Coche
 *
 * El arreglo ITEMS contiene 10 objetos coche de prueba que representarán el proveedor de datos para nuestro adaptador.
 El método getId() retorna el identificador hash de cada ítem con referencia al código. Más adelante veremos cuál es su utilidad.
 El método getItem() obtiene un ítem del arreglo basado en su código hash.
 *
 *
 */
public class Coche {
    private String nombre;
    private int idDrawable;

    public Coche(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static Coche[] ITEMS = {
            new Coche("Jaguar F-Type 2015", R.drawable.jaguar_f_type_2015),
            new Coche("Mercedes AMG-GT", R.drawable.mercedes_benz_amg_gt),
            new Coche("Mazda MX-5", R.drawable.mazda_mx5_2015),
            new Coche("Porsche 911 GTS", R.drawable.porsche_911_gts),
            new Coche("BMW Serie 6", R.drawable.bmw_serie6_cabrio_2015),
            new Coche("Ford Mondeo", R.drawable.ford_mondeo),
            new Coche("Volvo V60 Cross Country", R.drawable.volvo_v60_crosscountry),
            new Coche("Jaguar XE", R.drawable.jaguar_xe),
            new Coche("VW Golf R Variant", R.drawable.volkswagen_golf_r_variant_2015),
            new Coche("Seat León ST Cupra", R.drawable.seat_leon_st_cupra),

            new Coche("Atlético de Madrid", R.drawable.atletico),
            new Coche("Valencia F.C.", R.drawable.valencia),
            new Coche("Sevilla F.C.", R.drawable.sevilla),
            new Coche("Real Madrid F.C.", R.drawable.realmadrid),


    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Coche
     */
    public static Coche getItem(int id) {
        for (Coche item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
