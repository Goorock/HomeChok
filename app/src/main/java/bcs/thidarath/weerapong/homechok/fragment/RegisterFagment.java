package bcs.thidarath.weerapong.homechok.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bcs.thidarath.weerapong.homechok.R;

/**
 * Created by Administrator on 12/9/2560.
 */

public class RegisterFagment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragmant_register,container,false);


        return view;
    }
} // Main class

