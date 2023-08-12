package com.jdriven;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;


public interface ProductRepository extends CrudRepository<Product, Integer>{

	/**
     * Find Product by title.
     *
     * @param title Title of the package
     * @return Optional of Product
     */
    Optional<Product> findByTitle(String title);
	
    /**
     * Find a list of products where the keywords contain the given keyword
     * @param Keywords
     * @return
     */
    List<Product> findByKeywordsContains(String keyword);
    
	@Override
    <S extends Product> S save(S s);

    @Override
    <S extends Product> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

    @Override
    @RestResource(exported = false)
    void delete(Product p);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Product> iterable);

    @Override
    @RestResource(exported = false)
    void deleteAll();

}
