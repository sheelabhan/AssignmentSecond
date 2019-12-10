package com.sheela.assignmentsecond.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.sheela.assignmentsecond.R;

public class SlideshowFragment extends Fragment implements View.OnClickListener {
    private Button btnMorphicNum;

    private EditText etNo;

//    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        slideshowViewModel =
//                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);
        etNo=view.findViewById(R.id.etNo);

        btnMorphicNum=view.findViewById(R.id.btnMorphicNum);
        btnMorphicNum.setOnClickListener(this);
        return view;
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        slideshowViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        int a,square,counter=1;
        int n= Integer.parseInt(etNo.getText().toString());
        a=n;
        square=n*n;
        while(n!=0){
            counter=counter*10;
            n=n/10;

        }
if(square%counter==a){
    Toast.makeText(getActivity(),a +"is automorphic", Toast.LENGTH_SHORT).show();

}
else{
    Toast.makeText(getActivity(),a +"is not automorphic", Toast.LENGTH_SHORT).show();
}
    }
}