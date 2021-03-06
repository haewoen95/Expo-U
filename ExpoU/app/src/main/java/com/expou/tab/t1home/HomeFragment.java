package com.expou.tab.t1home;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.expou.R;
import com.expou.activity.MainActivity;
import com.expou.util.SetFont;

/**
 * Created by Kim on 2015-07-02.
 */
public class HomeFragment extends Fragment {
    View rootView;

    TextView txt_plus_expo;
    TextView txt_plus_booth;
    TextView txt_plus_contents;

    public static Fragment newInstance() {
        Fragment fragment = new HomeFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_home,container,false);

        //frgment 폰트 설정
        SetFont.setGlobalFont(rootView.getContext(), rootView);

        txt_plus_expo = (TextView)rootView.findViewById(R.id.txt_plus_expo);
        txt_plus_expo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pager.setCurrentItem(1);
            }
        });

        txt_plus_booth = (TextView)rootView.findViewById(R.id.txt_plus_booth);
        txt_plus_booth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pager.setCurrentItem(2);
            }
        });

        txt_plus_contents = (TextView)rootView.findViewById(R.id.txt_plus_contents);
        txt_plus_contents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pager.setCurrentItem(3);
            }
        });

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}
