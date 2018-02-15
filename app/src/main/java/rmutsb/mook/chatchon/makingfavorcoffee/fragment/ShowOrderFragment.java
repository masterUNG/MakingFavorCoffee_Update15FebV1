package rmutsb.mook.chatchon.makingfavorcoffee.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rmutsb.mook.chatchon.makingfavorcoffee.R;

/**
 * Created by Acer on 4/1/2561.
 */

public class ShowOrderFragment extends Fragment{

    private String[] loginStrings;
    private String dateTimeString;

    public static ShowOrderFragment showOrderInstance(String[] loginStrings,
                                                      String dateTimeString) {

        ShowOrderFragment showOrderFragment = new ShowOrderFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("Login", loginStrings);
        bundle.putString("DateTime", dateTimeString);
        showOrderFragment.setArguments(bundle);
        return showOrderFragment;

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Get Value From Argument
        getValueFromArgument();

//        Show DateTime
        showDateTime();


    }   // Main Method

    private void showDateTime() {

        TextView textView = getView().findViewById(R.id.txtDateTime);
        textView.setText(dateTimeString);


    }

    private void getValueFromArgument() {
        loginStrings = getArguments().getStringArray("Login");
        dateTimeString = getArguments().getString("DateTime");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_order, container, false);
        return view;
    }   // onCreateView

}   // Main Class
