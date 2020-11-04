package com.example.albumProject.service;

import com.example.albumProject.model.Album;
import com.example.albumProject.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album getAlbum(int albumId) {
        return albumRepository.getAlbum(albumId);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.getAllAlbums();
    }

    public Album saveAlbum(Album album) {
        return albumRepository.saveAlbum(album);
    }

    public Album updateAlbum(int albumId, Album album) {
        return albumRepository.updateAlbum(albumId, album);
    }

    public Album deleteAlbum(int albumId) {
        return albumRepository.deleteAlbum(albumId);
    }
}
