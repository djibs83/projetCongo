package com.edugroupe.congo.dao;

import java.util.List;

public interface IDao <T> {
	  void save(T t);
	  T load(Long id);
	  void delete(Long id);
	  void update(T t);
	  List<T> loadAll();
	}
