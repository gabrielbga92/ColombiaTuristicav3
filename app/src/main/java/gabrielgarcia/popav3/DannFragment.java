package gabrielgarcia.popav3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class DannFragment extends Fragment {

    private Button bDann;


    public DannFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dann, container,false);

        bDann = (Button) rootView.findViewById(R.id.bDann);
        bDann.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int flag = 1;

                Intent i = new Intent(DannFragment.this.getActivity(), MapsActivity.class);
                i.putExtra("key",flag);
                startActivity(i);

            }
        });
        return rootView;
    }

}
