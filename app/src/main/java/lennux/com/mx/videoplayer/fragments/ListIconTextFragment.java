package lennux.com.mx.videoplayer.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
//import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v4.app.Fragment;

import java.util.ArrayList;

import lennux.com.mx.videoplayer.R;
import lennux.com.mx.videoplayer.adapters.ArtistAdapter;
import lennux.com.mx.videoplayer.models.Artist;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListIconTextFragment.OnListIconFragmentCallbacks} interface
 * to handle interaction events.
 * Use the {@link ListIconTextFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListIconTextFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private ListView listIconText;
    private ArtistAdapter adapter;
    private ArrayList<Artist> artists;

    // TODO: Rename and change types of parameters
    private String nameCategory;

    private OnListIconFragmentCallbacks mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ListIconTextFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListIconTextFragment newInstance(String nameCategory) {
        ListIconTextFragment fragment = new ListIconTextFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, nameCategory);

        fragment.setArguments(args);
        return fragment;
    }

    public ListIconTextFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            nameCategory = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list_icon_text, container, false);

        listIconText = (ListView) view.findViewById(R.id.listIconText);



        artists = Artist.getArtists(getActivity(),nameCategory);
        adapter = new ArtistAdapter(getActivity(),R.layout.item_list_icon, artists);

        listIconText.setAdapter(adapter);

        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String nameCategory) {
        if (mListener != null) {
            mListener.onListCategorySelected(nameCategory);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnListIconFragmentCallbacks) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListIconFragmentCallbacks {

        public void onListCategorySelected(String nameCategory);
    }

}
