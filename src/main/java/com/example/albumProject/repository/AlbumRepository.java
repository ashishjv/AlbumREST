package com.example.albumProject.repository;

import com.example.albumProject.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    private List<Album> albumList = new ArrayList<>();
    private int uniqueID = 0;

    public Album getAlbum(int albumId) {
        if(!albumList.isEmpty()){
            for(Album tempAlbum:albumList){
                if(tempAlbum.getAlbumId()==albumId){
                    return tempAlbum;
                }
            }
        }
        return null;
    }

    public List<Album> getAllAlbums() {
        if(!albumList.isEmpty()){
            return albumList;
        }
        return null;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(++uniqueID);
        albumList.add(album);
        return album;
    }

    public Album updateAlbum(int albumId, Album album) {
        if(!albumList.isEmpty()){
            for(Album tempAlbum:albumList){
                if(tempAlbum.getAlbumId()==albumId){
                    tempAlbum.setName(album.getName());
                    tempAlbum.setDescription(album.getDescription());
                    tempAlbum.setCoverPicUrl(album.getCoverPicUrl());
                    return tempAlbum;
                }
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        if(!albumList.isEmpty()){
            for(Album tempAlbum:albumList){
                if(tempAlbum.getAlbumId()==albumId){
                    deletedAlbum = tempAlbum;
                    albumList.remove(tempAlbum);
                }
            }
        }
        return deletedAlbum;
    }
}
