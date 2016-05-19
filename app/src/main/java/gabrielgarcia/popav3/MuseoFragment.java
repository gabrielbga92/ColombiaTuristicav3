package gabrielgarcia.popav3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseoFragment extends Fragment {

    private Button bMuseo;


    public MuseoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_museo, container,false);

        bMuseo = (Button) rootView.findViewById(R.id.bMuseo);
        bMuseo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int flag=9;

                Intent i = new Intent(MuseoFragment.this.getActivity(), MapsActivity.class);
                i.putExtra("key",flag);
                startActivity(i);

            }
        });
        return rootView;
    }

}
