package lennux.com.mx.videoplayer.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import lennux.com.mx.videoplayer.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link VideoPlayerFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link VideoPlayerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideoPlayerFragment extends Fragment {

    private final String TAG = "VideoPlayerFragment";

    private VideoView myVideo;

    //String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
    //String vidAddress = "https://drive.google.com/open?id=0B698tIvnz95WMV9na3pDaUpEQzg&authuser=0.mp4";
    String vidAddress = "http://mobintum.com/video/John%20Newman%20-%20Love%20Me%20Again.mp4";
    //String vidAddress = "https://www.dropbox.com/s/8fg3f7sefy57ktg/video_gnp.mp4";
    Uri vidUri = Uri.parse(vidAddress);
    private static final String ARG_PARAM1 = "param1";


    // TODO: Rename and change types of parameters
    private int position;


    private OnFragmentInteractionListener mListener;

    public static VideoPlayerFragment newInstance(int param1) {
        VideoPlayerFragment fragment = new VideoPlayerFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    public VideoPlayerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video_player, container, false);

        myVideo = (VideoView) view.findViewById(R.id.myVideo);
        myVideo.setVideoURI(vidUri);
        //myVideo.start();

        MediaController vidControl = new MediaController(getActivity());
        vidControl.setAnchorView(myVideo);
        myVideo.setMediaController(vidControl);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}