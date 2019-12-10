package com.sheela.assignmentsecond.ui.gallery;

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

public class GalleryFragment extends Fragment implements View.OnClickListener {
    private Button btnPalindrome;
    private EditText etNo;


    //    private GalleryViewModel galleryViewModel;
//
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
  etNo=view.findViewById(R.id.etNo);
  btnPalindrome=view.findViewById(R.id.btnPalindrome);
  btnPalindrome.setOnClickListener(this);
        return view;

//
//        galleryViewModel =
//                ViewModelProviders.of(this).get(GalleryViewModel.class);
        // View view= inflater.inflate(R.layout.fragment_gallery, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        galleryViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }

    @Override
    public void onClick(View v) {
        int no= Integer.parseInt(etNo.getText().toString());
        Palindrome palindrome = new Palindrome();
        int result=palindrome.reverse(no);

        if(result ==no)
        {
            Toast.makeText(getActivity(),result +"is palindrome", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(getActivity(),result +"is not palindrome", Toast.LENGTH_SHORT).show();

        }

    }
}
