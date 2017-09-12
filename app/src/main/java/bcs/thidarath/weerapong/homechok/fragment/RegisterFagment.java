package bcs.thidarath.weerapong.homechok.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bcs.thidarath.weerapong.homechok.MainActivity;
import bcs.thidarath.weerapong.homechok.R;

/**
 * Created by Administrator on 12/9/2560.
 */

public class RegisterFagment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmant_register, container, false);


        return view;
        //OnCreevied
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //ToolBar Controller
        toolBarController();


    } // onActivityCreate

    private void toolBarController() {
        Toolbar toolbar = getView().findViewById(R.id.tooberRegister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });


    }
} // Main class


