package com.ananth.designpatterns.solid.interface_segregation_principle.without_isp;

import java.util.List;

public interface IRepository<T extends Entity> {

   public void save(T entity);

   public void delete(T entity);

   public T findById(Long id);

    /**
     * this function is not required for OrderRepository class, so either can create new interface for order class(if use interface for multiple places) else remove it
     * */
   public List<T> findByName(String name);


}
