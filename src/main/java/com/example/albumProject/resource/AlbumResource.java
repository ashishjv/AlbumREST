package com.example.albumProject.resource;

import com.example.albumProject.model.Album;
import com.example.albumProject.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/album")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/{albumId}")
    public Album getAlbum(@PathVariable("albumId") int albumId){
        return albumService.getAlbum(albumId);
    }

    @GetMapping()
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @PostMapping()
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @PutMapping("/{albumId}")
    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album album){
        return albumService.updateAlbum(albumId,album);
    }

    @DeleteMapping()
    public Album deleteAlbum(@RequestParam(name = "albumId") int albumId){
        return albumService.deleteAlbum(albumId);
    }
}
