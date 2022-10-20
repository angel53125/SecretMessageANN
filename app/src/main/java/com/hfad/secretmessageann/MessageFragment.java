package com.hfad.secretmessageann;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

//import androidx.navigation.findNavController;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MessageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        Button btnNext = view.findViewById(R.id.btn_next);
        TextView messageView = view.findViewById(R.id.etv_message);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                String msg = messageView.getText().toString();
                MessageFragmentDirections.ActionMessageFragmentToEncryptFragment action =
                        MessageFragmentDirections.actionMessageFragmentToEncryptFragment(msg);
                Navigation.findNavController(view).navigate(action);
            }
        });
        return view;
    }
}