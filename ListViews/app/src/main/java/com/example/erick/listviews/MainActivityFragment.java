package com.example.erick.listviews;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View ventana = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<String> Fechas = new ArrayList<String>();

        Fechas.add("Lunes 01 de febrero del 2016");
        Fechas.add("martes 02 de febrero del 2016");
        Fechas.add("miercoles 03 de febrero del 2016");
        Fechas.add("viernes 04 de febrero del 2016");
        Fechas.add("sabado 05 de febrero del 2016");
        Fechas.add("domingo 06 de febrero del 2016");
        Fechas.add("Lunes 07 de febrero del 2016");
        Fechas.add("martes 08 de febrero del 2016");
        Fechas.add("miesrcoles 09 de febrero del 2016");
        Fechas.add("jueves 10 de febrero del 2016");

        ArrayAdapter<String> arrAdapter = new ArrayAdapter <String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textView,
                Fechas
        );
        ListView lista = (ListView)ventana.findViewById(R.id.listView_forecast);
        lista.setAdapter(arrAdapter);
        return ventana;
    }
}
