package com.sheela.assignmentsecond.ui.home;

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

public class HomeFragment extends Fragment  implements View.OnClickListener

{
    private Button btnArea;
    private EditText etNo;


//    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

  // homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
 View view= inflater.inflate(R.layout.fragment_home, container, false);
 btnArea= view.findViewById(R.id.btnArea);
 etNo= view.findViewById(R.id.etNo);
 btnArea.setOnClickListener(this);
 return view;
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
//    }

    }

    @Override
    public void onClick(View v) {
        int no= Integer.parseInt(etNo.getText().toString());
        float area= 3.14f *no*no;
        Toast.makeText(getActivity(),"Area of circle:"+ area, Toast.LENGTH_SHORT).show();
    }
}
//}