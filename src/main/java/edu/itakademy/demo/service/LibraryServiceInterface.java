package edu.itakademy.demo.service;

import edu.itakademy.demo.entity.Library;
import edu.itakademy.demo.entity.dto.LibraryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LibraryServiceInterface {

    List<Library> getAll();

    Library getLibrary(Integer id);

    List<Library> getByName(String name);

    void deleteLibrary(Integer id);

    Library createLibrary(Library library);

    Library editLibrary(Integer id, LibraryDTO libraryDTO);
}
