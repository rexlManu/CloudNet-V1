package de.dytanic.cloudnet.lib.threading;

/**
 * Created by Tareko on 24.05.2017.
 */
public interface Callback<C> {

    void call(C value);

}
