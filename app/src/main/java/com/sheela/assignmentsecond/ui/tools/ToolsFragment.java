package com.sheela.assignmentsecond.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.sheela.assignmentsecond.R;

public class ToolsFragment extends Fragment implements View.OnClickListener {

    private Button btnSwap;
    private EditText etFNo,etSNo;
   // private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        toolsViewModel =
//                ViewModelProviders.of(this).get(ToolsViewModel.class);
        View view = inflater.inflate(R.layout.fragment_tools, container, false);
        etFNo=view.findViewById(R.id.etFNo);
        etSNo=view.findViewById(R.id.etSNo);
        btnSwap=view.findViewById(R.id.btnSwap);
        btnSwap.setOnClickListener(this);
        return view;
//        final TextView textView = root.findViewById(R.id.text_tools);
//        toolsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }

    @Override
    public void onClick(View v) {
        int first,second;
        first= Integer.parseInt(etFNo.getText().toString());
        second=Integer.parseInt(etSNo.getText().toString());

        etFNo.setText(Integer.toString(second));
        etSNo.setText(Integer.toString(first));


    }
}