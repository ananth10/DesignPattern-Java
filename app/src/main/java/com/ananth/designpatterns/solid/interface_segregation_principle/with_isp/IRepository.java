package com.ananth.designpatterns.solid.interface_segregation_principle.with_isp;

import java.util.List;

public interface IRepository<T extends Entity> {

   public void save(T entity);

   public void delete(T entity);

   public T findById(Long id);

}
