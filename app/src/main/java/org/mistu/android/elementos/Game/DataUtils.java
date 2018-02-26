package org.mistu.android.elementos.Game;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.Menu;


import org.mistu.android.elementos.R;

import java.util.ArrayList;

/**
 * Created by kedee on 24/12/16.
 */

public final class DataUtils {

    public static String getElementByAtomicNumber(int value) {
        String[] array = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca","Sc"};
        Log.i("GOT THE REQUEST ", value+" ");
        return array[value-1];
    }



}
