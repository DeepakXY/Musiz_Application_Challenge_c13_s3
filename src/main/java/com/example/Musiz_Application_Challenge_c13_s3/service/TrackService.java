package com.example.Musiz_Application_Challenge_c13_s3.service;

import com.example.Musiz_Application_Challenge_c13_s3.domain.Track;

import java.util.List;

public interface TrackService {
    Track saveTrack(Track track);

    boolean deleteTrack(int trackid);

    List<Track> fetchAllTrack();

    List<Track> findByTrackartist1(String trackartist);

    List<Track> getTrackname1(String trackname);

    List<Track> findByTrackname1(String trackname);

    List<Track> findByTrackrating1(String trackrating);
}
